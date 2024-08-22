

public class Runner {


    private Double timeTofinish;
    private String name;
    public Runner(Double timeTofinish, String name) {
        this.timeTofinish = timeTofinish;
        this.name = name;
    }
    
    public Double getTimeTofinish() {
        return timeTofinish;
    }


    public String getName(){
        return this.name;
    }
    
}


 class Factory {

    public static Runner makeRunner(Double time, String name){
        return new Runner(time, name);
    }

}


class Parent {

    private int anInt;

    private int getAnInt() {
        return anInt * new Child().getDd();
    }

    class Child {

        private int dd;

        public int getDd() {
            return dd * getAnInt();
        }
    }



}
