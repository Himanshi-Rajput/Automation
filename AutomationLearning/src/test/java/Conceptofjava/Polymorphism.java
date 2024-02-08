package Conceptofjava;

public class Polymorphism {
    /*
    Go through this for types - Compile time polymorphism and Run time polymorphism - https://www.geeksforgeeks.org/polymorphism-in-java/

     Method Overloading
     When there are multiple functions with the same name but different parameters
     then these functions are said to be overloaded. Functions can be overloaded by
     changes in the number of arguments or/and a change in the type of arguments.

     Polymorphism allows us to perform a single action in different ways. In other words,
     polymorphism allows you to define one interface and have multiple implementations.
     The word “poly” means many and “morphs” means forms, So it means many forms.
     */
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }

}
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}
