package homeWork4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task1HW4 {
    public static void main(String[] args) {
        startStringHandler();
    }

    private static void startStringHandler() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> textList = new LinkedList<>();
        Collections.addAll(textList, "ночь", "улица", "фонарь", "аптека", "канала ледяного рябь");

        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equalsIgnoreCase("print")) {
                ternLinkedList(textList);
                continue;
            }
            if (inputString.equalsIgnoreCase("revert")) {
                delLastString(textList);
                continue;
            }
            if (inputString.equalsIgnoreCase("stop")) {
                break;
            }
            textList.add(inputString);
        }
        in.close();
    }

    private static void delLastString(LinkedList<String> textList) {
        String delStr = textList.pollLast();
        if (delStr == null) {
            System.out.println("Удалять нечего, список строк пуст");
        } else {
            System.out.println("Удалена строка " + delStr);
        }
    }

    private static LinkedList<String> ternLinkedList(LinkedList<String> linkedList) {
        LinkedList<String> turnList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            turnList.addFirst(linkedList.get(i));
        }
        System.out.println(turnList);
        return null;
    }
}
