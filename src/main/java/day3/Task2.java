package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double chislo1;
        double chislo2 = 1;
        while (chislo2 != 0) {
            System.out.print("Введите 2 числа через пробел: ");
            chislo1 = in.nextDouble();
            chislo2 = in.nextDouble();
            if (chislo2!=0){
                System.out.println("Результат: " + (chislo1/chislo2));
            }
        }
    }
}