package StudyRightNow;

import java.io.InputStreamReader;
import java.util.Scanner;


public class reverse {
    
    public static void main(String[] args) {
        int num,fd,sd,td,fod,fid,rn;
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter a 5 digit number:");
        num=scanner.nextInt();
        fd=num/10000;
        sd=(num%10000)/1000;
        td=(num%1000)/100;
        fod=(num%100)/10;
        fid=num%10;
        rn = fid*10000+fod*1000+td*100+sd*10+fd;
        System.out.println("Origial of the number is:" + num);
        System.out.println("Reverse of the number is:" + rn);
    }
}
