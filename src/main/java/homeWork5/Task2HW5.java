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
        printMap(mapSortNames);
    }

    private static void printMap(TreeMap<Integer, String> mapSortNames) {
        for (Map.Entry<Integer, String> el : mapSortNames.entrySet()) {
            System.out.printf("Повтор имени (имен): %s - %d раз(а)%n", el.getValue(), el.getKey());
        }
    }

    private static TreeMap<Integer, String> printSortedNames(HashMap<String, Integer> mapStaff) {
        TreeMap<Integer, String> mapSortNames = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> el : mapStaff.entrySet()) {
            Integer newKey = el.getValue();
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
            String keymapStaff = temp[0];
            if (mapStaff.containsKey(keymapStaff)){
                mapStaff.put(keymapStaff, mapStaff.get(keymapStaff) + 1);
            } else {
                mapStaff.put(keymapStaff, 1);
            }
        }
//        System.out.println(mapStaff);
        return mapStaff;
    }

//    private static Set<String> getSetNames(ArrayList<String> listStaff) {
//        Set<String> setNames = new HashSet<>();
//        for (String person: listStaff) {
//            String[] temp = person.split(" ");
//            setNames.add(temp[0]);
//        }
////        System.out.println(setNames);
//        return setNames;
//    }
}
