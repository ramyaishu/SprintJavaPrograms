import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GradeGenerator
{
    private Map<String, Integer> getOriginalValues()
    {
        HashMap<String,Integer> original = new HashMap<>();
        original.put("Tom",85);
        original.put("Lia",65);
        original.put("Ray",55);
        return original;
    }
    private Map<String, Integer> getMakeupValues()
    {
        HashMap<String,Integer> makeUP = new HashMap<>();
        makeUP.put("Tom",85);
        makeUP.put("Lia",75);
        makeUP.put("Ray",65);
        return makeUP;

    }
    public Map<String ,Integer> findGrade(Map<String,Integer> omap,Map<String,Integer> mmap)
    {
        Map<String ,Integer> result = new HashMap<>();
        for(Map.Entry<String ,Integer> entry1:omap.entrySet())
        {
            for(Map.Entry<String,Integer> entry2:mmap.entrySet())
            {
                if(entry1.getValue() < entry2.getValue())

                    result.put(entry2.getKey(),entry2.getValue());

                else
                    result.put(entry1.getKey(),entry1.getValue());

            }
        }
        System.out.println(result);
        return result;

    }

    @Test
    public void testCase1()
    {
        Map<String,Integer> original = getOriginalValues();
        Map<String,Integer> makeUp = getMakeupValues();
        Map<String ,Integer> result = findGrade(original,makeUp);
        Map<String,Integer> expected = new HashMap<>();
        expected.put("Tom",85);
        expected.put("Lia",75);
        expected.put("Ray",65);
        Assert.assertEquals(result,expected);
    }
}
