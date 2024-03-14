package HackerRank;

public class BigSum {

    public static long aVeryBigSum(long[] ar) {
        long sum = 0l;
        for( long i : ar)
        {
            sum +=i;
        
        }
        System.out.println(sum);
        return sum;
}

    public static void  main (String[] args) {
     
        long[] nums = {100001,100003,100003};
       
        aVeryBigSum(nums);
    }

}