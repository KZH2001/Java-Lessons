import java.util.*;

public class CheckPrimeNumber {

    //main method
    public static void main(String[] args) {
        CheckPrimeNumber demo = new CheckPrimeNumber();
        demo.launch();
    }

    //launch method
    private void launch(){
        welcomeMessaage("Check Prime Number");
        checkNumber();
    }


    //check is number prime or not
    private void checkNumber(){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Your Number : ");

      int num = input.nextInt();
         if (num <= 1 || num % 2  == 0 && num != 2  ){
              System.out.printf(num + " is not a prime number.%n");
          }else {
             System.out.println( num + " is a prime number.%n");
         }
         System.out.println();
            System.out.println("Do you want to check again?(y/ Others) : ");
    }

    //welcome message
    private void welcomeMessaage(String message){
        System.out.println("======================");
        System.out.println(message);
        System.out.println("======================");

    }







}
