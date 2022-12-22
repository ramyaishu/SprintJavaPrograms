import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaCollcetion
{
    @Test
    public void testCase1()
    {
        String key = "Fruits";
        String[] items = {"Apple","Mango"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(items));
        printHashMap(key,list);
    }

    private void printHashMap(String key, ArrayList<String> list)
    {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<String,ArrayList<String>>();
        hashMap.put(key,list);
        System.out.println(hashMap);

    }

}
