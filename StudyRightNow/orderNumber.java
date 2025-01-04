package StudyRightNow;

import java.util.Scanner;

public class orderNumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = number.nextInt();

        System.out.print("Enter second number: ");
        num2 = number.nextInt();

        System.out.print("Enter third number: ");
        num3 = number.nextInt();

        if (num1 <= num2 && num1 <= num3){
            System.out.println("Accending number " + num1 + "," + num2 + "," + num3);
        }else if (num1 <= num2 && num3 <= num2){
            System.out.println("Accending number " + num1 + "," + num3 + "," + num2);

        }else if (num2 <= num1 && num2 <= num3){
            System.out.println("Accending number " + num2 + "," + num1 + "," + num3);
        }else if (num2 <= num1 && num3 <= num1){
          System.out.println("Accending number " + num2 + "," + num3 + "," + num1);
        }else if (num3 <= num1 && num3 <= num2){
            System.out.println("Accending number " + num3 + "," + num1 + "," + num2);
        }else{
            System.out.println("Accending number " + num3 + "," + num2 + "," + num1);
        }
    }
}
