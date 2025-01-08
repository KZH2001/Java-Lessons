package StudyRightNow;

import java.util.Scanner;

public class primeApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = input.nextInt();
        boolean r = primeFunction.isPrime(n);
        primeFunction.isPrime(n);
        if (r == true) {
            System.out.print(n + " is a Prime number: ");
        }else{
            System.out.print(n + " is not a Prime Number:");
        }

}
}