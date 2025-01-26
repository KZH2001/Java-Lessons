public class Super {
    public String name;
    public static int count;


    //constructor
    public Super(String name){
        this.name = name;
        count++;
    }


    //method
    public void greet(){
        System.out.println("Hello! I am %s.". formatted(name));
    }


    //static method
    public static void showCount(){
        System.out.println("Cound is %d.".formatted(count));
    }
}