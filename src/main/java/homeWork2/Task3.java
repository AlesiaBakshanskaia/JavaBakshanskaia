package homeWork2;




import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

//3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
public class Task3 {
    static Logger logger = Logger.getLogger("Task3");
    public static void main(String[] args) {
        String pathDir = "src/main/java/homeWork";
        printExtensionOfFiles(pathDir);
    }

    private static void printExtensionOfFiles(String pathDir) {
        String[] filesNamesFromDir = convertPathToNamesArr(pathDir);
//        System.out.println(Arrays.toString(filesNamesFromDir));
        getAndPrintExtentionOfFiles(filesNamesFromDir);
    }

    private static void getAndPrintExtentionOfFiles(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].lastIndexOf(".") != -1 && array[i].lastIndexOf(".") != 0) {
                System.out.println((i +1) + "  Расширение файла: " + array[i].substring(array[i].lastIndexOf(".") + 1));
            } else {
                System.out.println((i +1) + "  Расширение файла: файл без расширения");
            }
        }

    }

    private static String[] convertPathToNamesArr(String pathDir) {
        File dir = new File(pathDir);
        if (!dir.isDirectory()) {
            throw new RuntimeException("По указанному пути не было найдено директории: " + pathDir);
        }
        return dir.list();
//        try {
//            dir.exists();
//            return dir.list();
//        } catch (IOException e) {
//            logger.warning(e.getMessage());
//            throw new RuntimeException("Файл не найден по пути: " + pathDir);
//            System.exit(1);
//        }
    }
}
