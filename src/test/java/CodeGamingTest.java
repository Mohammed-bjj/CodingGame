import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CodeGamingTest {


    @Test
    void existsMethodeSuccess() {
        assertTrue(CodeGaming.exists(new int[]{1, 2, 3}, 3), "should return true");
    }


    @Test
    void existsMethodeFailed() {
        assertFalse(CodeGaming.exists(new int[]{1, 2, 3}, 4),"should return false");
        int k = 1;
        assertThrows(IllegalArgumentException.class, () -> {
            CodeGaming.exists(null, k);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            CodeGaming.exists(new int[]{}, k);
        });

    }

    @Test
    void isAnagram() {
        assertEquals(true, CodeGaming.isAnagram("test", "tset"));
        assertEquals(true, CodeGaming.isAnagram("test", "test"));
        assertEquals(false, CodeGaming.isAnagram("tests", "test"));
        assertEquals(false, CodeGaming.isAnagram("test", "tzst"));

    }


    @Test
    void isfoo(){
        assertEquals(false , CodeGaming.isFoo(null));
    }

    @Test
    void findLargest() {
        assertEquals(-3, CodeGaming.findLargest(Arrays.asList(-42, -10,-75, -3)));
    }

    @Test
    void sumRange() {
        int[] arr = {1,20,3,10,-2,100};
        assertEquals(130, CodeGaming.sumRange(arr));
    }

    @Test
    void calculateTotalPrice() {
        int[] prices = {100, 400, 200};
        int discount = 20;
        int resultExpect = 620;
        assertEquals(resultExpect, CodeGaming.calculateTotalPrice(prices, discount));
    }
}