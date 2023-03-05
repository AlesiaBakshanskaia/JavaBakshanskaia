package homeWork1;
//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        findMinMaxInArray();
    }

    private static void findMinMaxInArray() {
        double[] array = getRandomArray();
        System.out.println(Arrays.toString(array));
        double max = array[0];
        double min = array[0];
        for (double item : array){
            if (item > max){
                max = item;
            } else if (item < min) {
                min = item;
            }
        }
        System.out.printf("%nМинимальное значение в массиве равно %.2f, а максимальное значение равно %.2f", min, max);
    }

    private static double[] getRandomArray() {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++){
            array[i] = generateRandomDouble();
        }
        return array;
    }

    private static double generateRandomDouble() {
        double min = -100;//минимальное рандомное значение
        double max = 100;//максимальное рандомное значение
        double diff = max - min;
        Random random = new Random();
        double randomNum = random.nextDouble();
        randomNum = min + randomNum * (max - min);
        BigDecimal roundRandomNum = new BigDecimal(randomNum);
        roundRandomNum = roundRandomNum.setScale(2, RoundingMode.HALF_EVEN);//округление рандомного значения до 2 знаков после запятой
        double result = roundRandomNum.doubleValue();//преобразование в тип double
        return result;
    }
}
