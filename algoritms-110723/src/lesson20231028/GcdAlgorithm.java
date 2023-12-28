package lesson20231028;

public class GcdAlgorithm {
    public static void main(String[] args) {

        long start =System.nanoTime();
        int result = gcbBruteForce(24000, 36000);
        System.out.println(result);
        long end =System.nanoTime();
        System.out.println("Time elapsed,Eucledean alg: "+ (end -start));

        start =System.nanoTime();
        result=gcbEuclidean(24000,36000);
        System.out.println(result);
        end =System.nanoTime();
        System.out.println("Time elapsed,bruteforce alg : " +(end -start));
    }


    public static int gcbBruteForce(int a, int b) {
        int x = Math.min(a, b);
        int y = Math.max(a, b);

        for (int i = x; i > 1; i--) {
            if (x % i == 0 && y % i == 0) return i;
        }
        return 1;
    }

    public static int gcbEuclidean(int a, int b) {
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        int result = x;

        while (y % x != 0) {
           result=y%x;
           y =x;
           x=result;

        }
        return result;

    }
}
