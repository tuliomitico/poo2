package observer;
public class Agricultor implements Observer {
    @Override
    public void update(Observable observable) {
        PrevisaoTempo previsaoTempo = (PrevisaoTempo) observable;
        System.out.printf("Agricultor: Temperatura %.2f ºC" +
                        ", Umidade %.2f %%, Chuva %b%n",
                previsaoTempo.getTemperatura(), previsaoTempo.getUmidade(), previsaoTempo.isChuva());
    }
}
