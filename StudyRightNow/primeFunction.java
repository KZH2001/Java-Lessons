package StudyRightNow;

public class primeFunction {
    public static void main(String[] args) {
    
 isPrime(3);  
    // System.out.println(result);
}
public static boolean isPrime(int n){
    int div =2;
    while (n%div!=0){
        div++;
        
    }if (n == div)
    return true;
    else
    return false;
}
}