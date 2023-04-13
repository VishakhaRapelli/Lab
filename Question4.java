package Abstraction;
interface Person {
    void speak();
}

class Student implements Person {
    public void speak() {
        System.out.println("I am a student.");
    }
}

class Teacher implements Person {
    public void speak() {
        System.out.println("I am a teacher.");
    }
}
public class Question4 {
	public static void main(String[] args) {
        Person person1 = new Student();
        Person person2 = new Teacher();

        person1.speak();
        person2.speak();
    }

}
