package com.jdc.app;
import com.jdc.app.domain.Student;

class Application{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.greet();

        Student student = new Student();
        student.greetStudent();
    }
}