package homeWork3;

import java.util.ArrayList;
import java.util.Random;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task1 {
    public static void main(String[] args) {
        int lengthList = 10;
        ArrayList<Integer> listIntRandomNumbers = getListIntRandomNumbers(lengthList);
        System.out.println(listIntRandomNumbers);

        delEvenNumbersFromList(listIntRandomNumbers);
        if (listIntRandomNumbers.size() == 0) {
            System.out.println("В заданном списке только четные числа, итоговый список пуст");
            System.out.println(listIntRandomNumbers);
        } else {
            System.out.println(listIntRandomNumbers);
        }
    }

    private static void delEvenNumbersFromList(ArrayList<Integer> listIntRandomNumbers) {
        for (int i = listIntRandomNumbers.size() - 1; i >= 0; i--) {
            if (listIntRandomNumbers.get(i) % 2 == 0) {
                listIntRandomNumbers.remove(i);
            }
        }
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
