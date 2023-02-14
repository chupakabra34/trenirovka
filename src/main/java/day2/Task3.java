package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a == b || a > b) System.out.println("Не корректный ввод");
        else {
            while (a < b) {
                if (((a % 5) == 0) && ((a % 10) != 0)) {
                    System.out.print(" " + a);
                }
                a++;
            }
        }
    }
}
