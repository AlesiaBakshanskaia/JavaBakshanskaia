package lesson3;
//Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Seminar3 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            numList.add(generateRandomDouble());
        }
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
    }


    private static int generateRandomDouble() {
        int min = -100;//минимальное рандомное значение
        int max = 100;//максимальное рандомное значение
        Random random = new Random();
        int randomNum = random.nextInt(min, max + 1);
        return randomNum;
    }
}
