package lesson5;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        arabToRom();
    }

    private static void arabToRom() {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("M", 1000);
        m.put("CM", 900);
        m.put("D", 500);
        m.put("CD", 400);
        m.put("C", 100);
        m.put("XC", 90);
        m.put("L", 50);
        m.put("XL", 40);
        m.put("X", 10);
        m.put("IX", 9);
        m.put("V", 5);
        m.put("IV", 4);
        m.put("I", 1);
        int arabNumber = 2999;
        StringBuilder romNumber = new StringBuilder();

//        while (arabNumber != 0) {
        for (Map.Entry<String, Integer> item : m.entrySet()) {
            while (arabNumber >= item.getValue()) {
                romNumber.append(item.getKey());
                arabNumber -= item.getValue();
            }
        }
//        }
        System.out.println(romNumber);
    }
}
