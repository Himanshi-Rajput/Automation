package Conceptofjava;

public class Thiskeyword3 {
    //4) this: to pass as an argument in the method
    //The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.

    public static void main(String[] args) {

        Thiskeyword3 object = new Thiskeyword3();
        object.p();

    }
    void m(Thiskeyword3 obj)
    {
        System.out.println("This method is invoked");
    }
    void p()
    {
        m(this);
    }
}
