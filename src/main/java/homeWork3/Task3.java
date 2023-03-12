package homeWork3;

import java.util.ArrayList;
import java.util.List;

//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
public class Task3 {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("2", "5", "Earth", "62", "-3", "Saturn", "22", "2.9",
                "2");
        ArrayList<String> arrayListOfStrings = new ArrayList<>(listOfStrings);
        delIntFromList(arrayListOfStrings);
    }

    private static void delIntFromList(ArrayList<String> arrayListOfStrings) {
        for (int i = arrayListOfStrings.size() - 1; i >= 0 ; i--) {
            try {
                Integer.parseInt(arrayListOfStrings.get(i));
                arrayListOfStrings.remove(i);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println(arrayListOfStrings);
    }
}
