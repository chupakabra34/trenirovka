package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int sum = 0;
        int index = 0;
        int sum_stroki = 0;
        for (int x = 0; x < 12; x++) for (int y = 0; y < 8; y++) array[x][y] = (int) (Math.random() * 50);
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 8; y++) {
                sum_stroki += array[x][y];
                System.out.print(" " + array[x][y]);
            }
            System.out.print(" = " + sum_stroki);
            System.out.println();
            if (sum <= sum_stroki) {
                sum = sum_stroki;
                index = x;
            }
            sum_stroki = 0;
        }
        System.out.println("Сумма строки = " + sum + " Index = " + index);
    }
}