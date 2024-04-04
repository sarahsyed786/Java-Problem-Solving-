public class OccurenceOfArray 
{

    public static int strStr(String haystack, String needle) 
    {
        // If needle is an empty string, return 0
        if (needle.isEmpty()) return 0;
        
        // Find the index of the first occurrence of needle in haystack
        int index = haystack.indexOf(needle);
        
        return index;
    }
    public static void main(String[] args)
    {
        String haystack = "hello";
        String needle = "ll";
        
        int index = strStr(haystack, needle);
        System.out.println(index); // Output: 2
        
    }
}
