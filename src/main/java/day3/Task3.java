package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double chislo1;
        double chislo2;
        for (int x = 0; x < 5; x++) {
            System.out.print("Введите 2 числа через пробел: ");
            chislo1 = in.nextDouble();
            chislo2 = in.nextDouble();
            System.out.println(chislo2 != 0 ? "Результат: " + (chislo1 / chislo2) : "Деление на ноль");
        }
    }
}
