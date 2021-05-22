package Lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator victim = new Calculator();

    @Test
    public void sumOperation() {
        int actual = victim.sumOperation(3, 5);
        assertEquals(8, actual);
    }


    @Test
    public void divisionOperation() {
        double actual;
        actual = victim.divisionOperation(8, 3);
        assertEquals(2.6666, actual, 0.0001);
    }

    @Test
    public void multiplicationOperation() {
        int actual = victim.multiplicationOperation(3, 5);
        assertEquals(15, actual);
    }

    @Test
    public void reductionOperation() {
        int actual = victim.reductionOperation(4, 8);
        assertEquals(-4, actual);
    }

    @Test
    public void concantinationOperation() {
        String actual = victim.concantinationOperation("aaa", "bbb");
        assertEquals("aaabbb", actual);
    }

    int[] arr = {1, 5, 9};

    @Test
    public void arraySum() {
        int actual = victim.arraySum(arr);
        assertEquals(15, actual);
    }

    @Test
    public void arrayMax() {
        int actual = victim.arrayMax(arr);
        assertEquals(9, actual);
    }

    @Test
    public void arrayMin() {
        int actual = victim.arrayMin(arr);
        assertEquals(1, actual);
    }

    @Test
    public void arraySort() {
        int[] arr = {3, 4, 8, 5, 1, 0};
        int[] actual = victim.arraySort(arr);
        assertEquals(0, actual[0]);


    }

    @Test
    public void pow() {
        int actual = victim.pow(4, 3);
        assertEquals(64, actual);
    }
}