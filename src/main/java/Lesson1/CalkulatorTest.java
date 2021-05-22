package Lesson1;

import static java.lang.System.*;

class CalkulatorTest {
    public static void main(String[] args) {
        var calculator = new Calculator();
        int[] arr;
        arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        calculator.printArray(arr);
        out.println();
        calculator.printArray(calculator.arraySort(arr));
    }
}
