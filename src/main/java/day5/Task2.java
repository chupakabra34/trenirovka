package day5;

public class Task2 {
    public static void main(String[] args) {
        MotorBake motorBake = new MotorBake(1982, "Chizet", "Red");
        System.out.println("Name: " + motorBake.getModel());
        System.out.println("Color: " + motorBake.getColor());
        System.out.println("Year of Release: " + motorBake.getYearRelease());
    }
}
