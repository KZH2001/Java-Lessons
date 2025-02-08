import java.util.*;

public class CheckPrimeNumber {

    //main method
    public static void main(String[] args) {
        CheckPrimeNumber demo = new CheckPrimeNumber();
        demo.launch();
    }

    //launch method
    public void launch() {
        welcomeMessaage("Check Prime Number");

        boolean again = true;
        while (again) {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter Your Number : ");

            int num = input.nextInt();
            if (num <= 1 || num % 2 == 0 && num != 2) {
                System.out.printf(num + " is not a prime number.%n");
            } else {
                System.out.printf(num + " is a prime number.%n");
            }

            System.out.println();
            again = checkAgain();
        }
        GoodByeMessage("Thank you! See you again!");
    }




    //welcome message
    private void welcomeMessaage(String message){

        System.out.println("===================================");
        System.out.println(message);
        System.out.println("===================================");
    }

    //GoodBye message
     private void GoodByeMessage(String message){
         System.out.println();
         System.out.println("===================================");
            System.out.println(message);
         System.out.println("===================================");
        }



    //checkAgain
    private boolean checkAgain(){
        System.out.print("Do you want to check again?(y/ Others) : ");
        Scanner input = new Scanner(System.in);
        String check = input.next();
        return "y".equalsIgnoreCase(check);
        }



}
