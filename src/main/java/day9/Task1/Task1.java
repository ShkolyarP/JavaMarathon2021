package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Артем", "Английский язык");
        Teacher teacher = new Teacher("Иннокентий", "Математика");

        System.out.println(student.name);
        System.out.println(teacher.subjectName);

        student.printInfo();
        teacher.printInfo();

    }


}
