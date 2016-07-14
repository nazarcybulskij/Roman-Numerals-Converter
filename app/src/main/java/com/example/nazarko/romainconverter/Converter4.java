package com.example.nazarko.romainconverter;

/**
 * Created by nazarko on 7/14/16.
 */
public class Converter4 {
    public final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    public final String[] NUMBER_LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };


    public int toNumerical(String roman) {
        return  toNumerical(new StringBuffer(roman.trim()));
    }



    private int toNumerical(StringBuffer buffer) {
        if(buffer.length()>0){
            for (int i = 0 ;i< NUMBER_LETTERS.length;i++) {
                int length = NUMBER_LETTERS[i].length();
                if (buffer.length() >= NUMBER_LETTERS[i].length()) {
                    if (NUMBER_LETTERS[i].equals(buffer.substring(0, length))) {
                        buffer.delete(0, length);
                        return NUMBER_VALUES[i] + toNumerical(buffer);
                    }
                }
            }
        }
        return 0;
    }


}
