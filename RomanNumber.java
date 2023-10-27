package Sample;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static void main(String[] args) {
        String roman = "X";
        int result = romanToInt(roman);
        System.out.println("The int value of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) 
    {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
}