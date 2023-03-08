package lesson2;
//Дано число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class Task1 {
    public static void main(String[] args) {
        int N = 20;
        char first = 'A';
        char second = 'B';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0){
                sb.append(first);
            } else {
                sb.append(second);
            }

        }
        System.out.println(sb);

    }
}
