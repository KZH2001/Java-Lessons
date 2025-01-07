package StudyRightNow;

public class primeFunction{

    public static void main(String[] args)
     {
        boolean ans = isPrime(2);
        if (ans == true) {
            System.out.println(" 5 is Prime number.");

        } else {
            System.out.println("is not a Prime number.");

        }
    }

    public static boolean isPrime(int p) {

        int div = 2;
        while (p % div != 0) {
            div++;
        }
        if (p == div) {
            return true;
        } else {
            return false;
        }
    }
}