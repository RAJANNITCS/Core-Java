// Program to print methods and variables information by using Class object: Program to print methods and variables information by using Class object:

import java.lang.reflect.*;

class Student {
    private Integer age;
    private String name;
    private String rollNo;

    public Student(Integer age,String name, String rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public void printStudentInfo() {
        System.out.println("Student age = " + this.age + ",name = " + this.name + ",roll No = " + this.rollNo);
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}

class PrintClassVariableAndMethodInfo {
     public static void main(String[] args) {
        Student s1 = new Student(25,"rohan","16CA6016");
        Class c1 = s1.getClass();
        s1.printStudentInfo();
        System.out.println(c1.getName());
        Method[] m1 = c1.getDeclaredMethods();
        for (int i = 0; i < m1.length; i++) {
            System.out.println(m1[i]);
        }
        Field[] f1 = c1.getDeclaredFields();
        for (int i = 0; i < f1.length; i++) {
            System.out.println(f1[i]);
        } 
    }
}