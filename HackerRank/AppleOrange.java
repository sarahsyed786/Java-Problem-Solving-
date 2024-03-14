import java.util.Scanner;

public class AppleOrange {

    public static void applesOranges()
    {
        Scanner scanner= new Scanner(System.in);
        int s, t, a, b, m, n;
        s = scanner.nextInt();
        t = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        m = scanner.nextInt();
        n = scanner.nextInt();

        int[] apples = new int[m];
        int[] oranges = new int[n];

        for(int i = 0; i<m; i++)
        {
            apples[i] = scanner.nextInt();
        }
        for(int i = 0; i<n; i++)
        {
            oranges[i] = scanner.nextInt();
        }
        countApplesOranges(s,t,a,b,apples,oranges);
    }

    public static void countApplesOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        int appleCount = 0;
        int orangeCount = 0;

        for(int apple : apples){
            if(s <= a+apple && a+apple <=t)
                {
            appleCount++;
                }
        }

        for(int orange : oranges)
        {
           if (s<=a+orange && a+orange<=t)
           {
            orangeCount++;
           }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
    public static void main(String[] args) {
        applesOranges();
    }
    
}
