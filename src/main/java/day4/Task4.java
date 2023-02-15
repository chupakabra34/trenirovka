package day4;

import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int index=0;
        int itog=0;
        int[] array = IntStream.range(0, 100).map(x -> (int) (Math.random() * 10000)).toArray();
        for(int x=1;x<98;x++){
            int sum;
            sum=array[x-1]+array[x]+array[x+1];
            if(itog<sum){
                itog=sum;
                index=x-1;
            }
        }
        System.out.println("Summa = "+ itog+ " Index = "+ index);
    }
}