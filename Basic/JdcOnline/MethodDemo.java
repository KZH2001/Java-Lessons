package JdcOnline;

public class MethodDemo {
    public static void main(String[] args) {
        int add (int a, int b) {
           if (a < 0){
            return b;
           }
           return a+b;
        }
        void print(int times){
            if (times < 0){
                return;
            }
            for (int i = 0; i < times; i++){
                System.out.println("Hello");
            }
        
    }
}
}



