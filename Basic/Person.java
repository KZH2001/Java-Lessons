public class Person {

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "Jane";
        student2.age = 21;

    
        student1.greet();   
        student2.greet();
    }
}
    class Student{
        String name;
        int age;
        void greet() {
            System.out.println("Hello, my name is " + name + "."); 
            System.out.println("I am " + age + " years old."); 
        }
    }
