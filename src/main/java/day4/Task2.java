package day4;

import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 100).map(x -> (int) (Math.random() * 10000)).toArray();
        int min = array[0];
        int max = array[0];
        int kolvo = 0;
        int sum = 0;
        for (int x : array
        ) {
            if (x < min) min = x;
            if (x > max) max = x;
            if (x % 10 == 0) {
                kolvo += 1;
                sum += x;
            }
        }
        System.out.println("MIN=" + min + " MAX=" + max + " Кол-во элементов - " + kolvo + " Сумма элементов - " + sum);
    }
}
