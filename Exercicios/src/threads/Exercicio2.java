/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Túlio
 */
public class Exercicio2 {
    /**
     * A máquina utilizada para a leitura dos arquivos é um Processador Ryzen 7 5800H, Arch Linux com KDE, 32 GB de RAM
     *
     * Tempos em milissegundos com 1000 arquivos:
     * Executor 143 milissegundos
     * Threads 68 milissegundos
     * Sequencial 39 milissegundos
     *
     * Tempos em milissegundos com 10 arquivos:
     * Executor 12 milissegundos
     * Threads 10 milissegundos
     * Sequencial 2 milissegundos
     *
     * Tempos em milissegundos com 100 arquivos:
     * Executor 89 milissegundos
     * Threads 9 milissegundos
     * Sequencial 5 milissegundos
     *
     *
     * A impressao que fica eh q a maquina eh forte o suficiente para executar todos arquivos e contar as linhas
     * de forma que ocorre um overhead em separar os processos e no final juntar as informacoes que no caso
     * eh a soma dos numeros de linhas dos arquivos TXT
     */
    public static void main(String[] args) {
        // GerarArquivosLoremIpsum.gerarArquivos();
        File folder;
        folder = new File(".//Exercicios//src//threads//data//Lorem_Ipsum_Files");
        File[] files = folder.listFiles();
        System.out.println(files.length);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        Thread[] threads = new Thread[files.length];
        
        long startThreadPoolTime = System.currentTimeMillis();
        
        for (int i = 0; i < files.length - 900; i++) {
            if (files[i].isFile() && files[i].getName().endsWith(".txt")) {
                executor.submit(new PureThreadLineCounter(files[i]));
            }
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int totalLines = 0;
        for (int i = 0; i < ThreadPoolLineCounter.threads.length; i++) {
            if (ThreadPoolLineCounter.threads[i] != null) {
                totalLines += ThreadPoolLineCounter.threads[i].getNumLines();
            }
        }
        long endThreadPoolTime = System.currentTimeMillis() - startThreadPoolTime;
        
        System.out.println(endThreadPoolTime + " milissegundos");
        
        long startPureThreadTime = System.currentTimeMillis();
        for (int i = 0; i < files.length - 900; i++) {
            if (files[i].isFile() && files[i].getName().endsWith(".txt")) {
                
                threads[i] = new PureThreadLineCounter(files[i]);
                threads[i].start();
            }
        }
        totalLines = 0;
        for (int i = 0; i < threads.length; i++) {
            if (threads[i] != null) {
                try {
                    threads[i].join();
                    totalLines += ((PureThreadLineCounter) threads[i]).getNumLines();
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long endPureThreadTime = System.currentTimeMillis() - startPureThreadTime;
        System.out.println(endPureThreadTime + " milissegundos");

        long startSequentialTime = System.currentTimeMillis();
        totalLines = 0;
        for (int i = 0; i < files.length - 900; i++) {
            if (files[i].isFile() && files[i].getName().endsWith(".txt")) {
                totalLines += new SequentialLineCounter(files[i]).countLines().getNumLines();
            }
        }
        long endSequentialTime = System.currentTimeMillis() - startSequentialTime;
        System.out.println(endSequentialTime + " milissegundos");
        System.out.println("O número total de linhas em todos os arquivos é: " + totalLines);
    }
}
