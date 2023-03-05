package lesson1;
//Написать программу, которая запросит пользователя ввести <Имя> в консоли
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

//Дан массив двоичных чисел, например [1,1,0,1,1,1],
//вывести максимальное количество подряд идущих 1.

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

// inputNameAndSayHi();
printArray();
// getNameAndPrintHiFromTime();

    }

    private static void printArray() {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1};
        int count = 0;
        int maxx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxx) {
                    maxx = count;
                }
            } else {
                count = 0;
            }
        }
 /* if (count > maxx) {
 maxx = count;
        }*/
        System.out.println(maxx);
    }

    private static void inputNameAndSayHi() {
        Scanner in = new Scanner(System.in);
        System.out.println("name: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();
    }

    private static void getNameAndPrintHiFromTime() {
        Scanner in = new Scanner(System.in);
        System.out.println("name: ");
        String name = in.nextLine();
// Date date = new Date();// Вывод текущей даты и времени с использованием toString()
// System.out.println(date.toString());
        System.out.println(LocalDateTime.now());
        in.close();
    }

}