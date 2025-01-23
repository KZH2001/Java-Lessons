abstract class Animal{

    private String type;

    Animal(String type){
        this.type = type;
    }
    abstract void eat(String food){
System.out.println("%s is eating %s.".formatted(type,food));
    }
}

class Dog extends Animal {
    public Dog(){
        super("Dog");
    }
}

class Cat extends Animal{
    public Cat(){
        super("Cat");
    }
}

class Demo{

    void feed(Animal animal ){
        animal.eat("food");
    }
}