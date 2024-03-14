import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestCandles {

    public static int birthDayCakeCandles(List<Integer> candles)
    {
        Collections.sort(candles);
        int heighestCandles = Collections.max(candles);
        int count = 0;
        for(int height : candles)
        {
            if(height == heighestCandles)
            {
                count++;
            }
        }
        return count;
    }
public static void main(String[] args) {
    List<Integer> candles = new ArrayList<Integer>();
    candles.add(3);
    candles.add(1);
    candles.add(4);
    candles.add(2);
    candles.add(4);

   
    System.out.println( birthDayCakeCandles(candles));
}

    
}
