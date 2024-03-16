public class ConsicutiveOne {

    public  static int findMaxConsecutiveOnes(int[] nums) {
        
        int j = 0 ;
        int c = 0;
        // Loop iterate  on array  array;
        for(int i=0; i<nums.length; i++)
        {
            if (nums[i] == 1)
            {  
                //when ever 1 appers in array valus of count increases;
                c++;
                j = Math.max(j,c);
            }
            else
            {
                c=0;   
            }    
        }
        
        return j;
    }

    public static void main(String[] args) {
        int[] num = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(num);// output will be 3;
        
    }
}
