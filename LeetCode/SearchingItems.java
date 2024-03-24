import java.util.HashSet;

public class SearchingItems {

    public  static boolean checkIfExist() {
        int[] arr = {10,2,5,3};
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            // Check if current element or its double exists in the set
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            // Add current element to the set
            set.add(num);
        }
        return false;
        
    }
    public static void main(String[] args) {
       System.out.println(checkIfExist());

    }
}
