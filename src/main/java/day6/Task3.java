package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Василий");
        Teacher teacher = new Teacher("Тимофей", "Математика");
        teacher.evaluate(student);

    }
}

class Student {
    private String name;

    public void setName(String username) {
        this.name = username;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }
}

class Teacher extends Student {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void setSubject(String anySubject) {
        this.subject = anySubject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        int grade = random.nextInt(4) + 2;
        String gradeText = null;
        switch (grade) {
            case 2:
                gradeText = "неудовлетворительно";
                break;
            case 3:
                gradeText = "удовлетворительно";
                break;
            case 4:
                gradeText = "хорошо";
                break;
            case 5:
                gradeText = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.getName() + " оценил студента " + student.getName() + " по предмету " + subject + " на оценку " + gradeText);
    }
}