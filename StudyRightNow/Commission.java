package StudyRightNow;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        double sales, rate = 0;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter sales: ");
        sales = input.nextDouble();
        if (sales >= 1 && sales <= 1000) {
            rate = sales * (2.0 / 100);
        }else if (sales >= 1001 && sales <= 5000){
            rate = sales * (5.0 / 100);
        }else if (sales >= 5001){
            rate = sales * (10.0 / 100);
        }else{
            System.out.println("Invalid sales");
        }
        System.out.println("Name: " + name + "'s " + rate + "%");
    }
}
