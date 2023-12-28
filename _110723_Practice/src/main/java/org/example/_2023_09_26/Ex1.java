package org.example._2023_09_26;

import java.util.Arrays;

public class Ex1 {
    public static int a(int a, int b) {
        return a * 11 * b;
    }

    public static int c(int c) {
        return c * 9;
    }

    public static void main(String[] args) {
        int[] arr = {3, 21, 45, 67, 89, 6, 5, 1}; //;
        System.out.println(Arrays.toString(arr));

        int result = a(c(11), c(88));
        System.out.println(result);
    }
}