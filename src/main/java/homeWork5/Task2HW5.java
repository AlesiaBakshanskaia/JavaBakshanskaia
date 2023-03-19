package homeWork5;

import java.util.*;

//2. Пусть дан список сотрудников:
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class Task2HW5 {
    public static void main(String[] args) {
        ArrayList<String> listStaff = new ArrayList<>();
        Collections.addAll(listStaff, "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                                                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                                                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                                                "Иван Мечников", "Петр Петин", "Иван Ежов");
        System.out.println(listStaff);
        HashMap<String, Integer> mapStaff = getMapNamesAndNumbs(listStaff);
        TreeMap<Integer, String> mapSortNames = printSortedNames(mapStaff);
        System.out.println(" ");
        System.out.println("Первый вариант печати");
        printMap(mapSortNames);//первый вариант печати
        System.out.println(" ");
        System.out.println("Второй вариант печати");
        printMap2(mapSortNames);//второй вариант печати
    }

    private static void printMap(TreeMap<Integer, String> mapSortNames) {
        for (Map.Entry<Integer, String> el : mapSortNames.entrySet()) {
            System.out.printf("Повтор имени (имен): %s - %d раз(а)%n", el.getValue(), el.getKey());
        }
    }

    private static TreeMap<Integer, String> printSortedNames(HashMap<String, Integer> mapStaff) {
        TreeMap<Integer, String> mapSortNames = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> el : mapStaff.entrySet()) {
            int newKey = el.getValue();
            String newVal = el.getKey();
            if (mapSortNames.containsKey(newKey)) {
                StringBuilder sb = new StringBuilder();
                sb.append(mapSortNames.get(newKey)).append(" ");
                mapSortNames.put(newKey, sb.append(newVal).toString());
            } else {
                mapSortNames.put(newKey, newVal);
            }
        }
//        System.out.println(mapSortNames);
        return mapSortNames;
    }

    private static HashMap<String, Integer> getMapNamesAndNumbs(ArrayList<String> listStaff) {
        HashMap<String, Integer> mapStaff = new HashMap<>();
        for (String person: listStaff) {
            String[] temp = person.split(" ");
            String keyMapStaff = temp[0];
            if (mapStaff.containsKey(keyMapStaff)){
                mapStaff.put(keyMapStaff, mapStaff.get(keyMapStaff) + 1);
            } else {
                mapStaff.put(keyMapStaff, 1);
            }
        }
//        System.out.println(mapStaff);
        return mapStaff;
    }
    private static void printMap2(TreeMap<Integer, String> numNamesTMap) {
        for (Map.Entry<Integer, String> elem : numNamesTMap.entrySet()) {
            int key = elem.getKey();
            String [] values = elem.getValue().split(" ");
            for (String value : values) {
                System.out.printf("Имя %s повторяется %d раз(а)%n", value, key);
            }
        }
    }
}
