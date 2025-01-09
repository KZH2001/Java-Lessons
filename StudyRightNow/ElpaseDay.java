package StudyRightNow;

import java.util.Scanner;

public class ElpaseDay {
    public static void main(String args[])
    {
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int td,ed,fd;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter today's day: ");
        td = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        ed = input.nextInt();
        fd = (td + ed) % 7;
        System.out.print("Today is " + days[td] + " and the future day is " + days[fd]);
    }
    
}
