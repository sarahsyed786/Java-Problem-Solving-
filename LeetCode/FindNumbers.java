
// Given an array nums of integers, return how many of them contain an even number of digits.


public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            // Even number only in range of 10-99 , 1000-9999 , 100000 to onwaards , So the condition is
            if (nums[i] >9 && nums[i]<=99 || nums[i] >=1000 && nums[i] <=9999 || nums[i] >=100000)
            {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
