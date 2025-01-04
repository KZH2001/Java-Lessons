package StudyRightNow;

import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        System.out.println("Determing if number is positive or negative");
        System.out.print("Enter a number: ");
 int number;
 Scanner input = new Scanner(System.in);
   number = input.nextInt();
 
 if (number > 0){
    System.out.println("The number is positive");
 }else if(number == 0){
    System.out.println("Invalid Number");
 }else{
    System.out.println("The number is negative");
 }       
    }
}
