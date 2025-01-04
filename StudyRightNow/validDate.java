package StudyRightNow;

import java.util.Scanner;

public class validDate {

    public static void main (String[] args){
int day,month,year;
Scanner input = new Scanner(System.in);
System.out.print("Enter day: ");
day = input.nextInt();
System.out.print("Enter month: ");
month = input.nextInt();
System.out.print("Enter year: ");
year = input.nextInt();
if ( day > 0 && day <= 31){
    if(month > 0 && month <= 12){
        System.out.println("Valid Date");
    }else{
        System.out.println("Invalid Date");
    }
 System.out.print("Valid Date");
}else{
    System.out.print("Invalid Date");
}

    }
}
