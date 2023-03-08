package homeWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Task2 {
    public static void main(String[] args) {
        String str = "TEST";
        int num = 100;
        String newString = getNewStringStrTimesNum(str,num);
        printStringToFile(newString);
    }

    private static void printStringToFile(String str) {
        String pathFile = "src/main/java/homeWork2/File100TEST.txt";
        File fileForStr = new File(pathFile);
        if (!fileForStr.exists()) {
            try {
                fileForStr.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage() + " " + pathFile);
            }
        }
        try (FileWriter fw = new FileWriter(fileForStr, false)) {
            fw.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String getNewStringStrTimesNum(String str, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
