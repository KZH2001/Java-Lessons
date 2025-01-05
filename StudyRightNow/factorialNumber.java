package StudyRightNow;
import java.util.Scanner;

public class factorialNumber {
public static void main(String[] args) {
    int number,result = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = input.nextInt();
    for (int i = number; i >= 1; i--){
        result = result * i;
        
    }
    System.out.println(result);
}
}