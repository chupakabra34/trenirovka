package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввесдите число: ");
        int in = scanner.nextInt();
        if (in < 0) {
            System.out.println("Ошибка ввода");
        } else if (in > 0 && in < 5) {
            System.out.println("Малоэтажный дом");
        } else if (in > 4 && in < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (in > 8) {
            System.out.println("Высокоэтажный дом");
        }
    }
}