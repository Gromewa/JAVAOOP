package vertex.lesson1.Arhivs;

public class Automobile {
    public double speed;
    public boolean engineStatus;

    public Automobile() {
        speed = 0;
        engineStatus = false;
    }

    public void setSpeed(double sp) {
        this.speed = sp;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setEngineOn() {
        this.engineStatus = true;
    }

    public void setEngineOff() {
        this.engineStatus = false;
    }

    public boolean isDrive() {
        if (speed > 0) {
            return true;
        } else return false;

    }


}
