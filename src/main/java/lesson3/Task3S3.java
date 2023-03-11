package lesson3;
//Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

import java.util.*;

public class Task3S3 {
    public static void main(String[] args) {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto");
        ArrayList<String> planets = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            String temp = names.get(generateRandomDouble());
            planets.add(temp);
        }
        System.out.println(planets);
        Collections.sort(planets);
        System.out.println(planets);
        printPlanetsAndCounts(planets);
    }

    private static void printPlanetsAndCounts(ArrayList<String> planets) {
        for (int i = planets.size() - 1; i > 0; i--) {
            if (planets.get(i).equals(planets.get(i - 1))) {
                planets.remove(i);
            }

        }
//
//        for (String planet : planets) {
//            System.out.println(planet);
//        }
//
//        System.out.println("=====");
//
//        ListIterator<String> iter = planets.listIterator();
//        while (iter.hasNext()) {
//            String planet = iter.next();
//            System.out.println(planet);
//        }
//        System.out.println("=====");
//        while (iter.hasPrevious()) {
//            String planet = iter.previous();
//            System.out.println(planet);
//        }

        System.out.println(planets);
    }
    private static int generateRandomDouble() {
        int min = 0;//минимальное рандомное значение
        int max = 8;//максимальное рандомное значение
        Random random = new Random();
        int randomNum = random.nextInt(min, max + 1);
        return randomNum;
    }
}

