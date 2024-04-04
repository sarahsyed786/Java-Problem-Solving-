public class MoveZeros {

    public static int[] moveZeroes(int[] nums) {
        
        int length =nums.length;
       for(int i = 1; i<length; i++)
       {
           for(int j=1; j<length; j++)
           {
           if(nums[j]!=0 && nums[j-1]==0)
           {
               
               int temp = nums[j];
               nums[j]=nums[j-1];
               nums[j-1]=temp;  
           }
           }
       } 
       return nums;  
    }
    public static void main(String[] args) {
            int[] arr = {0,1,3,0,2,12};
            int[] result = moveZeroes(arr);

            for(int i = 0; i<result.length; i++)
            {
                System.out.print(result[i]+",");
            }

        
    }
    
}
