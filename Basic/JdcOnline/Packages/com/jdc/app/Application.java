package com.jdc.app;

class Application{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.greet();

        com.jdc.app.domain.Student student = new com.jdc.app.domain.Student();
        student.greetStudent();
    }
}