package Conceptofjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        //1. Add object
        //2. Get Object
        //3. Modify Object
        //4. Delete/Remove Object
        //5. Iterate/operation on object

        ArrayList<Integer>  list1 = new ArrayList<Integer>();
        //ArrayList<String>    list2 = new ArrayList<>();
        //ArrayList<Boolean>   list3 = new ArrayList<>();

        list1.add(5);
        list1.add(7);
        list1.add(26);
        list1.add(14);

        System.out.println(list1);

        System.out.println(list1.get(3));

        list1.add(2, 12);

        System.out.println(list1);

        list1.set(2,10);

        System.out.println(list1);

        list1.remove(2);

        System.out.println(list1);

        System.out.println(list1.size());

        for (int i=0 ; i< list1.size(); i++)
        {
            System.out.print(list1.get(i));
        }
        System.out.println();

        Collections.sort(list1);
        System.out.println(list1);
    }
}
