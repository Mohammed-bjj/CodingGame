import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

public class PrinterTest {
    


    @Test
    public void  shouldReurn() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }

    @Test
    public void shouldReurnNullWhenInputDataIsNull(){
        assertEquals(null, Printer.printerError(null));
    }

    @Test
    public void shouldReturnTrueWhenFirstArgEndsWithSecondArg(){
        assertEquals( true, Printer.solution("samurai", "ai"));
    }


    @Test
    public void shouldReturnStringOfPhoneNumberFormat() {
      assertEquals("(123) 456-7890", Printer.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void shouldReturnNullWhenValueOfAnyArrayIsNoValide() {
      assertEquals(null, Printer.createPhoneNumber(new int[] {0, 12, 3, 4, 5, 6, 7, 8, 9, 0}));
    }


    @Test
    public void shouldReturnNegativeValue() {
      assertEquals(0, Printer.makeNegative(0));
    }

    @Test
    public void tests() {
      Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
      Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
      Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
      assertEquals("found the needle at position 3", Printer.findNeedle(haystack1));
      assertEquals("found the needle at position 5", Printer.findNeedle(haystack2));
      assertEquals("found the needle at position 30", Printer.findNeedle(haystack3));
    }
  
    @Test
    public void doNotCompareStringsWithEqualOperator() {
        Object[] haystack = { "junk", "more junk", new String("needle"), "gadget" };
        assertEquals("found the needle at position 2", Printer.findNeedle(haystack));
    }



    @Test
    public void test1() {
        assertEquals(1,
        Printer.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
        Printer.summation(8));
    }




    @Test
    public void testSomething() {
         assertEquals(6, Printer.grow(new int[]{1,2,3}));
         assertEquals(16, Printer.grow(new int[]{4,1,1,1,4}));
         assertEquals(64, Printer.grow(new int[]{2,2,2,2,2,2}));
    }



  @Test 
  @DisplayName("Should return \"Odd\" for num = 1")
  public void testPositiveOddNumbers() {
    assertEquals("Odd",Printer.evenOrOdd(1));
  }
  
  @Test @DisplayName("Should return \"Even\" for num = 2")
  public void testPositiveEvenNumbers() {
    assertEquals("Even", Printer.evenOrOdd(2));
  }
  
  @Test @DisplayName("Should return \"Odd\" for num = -1")
  public void testNegativeOddNumbers() {
    assertEquals("Odd",Printer.evenOrOdd(-1));
  }
  
  @Test @DisplayName("Should return \"Even\" for num = -2")
  public void testNegativeEvenNumbers() {
    assertEquals("Even",Printer.evenOrOdd(-2));
  }
  
  @Test @DisplayName("Should return \"Even\" for num = 0")
  public void testZero() {
    assertEquals("Even",Printer.evenOrOdd(0));
  }
    

  Boolean[] array1 = {true,  true,  true,  false,
    true,  true,  true,  true ,
    true,  false, true,  false,
    true,  false, false, true ,
    true,  true,  true,  true ,
    false, false, true,  true };

    @Test
    @DisplayName("There are 17 sheeps in total")
    public void test() {
            assertEquals( 17, Printer.countSheeps(array1));
    }



      @Test
  public void testsd() {
    assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Printer.digitize(35231));
   // assertArrayEquals(new int[] {0}, Printer.digitize(0));
  }



  @Test
  public void testSomethinsg() {
      assertEquals("Hello, Ryan how are you doing today?", Printer.greet("Ryan"));
  }


  @Test
  public void tessssts() {
    assertEquals(true, Printer.betterThanAverage(new int[] {2, 3}, 5));
    assertEquals(true, Printer.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
    assertEquals(true, Printer.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
    assertEquals(false, Printer.betterThanAverage(new int[] {100, 90}, 11));
  }


  @Test
  public void testRemoval() {
      assertEquals("loquen", Printer.remove("eloquent"));
      assertEquals("ountr", Printer.remove("country"));
      assertEquals("erso", Printer.remove("person"));
      assertEquals("lac", Printer.remove("place"));

  }



  @Test
  public void BasicTests() {
    assertEquals(16, Printer.sum(new int[] { 6, 2, 1, 8, 10}));     
  }


  @Test
  public void testddSomething() {
    assertEquals("01011110001100111", Printer.fakeBin("45385593107843568"));
    assertEquals("101000111101101", Printer.fakeBin("509321967506747")); 
    assertEquals("011011110000101010000011011", Printer.fakeBin("366058562030849490134388085"));
  }


  @Test
  public void fixedTests() {
     assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Printer.countBy(1,10));
     assertArrayEquals(new int[] {2,4,6,8,10}, Printer.countBy(2,5));
     assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Printer.countBy(3,7));
     assertArrayEquals(new int[] {50,100,150,200,250}, Printer.countBy(50,5));
     assertArrayEquals(new int[] {100,200,300,400,500,600}, Printer.countBy(100,6));
  }


  @Test
  public void tesdt1() {
      System.out.println("Fixed Tests Player 1 won!");
      assertEquals("Player 1 won!", Printer.rps("rock", "scissors"));
      assertEquals("Player 1 won!", Printer.rps("scissors", "paper"));
      assertEquals("Player 1 won!", Printer.rps("paper", "rock"));
  }
  @Test
  public void tedst2() {
      System.out.println("Fixed Tests Player 2 won!");
      assertEquals("Player 2 won!", Printer.rps("scissors", "rock"));
      assertEquals("Player 2 won!", Printer.rps("paper", "scissors"));
      assertEquals("Player 2 won!", Printer.rps("rock", "paper"));
  }
  @Test
  public void ff() {
      System.out.println("Fixed Tests Draw!");
      assertEquals("Draw!", Printer.rps("scissors", "scissors"));
      assertEquals("Draw!", Printer.rps("paper", "paper"));
      assertEquals("Draw!", Printer.rps("rock", "rock"));
  }



    @Test
    public void checkSmallValues() {
        assertEquals(6, Printer.expressionsMatter(2, 1, 2));
        assertEquals(3, Printer.expressionsMatter(1, 1, 1));
        assertEquals(4, Printer.expressionsMatter(2, 1, 1));
        assertEquals(9, Printer.expressionsMatter(1, 2, 3));
        assertEquals(5, Printer.expressionsMatter(1, 3, 1));
        assertEquals(8, Printer.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals( 20, Printer.expressionsMatter(5, 1, 3));
        assertEquals(105, Printer.expressionsMatter(3, 5, 7));
        assertEquals( 35, Printer.expressionsMatter(5, 6, 1));
        assertEquals(  8, Printer.expressionsMatter(1, 6, 1));
        assertEquals( 14, Printer.expressionsMatter(2, 6, 1));
        assertEquals( 48, Printer.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals( 60, Printer.expressionsMatter( 2, 10,  3));
        assertEquals( 27, Printer.expressionsMatter( 1,  8,  3));
        assertEquals(126, Printer.expressionsMatter( 9,  7,  2));
        assertEquals( 20, Printer.expressionsMatter( 1,  1, 10));
        assertEquals( 18, Printer.expressionsMatter( 9,  1,  1));
        assertEquals(300, Printer.expressionsMatter(10,  5,  6));
        assertEquals( 12, Printer.expressionsMatter( 1, 10,  1));
    }

    @Test
    public void exampleTests() {
        assertEquals(0.7781512503836435, Printer.logs(10, 2, 3), 0.0000001);
        assertEquals(1.1132827525593785, Printer.logs(5, 2, 3), 0.0000001);
        assertEquals(0.25938375012788123, Printer.logs(1000, 2, 3), 0.0000001);
    }

    @Test
    public void basicTests() {
        assertEquals(9, Printer.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, Printer.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Printer.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, Printer.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Printer.sumOfDifferences(new int[0]));
        assertEquals(0, Printer.sumOfDifferences(new int[]{0}));
        assertEquals(0, Printer.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Printer.sumOfDifferences(new int[]{1}));
    }



    @Test
    @DisplayName("Should return true if input string is palindrome")
    public void shouldReturnTrueIfInputDataIsPalindrome(){
        assertEquals(true, Printer.isPalindrome("m"));
    }

    @Test
    @DisplayName("Should return false if input string is not palindrome")
    public void shouldReturnFalseIfInputDataIsPalindrome(){
        assertEquals(false, Printer.isPalindrome("test"));
        assertEquals(false, Printer.isPalindrome("figuig"));
    }


    @Test
    @DisplayName("Calcul average of a list integers")
    public void shouldCalculeAverageOfListInterger(){
        double result = Printer.calculeAverage(Arrays.asList(1,2,3,4,5)).get();
        assertEquals(3, result );
    }


    @Test
    @DisplayName("Calcul average of a list integers")
    public void shoulReturnZeroWhenListIsEmpty(){
        assertEquals( Optional.empty(),  Printer.calculeAverage(Arrays.asList()));
    }


    @Test
    @DisplayName("Calcul average of a list integers")
    public void shoulReturnZeroWhenListIsNull(){
        assertEquals( Optional.empty(),  Printer.calculeAverage(null));
    }

  @Test
  public void testBMI() {
      assertEquals("Normal", Printer.bmi(80, 1.80));
  }



  @Test
  @DisplayName("")
  public void shouldReturnTrueWhenParamISFoo(){
    assertEquals(true, Printer.isFoo("foo"));
  }



  @Test
  @DisplayName("")
  public void shouldReturnFalseWhenParamISNotFoo(){
    assertEquals(false, Printer.isFoo("test"));
  }


  @Test
  public void shouldReturnGreaterNumberInListOfNumbers(){
    assertEquals(75, Printer.findLargest(Arrays.asList(42, 10, 75, 3)));
  }


  @Test
  public void shouldReturnThisValue(){
    int[] arr = {1,20,3,10,-2,100};
    assertEquals(130, Printer.sumRange(arr));
  }


  @Test
  public void shouldRe(){
    int[] arr = {100, 400, 200};
    assertEquals(620, Printer.calculeTotalPrice(arr, 20));
  }
}
