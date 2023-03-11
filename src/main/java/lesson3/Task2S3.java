package lesson3;
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2S3 {
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
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < planets.size() - 1; i++) {
            if (planets.get(i + 1) == planets.get(i)) {
                count++;
            } else {
                res.append(planets.get(i)).append(" ").append(count).append(" ");
                count = 1;
            }

        }
        res.append(planets.get(planets.size() - 1)).append(" ").append(count).append(" ");

        System.out.println(res);
    }
    private static int generateRandomDouble() {
        int min = 0;//минимальное рандомное значение
        int max = 8;//максимальное рандомное значение
        Random random = new Random();
        int randomNum = random.nextInt(min, max + 1);
        return randomNum;
    }
}
