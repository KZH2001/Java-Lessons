public class Child extends Super{

    private String name;
    public static int count;

    public Child(String name){
        super(name);
        this.name = name.toUpperCase();
    }

    @Override
    public void greet(){
        System.out.println("Hello from child! I am %s.". formatted(name));
        System.out.println("Name from super class is %s." .formatted(super.namen));

    }

    public static void showCount(){
        System.out.println("Count is %d.".formatted(count));
        System.out.println("Count from super class is %s.".formatted(Super.count));
    }

}