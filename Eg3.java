package Methodover;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }
}
class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println(this.name + " is studying in grade " + this.grade + ".");

    }
}
public class Eg3 {
	public static void main(String[] args) {
        Student student = new Student("John", 18, 12);
        student.speak();
        student.study();
    }
}
