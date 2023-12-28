package Homework2;

public class MinCostPath {
    public static void main(String[] args) {
        int[][] costs = new int[][]{
                {0, 1, 4, 4},
                {4, 1, 1, 1},
                {4, 4, 4, 1},
                {4, 4, 4, 0}
        };

        int result = minCost(costs);
        System.out.println("Min Cost: " + result);
    }

    public static int minCost(int[][] costs) {
        int m = costs.length; // количество строк
        int n = costs[0].length; // количество столбцов

        int[][] dp = new int[m][n];

        // Инициализация базовых случаев
        dp[0][0] = costs[0][0];

        // Инициализация первого столбца
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + costs[i][0];
        }

        // Инициализация первой строки
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + costs[0][j];
        }

        // Заполнение таблицы
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = costs[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }
}
