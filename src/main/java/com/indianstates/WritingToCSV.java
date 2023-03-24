package com.indianstates;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToCSV {
    public void csvWriter() throws IOException {
        File file = new File("StateCensus.csv");
        FileWriter fileWriter = new FileWriter(file);
        CSVWriter writer = new CSVWriter(fileWriter);

        String[] line1 = {"id", "state", "population"};
        String[] line2 = {"1", "Karnataka", "10000"};
        String[] line3 = {"2", "Rajasthan", "12000"};
        String[] line4 = {"3", "UP", "11000"};
        String[] line5 = {"4", "MP", "13000"};
        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        writer.writeNext(line4);
        writer.writeNext(line5);
        writer.close();
        fileWriter.close();
    }
    public static void main(String[] args) throws IOException {
        WritingToCSV writingToCSV = new WritingToCSV();
        writingToCSV.csvWriter();
    }
}
