package homeWork6;

import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию
public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop ("Asus", "Vivobook", 4, "Notebook", "Intel Core i7",
                2, 15.6, 512, "NVIDIA GeForce RTX 3050", false);
        Laptop l2 = new Laptop ("Asus", "TUF Gaming", 8, "Gaming Notebook", "Intel Core i7",
                4, 17.3, 1000, "NVIDIA GeForce RTX 3050", false);
        Laptop l3 = new Laptop ("Apple", "MacBook Air", 8, "Notebook", "Apple M1",
                8, 13.0, 512, "Apple M1", false);
        Laptop l4 = new Laptop ("Apple", "MacBook Air", 10, "Notebook", "Apple M2",
                10, 15.6, 215, "Apple M2", false);
        Laptop l5 = new Laptop ("Asus", "Vivobook Flip", 8, "Transformer", "Intel Celeron N4020",
                4, 15.0, 125, "Intel UHD Graphics 600", true);


        ArrayList<Laptop> listLaptops = new ArrayList<>();
        Collections.addAll(listLaptops, l1, l2, l3, l4, l5);
//        System.out.println(listLaptops);
        startFilterLaptops(listLaptops);

    }

    private static void startFilterLaptops(ArrayList<Laptop> listLaptops) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.printf("%nДля отбора ноутбуков доступны следующие фильтры: %n" +
                    " 1. Производитель%n" +
                    " 2. Диагональ экрана%n" +
                    " 3. Объем жесткого диска%n" +
                    " 4. Наличие touchscreen%n" +
                    " 5. Вывод всего списка ноутбуков%n" +
                    "Введите номер фильтра для отбора или цифру 0 для завершения работы приложения: %n");

            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой. Введите данные\n");
                continue;
            }

            if (inputString.equalsIgnoreCase("0")) {
                System.out.println("Работа завершена.\n");
                break;
            }

            if (inputString.equalsIgnoreCase("1")) {
                filterManufacturer(listLaptops);
                continue;
            }

            if (inputString.equalsIgnoreCase("2")) {
                filterScreenDiagonal(listLaptops);
                continue;
            }

            if (inputString.equalsIgnoreCase("3")) {
                filterVolumeSSD(listLaptops);
                continue;
            }

            if (inputString.equalsIgnoreCase("4")) {
                filterTouchScreen(listLaptops);
                continue;
            }

            if (inputString.equalsIgnoreCase("5")) {
                printAll(listLaptops);

            } else {
                System.out.println("Такого фильтра не существует. Введите номер фильтра еще раз\n");
            }
        }
    }



    private static void filterManufacturer(ArrayList<Laptop> listLaptops) {
        String msg = "Введите производителя для поиска ноутбуков:\n";
        String dateFromUser = getDateFromUser(msg);
        int count = 0;
        for (Laptop item : listLaptops) {
            if (item.getManufacturer().equals(dateFromUser)) {
                item.printLaptop();
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Такого производителя нет среди наших ноутбуков.%n");
        }
    }

    private static void filterVolumeSSD(ArrayList<Laptop> listLaptops) {
        String msg = "Введите минимальный объем памяти жесткого диска ноутбука для поиска:\n";
        String dateFromUser = getDateFromUser(msg);
        try {
            int volumeSSDFromUser = Integer.parseInt(dateFromUser);
            int count = 0;
            for (Laptop item : listLaptops) {
                if (item.getVolumeSSD() >= volumeSSDFromUser) {
                    item.printLaptop();
                    count++;
                }
            }
            if (count == 0) {
                System.out.printf("Ноутбуков с таким объемом памяти нет среди наших ноутбуков.%n");
            }
        } catch (NumberFormatException e) {
            System.out.printf("Вы ввели некорректные данные.%n");
        }
    }

    private static void filterScreenDiagonal(ArrayList<Laptop> listLaptops) {
        String msg1 = "Введите минимальный размер диагонали экрана ноутбука для поиска:\n";
        String minDiag = getDateFromUser(msg1);
        String msg2 = "Введите максимальный размер диагонали экрана ноутбука для поиска:\n";
        String maxDiag = getDateFromUser(msg2);
        try {
            double minDiagFromUser = Double.parseDouble(minDiag);
            double maxDiagFromUser = Double.parseDouble(maxDiag);
            if (minDiagFromUser > maxDiagFromUser || minDiagFromUser < 0) {
                System.out.printf("Вы ввели некорректные данные.%n");
            } else {
                int count = 0;
                for (Laptop item : listLaptops) {
                    if (item.getScreenDiagonal() >= minDiagFromUser && item.getScreenDiagonal() <= maxDiagFromUser) {
                        item.printLaptop();
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.printf("Ноутбуков с такой диагональю монитора у нас нет.%n");
                }
            }
        } catch (NumberFormatException e) {
            System.out.printf("Вы ввели некорректные данные.%n");
        }
    }

    private static void filterTouchScreen(ArrayList<Laptop> listLaptops) {
        String msg = "Введите наличие TouchScreen: да/нет \n";
        String dateFromUser = getDateFromUser(msg);
        int count = 0;
        for (Laptop item : listLaptops) {
            if (item.isTouchScreen() && dateFromUser.equalsIgnoreCase("да")) {
                item.printLaptop();
                count++;
            } else if (!item.isTouchScreen() && dateFromUser.equalsIgnoreCase("нет")) {
                item.printLaptop();
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Вы ввели некорректные данные.%n");
        }
    }
    private static String getDateFromUser(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.printf(msg);
        String data = in.nextLine();
        while (data.isBlank()) {
            System.out.println("Строка не должна быть пустой. Введите данные\n");
            System.out.println(msg);
            data = in.nextLine();
        }
        return data;
    }
    private static void printAll(ArrayList<Laptop> listLaptops) {
        for (Laptop item : listLaptops) {
            item.printLaptop();
        }

    }
}



