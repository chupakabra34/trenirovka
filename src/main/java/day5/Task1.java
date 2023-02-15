package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearRelease(1990);
        car.setColor("white");
        car.setModelAvto("Lada");
        System.out.println("Name: "+ car.getModelAvto());
        System.out.println("Color: "+ car.getColor());
        System.out.println("Year of Release: "+car.getYearRelease());
    }
}
