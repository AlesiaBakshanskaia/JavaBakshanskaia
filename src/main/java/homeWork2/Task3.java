package homeWork2;

import java.io.File;

//3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
public class Task3 {
    public static void main(String[] args) {
        String pathDir = "src/main/java/homeWork2";//путь к паке с файлами
//        String pathDir = "src/main/java/homeWork2/testDirForTask3";//путь к пустой папке
//        String pathDir = "src/main/java/homeWork2/Task1.java";//путь к файлу
//        String pathDir = "src/main/java/homeWork";//путь к не существующей папке
        getAndPrintExtentionOfFiles(pathDir);
    }

    private static void getAndPrintExtentionOfFiles(String pathDir) {
        String[] filesNamesFromDir = convertPathToNamesArr(pathDir);
        if (filesNamesFromDir.length == 0) {
            System.out.println("В заданной директории нет файлов");
        }
        PrintExtentionOfFiles(filesNamesFromDir);
    }

    private static void PrintExtentionOfFiles(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].lastIndexOf(".") != -1 && array[i].lastIndexOf(".") != 0) {
                System.out.println((i +1) + "  Расширение файла " + array[i] + ": " + array[i].substring(array[i].lastIndexOf(".") + 1));
            } else {
                System.out.println((i +1) + "  Расширение файла " + array[i] + ": файл без расширения");
            }
        }

    }

    private static String[] convertPathToNamesArr(String pathDir) {
        File dir = new File(pathDir);
        try {
            if (dir.isFile()) {
                System.out.println("Путь " + pathDir + " ведет к файлу");
                System.exit(0);
            }
            String[] list = dir.list();
            if (list == null) {
                System.out.println("Директория не существует");
                System.exit(0);
            }
            return list;
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
            System.exit(1);
            return null;
        }
    }
}
