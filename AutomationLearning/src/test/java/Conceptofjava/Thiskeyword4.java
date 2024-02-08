package Conceptofjava;

public class Thiskeyword4 {
     //this: to pass as argument in the constructor call
    //We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. Let's see the example:
     public static void main(String[] args) {
      A4 obj = new A4();

     }


}
class B4
{
    A4 obj;
    B4(A4 obj)
    {
        this.obj = obj;

    }
    void display()
    {
        System.out.println(obj.data);
    }

}
class A4
{
    int data = 40;
    A4()
    {
        B4  b_obj = new B4(this);
        b_obj.display() ;

    }

}

