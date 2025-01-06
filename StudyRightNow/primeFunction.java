package StudyRightNow;

public class primeFunction {
    public static void main(String[] args) {
        boolean result = isPrime(4);  
        System.out.println(result);
    }
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int div = 2; div <= Math.sqrt(n); div++) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }
}