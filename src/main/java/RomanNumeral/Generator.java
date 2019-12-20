package RomanNumeral;

import java.util.Collections;
import java.util.TreeMap;

public class Generator {

    public void generateRomanNumeral(Integer input) {
        String stringToDisplay = "";

        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        map.put(1000000, "M̅");
        map.put(900000, "C̅M̅");
        map.put(500000, "D̅");
        map.put(400000, "C̅D̅");
        map.put(100000, "C̅");
        map.put(90000, "X̅C̅");
        map.put(50000, "L̅");
        map.put(40000, "X̅L̅");
        map.put(10000, "X̅");
        map.put(9000, "M̅X̅");
        map.put(5000, "V̅");
        map.put(4000, "M̅V̅");
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        for (Integer key : map.keySet()) {
            while (input >= key) {
                stringToDisplay += map.get(key);
                input -= key;
            }

        }
        System.out.println(stringToDisplay);;
    }
}