record Student(
    String name,
    String phone,
    String email
){}

Student [] students = {
        new Student("Aung Aung","092342334","aungaung@gmail.com"),
        new Student("Kyaw Kyaw","095463344","kyawkyaw@gmail.com"),
        new Student("Nilar","094535433","nilar@gmail.com")
}

void showStudents(Student [] students){
    System.out.printf("%-12s","Name");
    System.out.printf("%-12s","Phone");
    System.out.printf("%-20s%n","Email");


    for(var student : students){
        System.out.printf("%-12s",student.name());
        System.out.printf("%-12s",student.phone());
        System.out.printf("%-20s%n",student.email());
    }
}