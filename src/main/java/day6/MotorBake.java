package day6;

public class MotorBake {
    private int yearRelease;
    private String color;
    private String model;

    public MotorBake(int yearRelease, String model, String color) {
        this.yearRelease = yearRelease;
        this.color = color;
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
        return;
    }
    public int yearDefference(int year){
        return yearDefference(year-getYearRelease());
    }
}