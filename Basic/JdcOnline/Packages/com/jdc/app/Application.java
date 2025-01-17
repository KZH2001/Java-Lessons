package com.jdc.app;
import com.jdc.app.domain.*;
import static com.jdc.app.utils.MessageUtils.*;


public class Application{

    public static void main(String[] args) {

        //same package from teacher
        Teacher teacher = new Teacher();
        teacher.greet();



        //different package from student
        Student student = new Student();
        student.greetStudent();


//different package from static method and static message
        StaticMessage();
        System.out.println(MESSAGE);
    }
}