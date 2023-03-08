package lesson2;
//Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.

public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddddd";
        if (str.length()==0) {
            System.out.println("Строка пуста");
            return;
        }
//        String str = "ab";
        char[] array = str.toCharArray();
//        System.out.println(array);
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (array[i + 1] == array[i]) {
                count++;
            } else {
                if (count > 1)  {
                    res.append(array[i]).append(count);
                } else {
                    res.append(array[i]);
                }
                count = 1;
            }

        }
        if (count > 1)  {
            res.append(array[str.length()-1]).append(count);
        } else {
            res.append(array[str.length()-1]);
        }
        System.out.println(res);

    }
}
