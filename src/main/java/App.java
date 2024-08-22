import com.sun.tools.javac.Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;


public class App {

    static class A {
        private String hello(){ return "A" ;}
        public String world() { return "A";}
    }

    static class B extends A{
        private String hello(){ return "B" ;}
        public String world() { return "B";}
    }

    public static void main(String[] args) {

        int i =1, j = 0;
        try {
            if(i/j > 1){
                i++;
            }
        }catch (ArithmeticException e){
            System.out.println(0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(1);
        }catch (Exception e){
            System.out.println(2);
        }finally {
            System.out.println(3);
        }
        System.out.println(4);


    }

    public static void printNumber(int n){
        System.out.println(n);
    }

    public static String compute(int bytesQuantity){
        if(bytesQuantity >= 1000000000) return null;
        if(bytesQuantity < 1024) return Integer.toString(bytesQuantity);
        else if(bytesQuantity >= 1024 && bytesQuantity < 1048576) return (int)Math.floor( bytesQuantity / 1024)+" KiB";
        else return (int)Math.floor( bytesQuantity / 1048576)+" MiB";
    }




    public static boolean exist(int[] ints, int k ){
        if(ints == null || ints.length == 0) return false;
        int middle = ints.length / 2;
        System.out.println("middle : "+ints[middle]);
        
        if(ints[middle] <= k){
            System.out.println(" ici ");
            for(int i = middle; i < ints.length; i++){
                if(ints[i] == k) return true;
            }
        } else {
            System.out.println("hello ");
            for(int i = 0; i < middle; i++){
                if(ints[i] == k) return true;
            }
        }
        return false;
    }
    public static boolean isAnagram(String wordA, String wordB){
        if(wordA == null || wordB == null) return false;

        if( wordA.length() > 30 || wordA.length() > 30) return false;
        if(wordA.length() != wordB.length()) return false;

        wordA = wordA.toLowerCase();
        wordB = wordB.toLowerCase();
        for(char c: wordA.toCharArray()){
            if(wordB.indexOf(c) == -1){
                return false;
            } 
        }

        return true;

    }
    
}





/**
 * InnerApp
 */
 abstract class Shape {

    private int surface;
    public Shape(){
        this.surface = computerSurface();
    }

    protected abstract int computerSurface();
    public int getSurface(){
        return this.surface;
    }
 }
 class SquareShape extends Shape {

    private final int size;

    public SquareShape(final int size){
        this.size = size;
    }


    @Override
    protected int computerSurface() {
        return size * 2 ;
    }

    

    
 }















