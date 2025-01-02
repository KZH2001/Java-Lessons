public class NumberTest {
    public static void main(String[] args) {
String octal = getOctalNumber(267);
System.out.printf("Octal number of %d is %s%n", 267, octal);
System.out.printf("%s = %d%n" , octal, Integer.decode(octal));
    }
        //method call
        static String getOctalNumber(int data){

            // object creation
StringBuilder sb = new StringBuilder();

            while (data > 0) {
                sb.append(data % 8);

                data = (data/8);
            }

       sb.reverse();
       sb.insert(0, "0");
       return sb.toString();
    }
}
