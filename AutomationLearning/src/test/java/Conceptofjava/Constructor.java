package Conceptofjava;

import com.gargoylesoftware.htmlunit.svg.SvgAltGlyph;

public class Constructor {
    public static void main(String[] args) {
        /*
        1. Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
        2. Constructors do not return any type while method(s) have the return type or void if does not return any value.
        3. Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
         */

        /*
        default, parameterized, and copy constructors
         */

        /*
        Every time we create an object, Java automatically allocates the memory on the heap.
        Similarly, whenever an object is no longer needed, the memory will automatically be deallocated.
        In languages like C, when we finish using an object in memory,
        we have to deallocate it manually. Unfortunately, Java doesn’t support manual memory deallocation.
        Moreover, one of the features of the Java programming language is taking
        care of object destruction by itself – using a technique called garbage collection.
         */

        Student2 S1 = new Student2();
        Student2 s2 = new Student2("Himanshi", "JAVA");
        Student2 s3  = new Student2(s2);


    }

}
class Student2{
    String name ;
    String subject;

    Student2()
    {
        System.out.println("This is a default or non-parameterized constructor");
    }

    Student2( String name , String subject )
    {
        this.name = name;
        this.subject = subject;
        display();
    }

    void display()
    {
        System.out.println("This is a parameterized constructoe " + name +" "+ subject);
    }

    Student2(Student2 obj)
    {
        this.name = obj.name;
        this.subject = obj.subject;
        display2();
    }

    void display2()
    {
        System.out.println("This is a copy constructor "+name+" "+ subject);
    }

}



