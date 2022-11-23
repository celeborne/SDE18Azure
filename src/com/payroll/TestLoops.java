package com.payroll;

public class TestLoops {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int a = 0; a < array.length; a++) {
            System.out.println(a);
        }
        for (int element : array) {
            System.out.println(element);
        }

        int count = 0;
        int total = 0;
        while (true) {
            total += count;
            count++;
            if (total > 75) break;

        }
        System.out.println("It took " + count + " iterations to total 75");
    }
}


