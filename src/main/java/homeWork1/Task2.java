package homeWork1;

import java.util.Arrays;

//2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class Task2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 0, 5, 3, 3, 0, 3, 2, 0, 3};
        int val = 3;
        System.out.println(Arrays.toString(nums));
        nums = changeArrayThreeToEnd(nums, val);
        System.out.println(Arrays.toString(nums));
    }


    private static int[] changeArrayThreeToEnd(int[] array, int number) {
        int indexFromEnd = array.length - 1;
        int index = 0;
        while (index <= indexFromEnd) {
            if (array[index] == number && array[indexFromEnd] == number) {
                indexFromEnd--;
            } else if (array[index] == number && array[indexFromEnd] != number) {
                int temp = array[index];
                array[index] = array[indexFromEnd];
                array[indexFromEnd] = temp;
                index++;
                indexFromEnd--;
            } else if (array[index] != number && array[indexFromEnd] == number) {
                index++;
                indexFromEnd--;
            } else {
                index++;
            }
        }
        return array;
    }
}
