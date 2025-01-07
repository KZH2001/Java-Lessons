package StudyRightNow;

public class primeFunction {

    public sta boolean isPrime(int p) {

        int div = 2;
        while (p % div != 0) {
            {
                div++;
            }
            if (p == div) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        boolean ans = isPrime(7);
        if (ans == true) {
            System.out.println("is Prime number.");

        } else {
            System.out.println("is not a Prime number.");

        }
    }
}