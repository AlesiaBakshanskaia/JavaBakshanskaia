package homeWork1;

import java.util.Scanner;
import java.time.*;

//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class Task3 {
    public static void main(String[] args) {
        greetingUserInCurrentTime();
    }

    private static void greetingUserInCurrentTime() {
        String nameUser = getNameUser();
        int hour = getCurrentHour();
        if (5 <= hour && hour <= 11) {
            System.out.printf("Доброе утро, %s!", nameUser);
        } else if (12 <= hour && hour <= 17) {
            System.out.printf("Добрый день, %s!", nameUser);
        } else if (18 <= hour && hour <= 22) {
            System.out.printf("Добрый вечер, %s!", nameUser);
        } else {
            System.out.printf("Доброй ночи, %s!", nameUser);
        }
    }

    private static String getNameUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String nameUser = in.nextLine();
        in.close();
        return nameUser;
    }

    private static int getCurrentHour() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
//        System.out.println(hour);//вывод текущего часа для проверки
        return hour;
    }
}
