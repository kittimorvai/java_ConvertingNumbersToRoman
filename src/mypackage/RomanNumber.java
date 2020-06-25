package mypackage;

import java.util.TreeMap;

public class RomanNumber {

    public static final TreeMap<Integer, String> romanNumbers = new TreeMap<Integer, String>();

    static {
        romanNumbers.put(1000, "M");
        romanNumbers.put(900, "CM");
        romanNumbers.put(500, "D");
        romanNumbers.put(400, "CD");
        romanNumbers.put(100, "C");
        romanNumbers.put(90, "XC");
        romanNumbers.put(50, "L");
        romanNumbers.put(40, "XL");
        romanNumbers.put(10, "X");
        romanNumbers.put(9, "IX");
        romanNumbers.put(5, "V");
        romanNumbers.put(4, "IV");
        romanNumbers.put(1, "I");
    }

    private String getRoman(int num) {
        int largestKey = romanNumbers.floorKey(num);

        if (largestKey == num) {
            return romanNumbers.get(num);
        } else {
            return romanNumbers.get(largestKey) + getRoman(num - largestKey);
        }
    }

    public void printRomanNumbers(int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(i + " as a roman number is " + getRoman(i));
        }
    }

}
