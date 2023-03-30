/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.*;
/**
 *
 * @author Túlio
 */
public class SequentialLineCounter {
    private File file;
    private int numLines;

    public SequentialLineCounter(File file) {
        this.file = file;
    }

    public SequentialLineCounter countLines() {
        numLines = 0;
        try (LineNumberReader reader = new LineNumberReader(new FileReader(file))) {
            while (reader.readLine() != null) {
                numLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println("O arquivo " + file.getName() + " tem " + numLines + " linhas.");
        return this;
    }

    public int getNumLines() {
        return numLines;
    }
}
