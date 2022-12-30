package testRunner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathChallange
{
    public int mathChallange(String str) {
        String array[] = str.split(" ");
        String operand1, operand2, operator, resultant, letter = null;
        int result = 0;

        operand1 = array[0];
        operator = array[1];
        operand2 = array[2];
        resultant = array[4];

        if (resultant.contains("x")) {
            letter = resultant;
            if (operator.equals("+"))
                result = Integer.parseInt(operand1) + Integer.parseInt(operand2);
            else if (operator.equals("-"))
                result = Integer.parseInt(operand1) - Integer.parseInt(operand2);

            else if (operator.equals("*"))
                result = Integer.parseInt(operand1) * Integer.parseInt(operand2);

            else
                result = Integer.parseInt(operand1) / Integer.parseInt(operand2);
        } else if (operand1.contains("x")) {
            letter = operand1;
            if (operator.equals("+"))
                result = Integer.parseInt(resultant) - Integer.parseInt(operand2);
            else if (operator.equals("-"))
                result = Integer.parseInt(resultant) + Integer.parseInt(operand2);

            else if (operator.equals("*"))
                result = Integer.parseInt(resultant) / Integer.parseInt(operand2);

            else
                result = Integer.parseInt(resultant) * Integer.parseInt(operand2);
        } else if (operand2.contains("x")) {
            letter = operand2;
            if (operator.equals("+"))
                result = Integer.parseInt(resultant) - Integer.parseInt(operand1);
            else if (operator.equals("-"))
                result = Integer.parseInt(resultant) + Integer.parseInt(operand1);

            else if (operator.equals("*"))
                result = Integer.parseInt(resultant) / Integer.parseInt(operand1);

            else
                result = Integer.parseInt(resultant) * Integer.parseInt(operand1);
        }
        char[] s1 = String.valueOf(result).toCharArray();
        char[] e1 = letter.toCharArray();
        int k = 0;
        char res = 0;
        for (char i : e1) {
            if (i == 'x') {
                res = s1[k];
                break;
            } else {
                k = k + 1;
            }
        }
        return Character.getNumericValue(res);
    }

        @Test
        public void testCase1()
        {
        String s = "1x0 * 12 = 1200";
        int output =mathChallange(s);
        Assert.assertEquals(output, 0);
      }
    @Test
    public void testCase2() {
        String s = "2 - 2 = x";
        int output = mathChallange(s);
        Assert.assertEquals(output, 0);
    }



}

