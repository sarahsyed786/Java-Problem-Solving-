public class RemoveDuplicate {

    public  static int removeDuplicates() 
    {
        int[] nums = {1,1,2};
        
        if(nums==null)
        {
            return 0;
        }
        
        int k = 1;
        
        for(int i =1; i<nums.length; i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(k);
        return k; 
    }
    public static void main(String[] args) {
        removeDuplicates();
    }
}
