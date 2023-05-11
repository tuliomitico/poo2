package observer;
public class Aeroporto implements Observer {
    @Override
    public void update(Observable observable) {
        PrevisaoTempo previsaoTempo = (PrevisaoTempo) observable;
        System.out.printf("Aeroporto: Velocidade do Vento %.2f km/h%n",previsaoTempo.getVelocidadeVento());
    }
}