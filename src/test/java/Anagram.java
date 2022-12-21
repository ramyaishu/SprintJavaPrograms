import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Anagram
{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return rst;
        }
        if (s.length() == p.length() && isAnagram(s, p)) {
            rst.add(0);
            return rst;
        }

        int i = 0;
        int j = p.length();
        while (j <= s.length()) {
            if (isAnagram(s.substring(i, j), p)) {
                rst.add(i);
            }
            i++;
            j++;
        }
        System.out.println(rst);

        return rst;
    }

    private boolean isAnagram(String a, String b) {
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
    @Test
    public void testCase1()
    {
        String s = "abcdefgabcf";
        String ptr = "abc";
        List<Integer> list = findAnagrams(s,ptr);
        System.out.println(list);
        Assert.assertTrue(list.size()==2);

    }
    @Test
    public void testCase2()
    {
        String s = "abc";
        String ptr = "abfegrh";
        List<Integer> list = findAnagrams(s,ptr);
        System.out.println(list);
        Assert.assertTrue(list.size()==0);
    }
    @Test
    public void testCase3()
    {
        String s = "abcdef";
        String ptr = "a";
        List<Integer> list = findAnagrams(s,ptr);
        System.out.println(list);
        Assert.assertTrue(list.size()==0);

    }
}
