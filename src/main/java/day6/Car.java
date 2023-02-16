package day6;

public class Car {
    private int yearRelease;
    private String color;
    private String modelAvto;

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelAvto() {
        return modelAvto;
    }

    public void setModelAvto(String modelAvto) {
        this.modelAvto = modelAvto;
    }

    public void info(){
        System.out.println("Это автомобиль");
        return;
    }
    public int yearDefference(int year){
        return yearDefference(year-getYearRelease());
    }
}