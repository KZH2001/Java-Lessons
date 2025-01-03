package StudyRightNow;

import java.util.Scanner;

public class examMark {
 public static void main(String[] args) {
        int Myan, Eng, Math;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Myanmar mark: ");
        System.out.println("Enter your Engish mark: ");
        System.out.println("Enter your Mathematic mark: ");
        Myan = input.nextInt();
        Eng = input.nextInt();
        Math = input.nextInt();
       
  
        if (Myan >= 40 && Eng >= 40 && Math >= 40) {
            System.out.println("You passed the exam");
        } else {
            System.out.println("You failed the exam");
        }

}
}