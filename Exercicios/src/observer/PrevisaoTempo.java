package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrevisaoTempo implements Observable{
    private double temperatura;
    private double umidade;
    private boolean chuva;
    private double velocidadeVento;

    private List<Observer> observers = new ArrayList<>();

    public void mudarEstadoAleatoriamente() {
        Random random = new Random();
        temperatura = random.nextDouble() * 40;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
    @Override
    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public boolean isChuva() {
        return chuva;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }
}
