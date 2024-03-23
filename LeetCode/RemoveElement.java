import java.util.Scanner;

public  class RemoveElement {

    public static int removeElement( )
     {
       Scanner sc = new Scanner(System.in);

       int[] nums = new int[4];
       System.out.println("Enter four numbers: ");
       
       for(int i =0; i<4; i++)
       {
        nums[i] = sc.nextInt();

       }

       System.out.println("Enter a value: ");
       int val = sc.nextInt();

        int k =0;
        for(int num : nums )
        {
            if(num!=val)
            {
                nums[k]=num;
                k++;
            }
        }
        System.out.println(k);
        return k;
        
    }

    public static void main(String[] args) {
        removeElement();
        
    }
    
}
