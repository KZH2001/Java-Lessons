
public class LocalVariableTest {

    static String message = "Global Variable";
   public static void showMessage(String message){
    System.out.println(message);
   }

   public static void doSomething(){
    String message = "Local Variabe";
    System.out.println(LocalVariableTest.message);
   }

   public static void main(String[] args) {
   doSomething();
}
}


