package Lesson1;

class Calculator {
    /**
     * a+b
     **/
    int sumOperation(int a, int b) {
        return a + b;
    }

    /**
     * a/b
     **/
    double divisionOperation(int a, int b) {
        return (double) a / b;
    }

    /**
     * a*b
     **/
    int multiplicationOperation(int a, int b) {
        return a * b;
    }

    /**
     * a-b
     **/
    int reductionOperation(int a, int b) {
        return a - b;
    }

    /**
     * Сложение двух строк a и b
     **/
    String concantinationOperation(String a, String b) {
        return a + b;
    }

    /**
     * Сумма элементов массива
     **/
    int arraySum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    /**
     * Максимальный элемент массива
     **/
    int arrayMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j)
                max = j;
        }
        return max;
    }

    /**
     * Минимальный элемент массива
     **/
    int arrayMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j)
                min = j;
        }
        return min;
    }

    /**
     * Сортировка массива по возрастанию
     **/
    int[] arraySort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i <= arr.length - 2 - j; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Печать масссива
     **/
    void printArray(int[] arr) {
        System.out.println("Array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    /**
     * Возведение числа а в стапень b
     **/
    int pow(int a, int b) {
        int k = a;
        while (b >= 2) {
            a *= k;
            b--;
        }
        return a;
    }
}
