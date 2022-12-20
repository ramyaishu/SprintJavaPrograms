import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SumOfOddAndEvenNum
{
    public String sumOfOddEven(int[] number)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int odd_Count=0;
        int even_count=0;
        for (int i=0;i<number.length;i++)
        {
            if (number[i]%2==0)
            {
                even_count=even_count+number[i];
            }
            else
                odd_Count = odd_Count+number[i];
        }
        System.out.println("Even numbers : "+even_count);
        System.out.println("Odd numbers : "+odd_Count);
        arr.add(even_count);
        arr.add(odd_Count);
        System.out.println(arr.toString());
        return arr.toString();

    }

    @Test
    public void testCase1()
    {
        int[] number={1,2,3,5,6};
        String arr = (sumOfOddEven(number));
        Assert.assertEquals(arr,"[8, 9]");
        Assert.assertTrue(arr.contains("8"));

    }
    @Test
    public void testCase2()
    {
        int[] number={6,8};
        String  arr = (sumOfOddEven(number));
        Assert.assertEquals(arr,"[14, 0]");


    }

    @Test
    public void testCase3()
    {
        int[] number={};
        String  arr = (sumOfOddEven(number));
        Assert.assertEquals(arr,"[0, 0]");


    }


}
