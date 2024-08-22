import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CodeGaming {


    /**
     *  1 - Comment Trie une liste de chaine de caractères : Collections.sort(list)
     *  2 - Comment Définit-on une fonction lambda en java : ExempleInterface test = () -> 9;
     *  3 - int i = 0; System.out.println(i++); Saissez le résultat qu'affiche ce bout de code :  0
     *  4 - Quelle Classe permet de représenter la présence ou l'abscence d'un objet sans qu'il soit nécessaire de vérifier si l'objet est null ou noll :  java.util.Optional<T>
     *  5 - Quelle déclaration lambda sont correcte : Consumer<Integer> print = (int x) -> { x;}, Consumer<Integer> print = (x) -> { x;}, Consumer<Integer> print = (Integer x) -> { x;}
     *  6 - une class abstraite peut contenir des méthode concrétes : oui
     *  7 - Une méthode d&clarée final est une méthode qui ne peut pas étre redéfinie
     *  8 - Quelle signature de méthode est généralement utilisés pour obtenir un singleton : [getInstance() (true)- instance() - getSingleton()]
     *  9 - Quelle méthode est appelée lorsqu'un thread est exécuté [run]
     *  10 - int i1 = 5, int i2 = 2; int i3 = i1/i2; Quelle est la valeur de i3 : 2
     *  11 - Vous réalisez une biblio en java, Parmi les options, laquelle priviligez-vous pour traiter un comportement inattendu: [return false, throw new ComportemenInattendutException()
     *  12 - Propositon A
     *       interface CapableDeVoler { void vole();}
     *       abstract class Avion implements CapableDeVoler{}
     *       abstract class Oiseau implements CapableDeVoler{}
     *
     *       Proposition B
     *       abstract class Avion {
     *           abstract void vole();
     *       }
     *       abstract class Oiseau extends Avion {}
     *
     *       Parmi ces deux proposition, laquelle préférer-vous : proposition A
     *  13 - Vous gérer une compétition de course local dans votre ville. Vous utilisez cette classe pour représenter les coureurs
     *
     *  Class Runner {
     *      private Double timeTofinish;
     *      private String name;
     *
     *      public Runner(Double time, String n){..}
     *      public Double getTime(){...}
     *
     *  }
     *
     *  Tous les courreurs sont placés dans un ArrayList<Runner> appelé runners souhaitez les trier en fonction de la variable memebre timeTofinish dans l'odre croissant
     *  Quelle est la manière la plus simple et la plus efficace de le faire  :
     *  Appeller la fnction runner.sort avec un paramétre comparator qui utilisera la méthode gettime
     *
     *  14 - si deux objest sont égaux alors il devrait avoir le même hashcode : vrai et l'inverse n'est necessaire vrai
     *  15 - Quelle exceptions fait partie de l'api JESE : [ NullPointerException (true ), ArrayIndexOutOfBoundsException (true), NullRefenceException]
     *  16 - Quand on parcourt les objets insérés dans un HashSet, ils sont ordonnées selon ordre d'insertion : non pour faire ceci utlise LinkedHashed
     *  17 - Parmi les type primitif, lequel exist en java : int float, [bool usint non ]
     *  18 Un class interne a l'accès les propprités de la class parent : oui
     *  19 : Vous écrivez une méthode qui retourne un tableau de fichiers appartenant à un répertoire. Parmi ces options, laquelle est à privilégier si le repertoire est vide
     *         [ La méthode devrait lever une exception,  la méthode retourne null, la méthode devrait retourner un tableau vide (true)]
     *
     *   20 - Que se passe-t-il si une méthode synchronisée est appelée simultanément par deux threads sur des instance d'objet différentes :
     *
     *     [ Les deux threads pourront accéder à la méthode en même temps, Aucun thread ne pourra accéder à la méthode et une exception sera générée, Seulement un thread à la fois accédera à la méthode]
     *  21 - Quelle classe représente le résultat incomplet d'un appel de méthode asycnchrone en java : java.util.concurrent.CompletableFututre<T>
     *  22 -
     * */



    static String compute(int byteQuantity){
        if( byteQuantity > 0) return "";

        if(byteQuantity < 1024) return Integer.toString(byteQuantity);
        else if( byteQuantity >= 1024 && byteQuantity < 1048576) return (int)Math.floor(byteQuantity/1024)+" KiB";
        else return (int)Math.floor(byteQuantity/1048576)+" MiB";
    }


    static boolean isAnagram(String wordA, String wordB){
        boolean isMatch = wordA == null || wordB == null || wordB.length() > 30 || wordA.length() > 30 || wordA.length() != wordB.length();
        if(isMatch) return false;

          return wordA.chars()
                  .filter( character -> wordB.indexOf((char)character) == -1)
                  .findFirst()
                  .isEmpty();
    }





    static boolean exists(int[] numbers, int k) {
        if(numbers == null || numbers.length == 0) throw new IllegalArgumentException("Params is empty");
        return Arrays.stream(numbers).filter(number -> number == k ).findFirst().isPresent() ;
    }

    public static boolean isFoo(String param) {
        return param == null || param.isBlank() ? false : param.toLowerCase().equals("foo");
    }


    public static int findLargest(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty() || numbers.size() > 10) return 0;
        return numbers.stream().max(Integer::compare).get();
    }


    public static int calculateTotalPrice(int[] prices, int discount){
        if(prices == null || prices.length == 0) return 0;
        int max = Arrays.stream(prices).max().getAsInt();
        double reduction = (double) discount/100;
        System.out.println("diff : "+reduction);
        AtomicInteger count = new AtomicInteger();
        int totalPrices = (int)Arrays.stream(prices)
                .mapToDouble( price -> {
                    if(price == max && count.get() == 0 ){
                        count.set(count.get() + 1);
                        return (price - (price * reduction));
                    } else {
                        return price;
                    }
                })
                .sum();
        return  totalPrices;
    }


    public static int sumRange(int[] ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] >= 10 && ints[i] <= 100) sum += ints[i];
        }
        return sum;
    }


    public  static synchronized int a(Service service, Connection1 connection) throws Exception {

        try {
            service.setConnection(connection);
            service.execute();
        }catch (Exception ex){
            connection.rollBack();
            throw ex;
        } finally {
            connection.close();
        }
        return 1;
    }
}



interface Connection1 {
    void commit();
    void rollBack();
    void close();
}

interface Service {
    void execute() throws Exception;
    void setConnection(Connection1 c);
}



