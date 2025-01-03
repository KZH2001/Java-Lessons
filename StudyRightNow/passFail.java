package StudyRightNow;

import java.util.Scanner;

public class passFail {
 public static void main(String[] args) {
    int mark;
    Scanner input = new Scanner(System.in);
    System.out.println ("Enter the mark:");
    mark = input.nextInt();
    if (mark >= 40 && mark <= 100){
        System.out.println("You Pass Exam!");
    }else if(mark > 100 || mark < 0) {
        System.out.println("You Fill Number Between 0 to 100");
    }
    else{
        System.out.println("You Fail Exam!");
    }

 }
    
}
