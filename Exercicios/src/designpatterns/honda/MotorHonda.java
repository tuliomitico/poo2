package designpatterns.honda;
import designpatterns.Motor;

public class MotorHonda implements Motor {
    @Override
    public String fazVrum() {
        return "Boom!";
    }
}
