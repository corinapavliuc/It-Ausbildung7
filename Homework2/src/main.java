public class main {
        public static void main(String[] args) {
            double m = 10.5;
            double n = 10.45;

            double diffM = Math.abs(m - 10); // Разница между m и 10
            double diffN = Math.abs(n - 10); // Разница между n и 10

            if (diffM < diffN) {
                System.out.println("Число " + m + " ближе к 10.");
            } else if (diffN < diffM) {
                System.out.println("Число " + n + " ближе к 10.");
            } else {
                System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
            }
        }
    }