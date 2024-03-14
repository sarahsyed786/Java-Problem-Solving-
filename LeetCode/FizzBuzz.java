// package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

         List<String> fzbz = new ArrayList<>();

         Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();
         scanner.close();

        for(int i = 1; i<=n; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                fzbz.add("FizzBuzz");
            }
            else if(i%3 == 0)
            {
                fzbz.add("Fizz");
            }
            else  if(i%5 == 0)
            {
                fzbz.add("Buzz");
            }
            else
            {
               
                String str  = Integer.toString(i);
                fzbz.add(str);
            }
               
            
        }
         
        System.out.println(fzbz);
 
    }
    
}
