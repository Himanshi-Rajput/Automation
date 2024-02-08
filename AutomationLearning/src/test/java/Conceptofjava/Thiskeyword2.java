package Conceptofjava;

public class Thiskeyword2 {
    //3.this() : to invoke current class constructor
    //3.1 Calling parameterized constructor from default constructor:
    //3.2 Real usage of this() constructor call
    //3.3 Calling default constructor from parameterized constructor:
    // Rule: Call to this() method must be the first statement in constructor.
    public static void main(String[] args) {
        Student1 s1=new Student1(111,"ankit","java");
        Student1 s2=new Student1(112,"sumit","java",6000f);
        Student1 s3 = new Student1();
        s1.display();
        s2.display();

    }
}
class Student1{
    int rollno;
    String name,course;
    float fee;

    Student1(int rollno)
    {
        this.rollno = rollno;
        System.out.println("This is a single parameterized constructor" + this.rollno);
    }

    Student1 ()
    {
        this(64);
        System.out.println("This is non parameterize constructor");

    }


    Student1(int rollno,String name,String course){

        this();
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student1(int rollno,String name,String course,float fee){   //3.2  Real usage of this() constructor call
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}   //3.2  Real usage of this() constructor call
}
