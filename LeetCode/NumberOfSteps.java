
import java.util.*;

public class NumberOfSteps
     {
        public static void main(String[] args) {
            
        
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    scanner.close();

    int steps = 0;
    
        while(num!=0)
        {

        if(num%2 == 0)
        {
            num = num / 2;
            
            steps++;
        }
        else 
        {
            num -=1;
            steps++;
        }

        }
       System.out.println(steps);
      
} }
