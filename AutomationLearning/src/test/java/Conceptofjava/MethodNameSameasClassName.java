package Conceptofjava;

public class MethodNameSameasClassName {

    /*
    We can have a method name same as a class name in Java but it is not
    a good practice to do so. This concept can be clear through example rather than explanations.
    In the below example, a default constructor is called when an object is created and a method with
    the same name is called using obj.Main().
    See the example - https://www.geeksforgeeks.org/can-we-define-a-method-name-same-as-class-name-in-java/
     */
        void MethodNameSameasClassName ()
        {
            System.out.println(
                    "My name is same as Constructor name!");
        }
        public static void main(String[] args)
        {
            // create an object of class
            // Main
            MethodNameSameasClassName obj = new MethodNameSameasClassName();

            // call the method
            obj.MethodNameSameasClassName();
        }
    }

