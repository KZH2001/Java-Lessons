package JdcOnline;

public class Student {

 String name;
 int age;
 static int count;

 public Student() {
    count++;
    
 }

 public Student(String name,int age){
    this.name = name;
    this.age = age;
    count++;
 }
void greet(Student otherStudent){
    System.out.println("Hello " + otherStudent.name + "!");
    System.out.println("I am " + name + " and I am " + age + " years old.");
}
}
