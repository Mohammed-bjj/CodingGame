import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Printer {



    public static String printerError(String s) {
        
        return (s == null || s.isEmpty()) ?  null : s.toLowerCase().chars()
           .filter( c -> c < 'a' || c > 'm')
           .count() +"/"+ s.length();                
    }


    public static boolean solution(String str, String ending) {
    
        return str.substring(str.length() - ending.length(), str.length()).equals(ending);
      
    }


    public static String createPhoneNumber(int[] numbers)  {

        if( numbers == null || numbers.length == 0) return null;
            
        return Arrays.stream(numbers)
            .anyMatch(n -> (n < 0 || n > 9)) ? null : String.format("(%d%d%d) %d%d%d-%d%d%d%d",
            numbers[0], numbers[1], numbers[2],
            numbers[3], numbers[4], numbers[5],
            numbers[6], numbers[7], numbers[8], numbers[9]) ;
      }


      public static int makeNegative(final int x) {
    
        return x < 0 ? x : -x; 
        
      }


      public static int summation(int n) {
        if(n < 0) return 0;
        return IntStream.range(0, n + 1).sum();
    }


      public static String findNeedle(Object[] haystack) {
        // Your code here

        if(haystack == null || haystack.length == 0) return null;
        return IntStream.range(0, haystack.length) 
        .filter( i -> ((Object)haystack[i]).equals("needle" ))
        .mapToObj( index -> "found the "+haystack[index]+" at position "+index)
        .collect(Collectors.joining(" "));
       }


       public static int grow(int[] x){
        if(x == null || x.length == 0) return 0;
        return IntStream.of(x).reduce(1, (a,b) -> a * b);
       }
      


       public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" :  "Odd";
       }


       public static int countSheeps(Boolean[] arrayOfSheeps) {
        if(arrayOfSheeps == null || arrayOfSheeps.length == 0) return 0;

        return Math.toIntExact(Arrays.stream(arrayOfSheeps)
        .filter( sheep -> sheep == true)
        .count());
      }


      public static int[] digitize(long n) {
        // Code here
        return Long.toString(n)
                 .chars()
                 .map( c -> c - '0')
                 .sorted()
                 .toArray();
      }


      public static String greet(String name) {
        return (name == null || name.trim().isEmpty()) ? null : String.format("Hello, %s how are you doing today?", name.trim());
      }



      public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        if(classPoints == null || classPoints.length == 0) return true;
        int sum = Arrays.stream(classPoints).sum();
        return  (sum / classPoints.length) <= yourPoints;
      }


      public static String remove(String str) {
        if( str == null || str.trim().isEmpty()) return null;
        return str.substring(1, str.length() - 1);
      }


      public static int sum(int[] numbers){

        if(numbers == null | numbers.length == 0) return 0;
        
        int max = Arrays.stream(numbers).max().orElseThrow();
        int min = Arrays.stream(numbers).min().orElseThrow();
        int sum = Arrays.stream(numbers).sum();
        
        return sum - (max + min);
      }


      public static String fakeBin(String numberString) {
        
        if(numberString == null || numberString.trim().isEmpty() ) return null;
      
        return numberString.chars()
                        .map( n -> Character.getNumericValue(n) < 5 ? '0': '1')
                        .mapToObj(c -> String.valueOf((char)c))
                        .collect(Collectors.joining());
      }


      public static int stringToNumber(String str) {
        if(str == null || str.isEmpty()) return 0;
        return Integer.parseInt(str);
      }


      public static int[] countBy(int x, int n){
        // Your code here
        return IntStream.range(1, n+1).map( i ->  x * i).toArray();
      }

    public static boolean isPalindrome(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("Input data is null or empty");
        }
        int i = 0;
        int j = str.length() -1;

        while( i < j ){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    enum ObjectC {
        ROCK("rock"),
        SCISSORS("scissors"),
        PAER("paper");

        private String obj;

        ObjectC(String string) {
          this.obj = string;
        }


        public String getObj() {
            return obj;
        }

      }
      public static String rps(String p1, String p2) {
        if(p1.equals(p2)) return "Draw!";

        boolean AllCasePlayer1won = (p1.equals(ObjectC.ROCK.getObj()) && p2.equals(ObjectC.SCISSORS.getObj())) ||
                                    (p1.equals(ObjectC.SCISSORS.getObj()) && p2.equals(ObjectC.PAER.getObj())) ||
                                    (p1.equals(ObjectC.PAER.getObj()) && p2.equals(ObjectC.ROCK.getObj())) ;


        return  AllCasePlayer1won ? "Player 1 won!" : "Player 2 won!";
      }



      public static String bmi(double weight, double height) {
       
        double bmi = (weight/(height * height));
        if(bmi <= 18.5) return "Underweight";
        else if( bmi <= 25) return "Normal";
        else if(bmi <= 30) return "Overweight";
        else return  "Obese";
      }


    public static int expressionsMatter(int a, int b, int c){
        List<Integer> sums = Arrays.asList((a+b+c), (a*b*c), a*(b+c), c*(a+b), c*(a+b) );
        return sums.stream().max(Comparator.naturalOrder()).orElse(0);
    }



    public static double logs(double x, double a, double b) {
        return  (Math.log(a) + Math.log(b))/Math.log(x);
    }


    public static int sumOfDifferences(int[] arr) {
        int[] arrSorted = Arrays.stream(arr)
                .sorted()
                .map(i -> -i)// Trie dans l'ordre croissant
                .toArray();

        return  IntStream.range(0, arr.length - 1)
                .reduce( 0, (sum, i) -> sum + (arrSorted[i] - arrSorted[i+1]) );
    }



    public static Optional<Double> calculeAverage(List<Integer> list){
        return Optional.ofNullable(list)
                .filter( seq -> !seq.isEmpty())
                .flatMap( seq -> {
                    OptionalDouble avg = seq.stream().mapToInt(Integer::intValue).average();
                    return avg.isPresent() ? Optional.of(avg.getAsDouble()) : Optional.empty();
                });
    }


    public static Integer getMinvalueOfTemperature(int[] temperatures){
        if(temperatures == null || temperatures.length == 0) throw new IllegalArgumentException(" Input variable is empty");

        int min = temperatures[0];
        for(Integer value : temperatures){
            if (Math.abs(value) < Math.abs(min)) {
                    min = value;
            } else if(Math.abs(value) == Math.abs(min)){
                min = value >= 0 || min >= 0 ? Math.abs(min) : -Math.abs(min);
            }
        }
        return min;
    }


    public static void test(String str){
        if(str == null || str.length() == 0) throw new IllegalArgumentException("");

        int size = 0;
        String [] str1 = str.split(" ");
        for(String word: str1){
            if(word.length() >= 5){
                size++;
            }
        }

        List<Integer> list = Arrays.asList(1,2,0);
        Collections.sort(list);
    }



    public static boolean isFoo(String param){

      if(param == null || param.length() == 0) return false;

      return param.equals("foo") ? true : false;

    }


    public static Integer findLargest(List<Integer> numbers) {
      if(numbers == null || numbers.isEmpty()) return 0;
      return numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
    }


    public static int sumRange(int[] ints){
      if(ints == null || ints.length == 0) return 0;
      return Arrays.stream(ints).filter( n -> n >= 10 && n <= 100 ).sum();
    }


    public static int calculeTotalPrice(int[] prices, int discount){
      if(prices == null || prices.length == 0) return 0;
      
      int max = Arrays.stream(prices)
                        .max()
                        .getAsInt();
      int totalprice = Arrays.stream(prices)
                              .map( n -> n == max ? ( n - (n * discount /100 )): n)
                              .sum();
      return totalprice;
    }



    
        
}
