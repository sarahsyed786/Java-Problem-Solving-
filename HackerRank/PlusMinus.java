
package HackerRank;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

    double positive =0;
    double negative =0;
    double zeros =0;


    for(int i : arr)
    {
        if(i<0)
        {

            negative++;
        }
        else if (i>0)
        {

            positive ++;
        }
        else if(i==0)
        {

            zeros++;
        }
    }

    double sumPositive = positive/arr.size();
    double sumNegative = negative/arr.size();
    double sumZeros= zeros/arr.size();

    System.out.println(sumPositive + "\n"+ sumNegative + "\n" + sumZeros);

    }

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-1);

        plusMinus(list);


    }
}