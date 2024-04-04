public class ReplaceGreatestElement {

    public static int[] replaceElement(int[] arr)
    {
        int maxRight = -1;
        int n = arr.length;

        for(int i = n-1; i>=0; i--)
        {
            int temp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, temp);

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nArray ={17, 18, 5, 4, 6, 1};
       
        int[] result =  replaceElement(nArray);

        for(int i =0; i<result.length; i++)
        {
            System.out.print(result[i]+",");

        }

    }
}
