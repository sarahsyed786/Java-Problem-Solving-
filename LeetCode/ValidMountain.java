public class ValidMountain {

    public static  boolean validMountainArray()
    {

        int[] arr = {0,3,2,1};
        int n = arr.length;
        int i = 0;

        while(i<n-1 && arr[i]<arr[i+1])
        {
            i++;
        }

        if(i==0 || i==n-1)
        {
            return false;

        }

        while(i<n-1 && arr[i]>arr[i+1])
        {
            i++;
        }

        return i==n-1;
    }
    public static void main(String[] args) {
        System.out.println(validMountainArray());
    }
    
}
