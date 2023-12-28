package Homework1;

public class SumCalculator {
    public static void main(String[] args) {
        int n = 7;
        int m = 2;

        // Вычисление суммы через цикл
        int sumUsingLoop = sumUsingLoop(n, m);
        System.out.println("Sum using loop: " + sumUsingLoop);

        // Вычисление суммы через рекурсию
        int sumUsingRecursion = sumUsingRecursion(n, m);
        System.out.println("Sum using recursion: " + sumUsingRecursion);
    }

    // Функция вычисления суммы через цикл
    private static int sumUsingLoop(int n, int m) {
        int sum = 0;
        for (int i = m; i <= n; i += m) {
            sum += i;
        }
        return sum;
    }

    // Функция вычисления суммы через рекурсию
    private static int sumUsingRecursion(int n, int m) {
        if (n < m) {
            return 0;
        }
        return n + sumUsingRecursion(n - m, m);
    }
}
