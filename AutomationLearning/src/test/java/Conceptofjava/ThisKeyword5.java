package Conceptofjava;

public class ThisKeyword5 {

       // 6) this keyword can be used to return current class instance


    public static void main(String args[]){
        new A().getA().msg();
    }



    }
class A{
    A getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}

