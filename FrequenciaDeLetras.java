import java.util.HashMap;
import java.util.Map;

public class FrequenciaDeLetras {
    public void conta_letras(String sequencia) {
        Map<Character,Integer> dicionario = new HashMap<>();
        int aux;
        for (int i = 0; i < sequencia.length(); i++) {
            char c = sequencia.charAt(i);
            if (dicionario.containsKey(c)) {
                aux = dicionario.get(c);
                dicionario.put(c, aux + 1);
            } else {
                dicionario.put(c, 1);
            }


        }
        System.out.println(dicionario);
    }
}
