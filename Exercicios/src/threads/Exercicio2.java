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
    public static void main(String[] args) {
        File folder;
        folder = new File(".\\src\\threads\\data");
        File[] files = folder.listFiles();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        Thread[] threads = new Thread[files.length];
        
        long startThreadPoolTime = System.currentTimeMillis();
        
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() && files[i].getName().endsWith(".txt")) {
                executor.submit(new PureThreadLineCounter(files[i]));
                //threads[i] = new PureThreadLineCounter(files[i]);
                //threads[i].start();
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
        
        System.out.println(endThreadPoolTime);
        
        long startPureThreadTime = System.currentTimeMillis();
        for (int i = 0; i < files.length; i++) {
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
        System.out.println(endPureThreadTime);
        
        long startSequentialTime = System.currentTimeMillis();
        totalLines = 0;
        for (File file : folder.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                totalLines += new SequentialLineCounter(file).getNumLines();
            }
        }
        long endSequentialTime = System.currentTimeMillis() - startSequentialTime;
        System.out.println(endSequentialTime);
        System.out.println("O número total de linhas em todos os arquivos é: " + totalLines);
    }
}
