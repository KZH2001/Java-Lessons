abstract class Animal{

    private String type;

    Animal(String type){
        this.type = type;
    }
   public abstract void eat(String food);
//System.out.println("%s is eating %s.".formatted(type,food));
    }


class Dog extends Animal {
    public Dog(){
        super("Dog");
    }
    public void eat(String food){
        System.out.println("Wote Wote! I like %s." .formatted(food));
    }
}

class Cat extends Animal{
    public Cat(){
        super("Cat");
    }
    public void eat(String food){
        System.out.println("Meow! I like %s." .formatted(food));
}

class Demo{

    void feed(Animal animal ){
        animal.eat("food");
    }
}