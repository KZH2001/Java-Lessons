package StudyRightNow;

import java.util.Scanner;

public class bodyMassIndex {

    public static void main(String[] args) {

        double inputWeight,inputHeight,weight,height,bmi,decimalBMI;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in lbs: ");
        inputWeight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        inputHeight = input.nextDouble();

        weight = inputWeight * 0.453592;
        height = inputHeight * 0.01;
        bmi =  weight / (height * height);
        decimalBMI =  Math.round(bmi * 100) / 100;
        System.out.println("Your BMI is " + decimalBMI);

}
}