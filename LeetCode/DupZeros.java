public class DupZeros {
    public static void duplicateZeros() {
        
        int[] arr = { 1,0,2,3,0,4,5,0 };
        int[] result = new int[arr.length];
        int index = 0;

        for(int i : arr)
        {
            if(i==0)
            {
                if(index < arr.length-1)
                {
                    result[index++]  = 0;
                }
            }
            if(index<=arr.length-1)
        {
            result[index++] = i;
        }}
        
           System.arraycopy(result, 0, arr, 0, arr.length);
           System.out.println(result);
    }
    public static void main(String[] args) {
      duplicateZeros();
    }
}
