package observer;

public class Jornal implements Observer{
    @Override
    public void update(Observable observable) {
        PrevisaoTempo previsaoTempo = (PrevisaoTempo) observable;
        System.out.printf("Jornal: Temperatura %.2f ºC, Umidade %.2f %%, Chuva %b%n",
                previsaoTempo.getTemperatura(), previsaoTempo.getUmidade(), previsaoTempo.isChuva());
    }
}