package StudyRightNow;

import java.util.Scanner;
public class numberLoop1 {
    public static void main(String[] args) {
        int number, count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (int i = number; i >= 0; i -= 5) {
            System.out.print(i + "\t");
            count++;
            if (count % 5 == 0) {
                System.out.println(i);
            }

        }
    }

}
