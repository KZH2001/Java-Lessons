package JdcOnline;

public class Student1 {

    String name;
    int phone;
    String email;
    String address;


    public static Student1 createWithName(String name){
        var student = new Student1();
        student.name = name;
        return student;

    }

    public static Student1 createWithPhone(String phone){

    }

}