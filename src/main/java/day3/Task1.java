package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String town = "";
        while (!town.equals("stop")) {
            System.out.print("Введите город: ");
            town = in.nextLine();
            switch (town) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println(" Россия ");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println(" Италия ");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println(" Англия ");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println(" Германия ");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
    }
}