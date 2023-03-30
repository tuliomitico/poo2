package threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class GerarArquivosLoremIpsum {
    public static void gerarArquivos() {
        // Seta o diretorio onde os arquivos serao salvos
        String directoryPath = ".//src//threads//data//Lorem_Ipsum_Files";

        // Cria o diretorio se nao existir
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Gerar 1000 arquivos de texto com quantidade aleatorias de linhas
        for (int i = 1; i <= 1000; i++) {
            // Gerar um n randomico de linhas pro arquivo
            int numLines = new Random().nextInt(50) + 1;

            // Cria o nome do arquivo
            String fileName = "Lorem_Ipsum_" + i + ".txt";

            // Cria o caminho do arquivo
            String filePath = directoryPath + File.separator + fileName;

            // Gera Lorem Ipsum texto para o arquivo
            String loremIpsumText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue. Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede. Praesent blandit odio eu enim. Pellentesque sed dui ut augue blandit sodales. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac mauris sed pede pellentesque fermentum. Maecenas adipiscing ante non diam sodales hendrerit.";

            // Divide o texto em linhas
            String[] lines = loremIpsumText.split("\\r?\\n");

            // Escreve o texto Lorem Ipsum para o arquivo
            try (FileWriter fileWriter = new FileWriter(filePath)) {
                for (int j = 0; j < numLines; j++) {
                    String line = lines[new Random().nextInt(lines.length)];
                    fileWriter.write(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
