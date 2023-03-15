package homeWork4;

import java.util.Collections;
import java.util.LinkedList;

//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task2HW4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = createLinkedList();
        System.out.println(linkedList);
//        LinkedList<String> turnList = ternLinkedList1(linkedList);
        LinkedList<String> turnList = ternLinkedList2(linkedList);
        System.out.println(turnList);
    }

    private static LinkedList<String> ternLinkedList2(LinkedList<String> linkedList) {
        for (int i = 0; i < linkedList.size() / 2; i++) {
            String temp1 = linkedList.get(i);
            String temp2 = linkedList.get(linkedList.size() - i - 1);
            linkedList.set(i, temp2);
            linkedList.set(linkedList.size() - i - 1, temp1);
        }
        return linkedList;
    }

    private static LinkedList<String> ternLinkedList1(LinkedList<String> linkedList) {
        LinkedList<String> turnList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            turnList.addFirst(linkedList.get(i));
        }
        return turnList;
    }

    private static LinkedList<String> createLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "ночь", "улица", "фонарь", "аптека", "канала ледяного рябь");
        return linkedList;
    }
}
