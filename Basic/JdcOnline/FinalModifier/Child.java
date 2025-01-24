public class Child extends Super{

    private String name;

    public Child(String name){
        super(name);
        this.name = name.toUpperCase();
    }


    public void greet(){
        System.out.println("Hello from child! I am %s.". formatted(name));
        System.out.println("Name from super call is %s." .formatted(super.name));

    }

}