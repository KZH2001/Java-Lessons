package StudyRightNow;

import java.util.Scanner;

public class checkSameWords {
    public static void main(String[] args) {
        String word1,word2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        word1 = input.nextLine();
        System.out.print("Enter the second word: ");
        word2 = input.nextLine();

        if (word1.compareTo(word2) == 0){
            System.out.println("Great - the same.");
        }else if(word1.compareToIgnoreCase(word2) == 0){
            System.out.println("Okay - almost the same.");
            }
        else if(word1.length() == word2.length()){
            System.out.println("At least the same length.");
        }else{
            System.out.println("Not the same");
        }
    }
    
}
