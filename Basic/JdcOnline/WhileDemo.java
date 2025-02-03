public class WhileDemo {
    public void launch(){

        showMessage();

        while(){
            int input1 = getUserInput("Enter Digit 1: ");
            int input2 = getUserInput("Enter Digit 2: ");
            int result = input1 + input2;
            System.out.printf("%d + %d = %d%n%n", input1,input2,result);
        }
    }


    private int getUserInput(String message){

    }

    private void showMessage(){
        System.out.println("========================");
        System.out.println("Welcome to Calculator");
        System.out.println("========================");
        System.out.println();
        }
}