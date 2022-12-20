import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDeseOrder
{
    public String sortDecOrder(Integer[] arr)
    {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return Arrays.toString(arr);
    }
    @Test
    public void testCase1()
    {
        Integer arr[] = {1,4,6,7,8};
        String result =  sortDecOrder(arr);
        Assert.assertEquals(result,"[8, 7, 6, 4, 1]");
    }
    @Test
    public void testCase2()
    {
        Integer arr[] = {11,13,6,7,8};
        String result =  sortDecOrder(arr);
        Assert.assertEquals(result,"[13, 11, 8, 7, 6]");
    }
    @Test
    public void testCase3()
    {
        Integer arr[] = {11,-13,6,7,8};
        String result =  sortDecOrder(arr);
        Assert.assertEquals(result,"[11, 8, 7, 6, -13]");
    }

    @Test
    public void testCase4()
    {
        Integer arr[] = {};
        String result =  sortDecOrder(arr);
        Assert.assertEquals(result,"[]");
    }
}
