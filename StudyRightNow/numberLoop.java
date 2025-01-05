package StudyRightNow;

import java.util.Scanner;

public class numberLoop {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        int count = 0;
        for (int i =0; i <= number; i+= 5){
System.out.print(i + "\t");
count++;
if (count%5 == 0){
    System.out.println(i);
        }   
    }
}
    
}
