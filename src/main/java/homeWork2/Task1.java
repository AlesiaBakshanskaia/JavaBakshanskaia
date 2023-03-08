package homeWork2;

//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class Task1 {
    public static void main(String[] args) {
        String str = "1accan1nacca1";
        if (str.length() == 0) {
            System.out.println("Строка пуста");
        } else if (str.length() == 1) {
            System.out.println("Строка содержит только 1 символ");
        }

        boolean resultCheckStringForPalindrome = checkStringForPalindrome(str);
        if (resultCheckStringForPalindrome) {
            System.out.printf("Строка %s является палиндромом", str);
        } else {
            System.out.printf("Строка %s  не является палиндромом", str);
        }
    }

    private static boolean checkStringForPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
