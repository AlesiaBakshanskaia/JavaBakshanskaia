package homeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args) {
        int lengthList = 13;
        ArrayList<Integer> listIntRandomNumbers = getListIntRandomNumbers(lengthList);
        System.out.println(listIntRandomNumbers);
        int max = Collections.max(listIntRandomNumbers);
        int min = Collections.min(listIntRandomNumbers);
        double average = getAverage(listIntRandomNumbers);
        System.out.printf("Максимальное значение: %d%n", max);
        System.out.printf("Минимальное значение: %d%n", min);
        System.out.printf("Среднее арифметическое: %.3f", average);
    }


    private static Double getAverage(ArrayList<Integer> list) {
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum / list.size();
    }

    private static ArrayList<Integer> getListIntRandomNumbers(int lengthList) {
        ArrayList<Integer> listIntRandomNumbers = new ArrayList<>();
        for (int i = 0; i < lengthList; i++) {
            listIntRandomNumbers.add(generateRandomIntNumber());
        }
        return listIntRandomNumbers;
    }

    private static Integer generateRandomIntNumber() {
        int min = -100;//минимальное рандомное значение
        int max = 100;//максимальное рандомное значение
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }
}
