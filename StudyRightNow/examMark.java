package StudyRightNow;

import java.util.Scanner;

public class examMark {
 public static void main(String[] args) {
        int Myan, Eng, Math;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Myanmar mark: ");
        Myan = input.nextInt();

        System.out.print("Enter your Engish mark: ");
        Eng = input.nextInt();

        System.out.print("Enter your Mathematic mark: ");
        Math = input.nextInt();
     
  
        if (Myan >= 40 && Eng >= 40 && Math >= 40) {
            System.out.println("You passed the exam");
        } else {
            System.out.println("You failed the exam");
        }

}
}