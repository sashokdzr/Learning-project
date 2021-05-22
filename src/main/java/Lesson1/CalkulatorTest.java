package Lesson1;

class CalkulatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        calculator.printArray(arr);
        System.out.println();
        calculator.printArray(calculator.arraySort(arr));
    }
}
