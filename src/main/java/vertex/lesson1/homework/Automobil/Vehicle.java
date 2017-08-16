package vertex.lesson1.homework.Automobil;

public class Vehicle {

    private String model;
    private String color;
    private String make;

    public Vehicle(String m, String c, String mk) {
        model = m;
        color = c;
        make = mk;

    }

    public String getMarka() {
        return model;
    }

    public void setMarka(String marka) {
        this.model = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
