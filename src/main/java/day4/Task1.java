package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int[] array = IntStream.range(0, n).map(x -> (int) (Math.random() * 10)).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количесто чисел больше 8 : " + (int) IntStream.range(0, n).filter(x -> array[x] > 8).count());
        System.out.println("Количесто чисел равных 1 : " + (int) IntStream.range(0, n).filter(x -> array[x] == 1).count());
        System.out.println("Количесто чётных чисел : " + (int) IntStream.range(0, n).filter(x -> array[x] % 2 == 0).count());
        System.out.println("Количесто нечётных чисел : " + (int) IntStream.range(0, n).filter(x -> array[x] % 2 != 0).count());
        System.out.println("Сумма всех элементов массива: " + IntStream.of(array).sum());
    }
}