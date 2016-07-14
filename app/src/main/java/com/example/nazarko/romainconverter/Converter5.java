package com.example.nazarko.romainconverter;

/**
 * Created by nazarko on 7/14/16.
 */
public class Converter5 {
    public final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    public final String[] NUMBER_LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };


    public int toNumerical(String roman) {
        return  toNumerical(new StringBuffer(roman.trim()));
    }



    public int toNumerical(StringBuffer buffer) {
        int arabnum = 0, i = 0;
        if(buffer.length()>0){
            while (i<NUMBER_LETTERS.length){
                do {
                    if (NUMBER_LETTERS[i].length()<=buffer.length()) {
                        if (NUMBER_LETTERS[i].equals(buffer.substring(0, NUMBER_LETTERS[i].length()))) {
                            arabnum += NUMBER_VALUES[i];
                            buffer.delete(0, NUMBER_LETTERS[i].length());
                            if (buffer.length() == 0)
                                return arabnum;
                        }else
                            break;
                        }
                    else
                        break;
                }
                while (buffer.length() != 0);
                i++;
            }
        }
        return 0;
    }


}
