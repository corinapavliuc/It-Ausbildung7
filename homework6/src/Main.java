import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the temperature of the first flask: ");
        int temperature1=scanner.nextInt();
        System.out.println("Enter the temperature of the second flask: ");
        int temperature2=scanner.nextInt();
        System.out.println("Device working correct: " + checkTemperature(temperature1,temperature2) );

    }

    public static boolean checkTemperature(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;

        } else {
         return false;

        }
    }
}

