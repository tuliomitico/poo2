/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author Túlio
 */
public class ThreadPoolLineCounter extends Thread{
    static ThreadPoolLineCounter[] threads = new ThreadPoolLineCounter[100];
    private static int threadCount = 0;
    
    private final File file;
    private int numLines;

    /**
     *
     * @param file
     */
    public ThreadPoolLineCounter(File file) {
        this.file = file;
    }
    public int getNumLines() {
        return numLines;
    }
    @Override
    public void run() {
        numLines = 0;
        try (LineNumberReader reader = new LineNumberReader(new FileReader(file))) {
            while (reader.readLine() != null) {
                numLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        threads[threadCount] = this;
        threadCount++;
    }
}
