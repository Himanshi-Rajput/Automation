package Conceptofjava;

public class ThisKeyword {
    public static void main(String[] args) {
        //1.this: to refer current class instance variable
        //2.this: to invoke current class method


        Student s1 = new Student();
        s1.Info("Himanshi" , "Rollno - 64");
        s1.n();
    }
}

class Student
{
    String name;
    String Rollno ;

    public void Info(String name , String Rollno)
    {
        this.Rollno = Rollno;
        this.name = name;
        System.out.println(this.name+ " "+this.Rollno);
    }
     void m()
     {
         System.out.println("I am the m method");
     }

     void n()
    {
        System.out.println("I am the n method");
        this.m();
    }
}
