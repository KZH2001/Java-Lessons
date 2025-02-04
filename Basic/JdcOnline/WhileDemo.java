import java.util.Scanner;

public class WhileDemo {

    public static void main(String[] args) {
        WhileDemo demo = new WhileDemo();
        demo.launch();
    }


//    private Scanner scanner = new Scanner(System.in);
    public void launch(){
        Scanner scanner = new Scanner(System.in);

        showMessage();
        boolean again = true;
        while(again){
            int input1,input2;
//            int input1 = getUserInput("Enter Digit 1: ");
//            int input2 = getUserInput("Enter Digit 2: ");

            System.out.print("Enter Digit 1: ");
            input1 = scanner.nextInt();

            System.out.print("Enter Digit 2: ");
            input2 = scanner.nextInt();



            int result = input1 + input2;
//            System.out.printf("%d + %d = %d%n%n", input1,input2,result);
            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (Y/N): ");
            String input = scanner.next();
            again = askUserAskAgain(input);
        }
    }


//    get user information method
//    private int getUserInput(String message){
//        System.out.print(message);
//        var input = scanner.nextLine();
//        return Integer.parseInt(input);
//    }

    private void showMessage(){
        System.out.println("========================");
        System.out.println("Welcome to Calculator");
        System.out.println("========================");
        System.out.println();
        }


        private boolean askUserAskAgain(String input) {

//        var input = scanner.nextLine();
//        return input.equalsIgnoreCase("Y");
        return "Y".equalsIgnoreCase(input);

        }
        }
