package lesson6;

import java.util.HashSet;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        /*1.1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 1000.
        2. Создайте метод, в который передайте заполненный выше массив и
        с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    */
        int[] array = randomArray();
        double res = percentUniq(array);
        System.out.println(res);

    }

    private static double percentUniq(int[] array) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int item : array) {
            numSet.add(item);
        }
        double res = numSet.size() * 100 / (double) array.length;
        return res;

    }

    private static int [] randomArray() {
        int [] numbers = new int[1000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 1001);
        }
        return numbers;
    }

}
