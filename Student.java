package com.cognizant.shapes;
public class Student {
	    String name;
	    int id;
	    int age;
	    Student(String name, int id)
	    {
	        this.name = name;
	        this.id = id;
	        this.age = age;
	    }
	}
	class Details {
	    public static void main(String[] args)
	    {
	        Student Student1 = new Student("ABC", 67);
	        System.out.println("Student name:" + Student1.name  + " and Student id :" + Student1.id+"Student age:"+Student1.age);
	    }
	}



