package homeWork5;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task1HW5 {
    public static void main(String[] args) {
        HashMap<String, LinkedList<String>> phoneBook= new HashMap<>();
        LinkedList<String> first = new LinkedList<>();
        Collections.addAll(first, "1235", "5362");
        LinkedList<String> second = new LinkedList<>();
        Collections.addAll(second, "1235", "5362");
        LinkedList<String> third = new LinkedList<>();
        Collections.addAll(third, "1235", "5362");
        phoneBook.put("Иван Иванов", first);
        phoneBook.put("Анна Павлова", second);
        phoneBook.put("Ирина Волк", third);
        System.out.println(phoneBook);
    }
}
