package StudyRightNow;
import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
 int number;
 System.out.println("Determining if a number is even or odd");

 Scanner input = new Scanner(System.in);
 System.out.println("Enter a number");    
 number = input.nextInt();
 if (number % 2 == 0){
    System.out.println("The number is even");
 } else{
    System.out.println("The number is odd");
 } 
    }
}
