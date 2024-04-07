import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(2);

        //get elements 
        int ele = list.get(0);

        //add elements in between
         list.add(2,3);

         //size of list
         list.size();

         //loop
         for(int i = 0; i<list.size(); i++)
         {
            System.out.println(list.get(i));
         }

         //sorting
         Collections.sort(list);
         

        
    }   
}
