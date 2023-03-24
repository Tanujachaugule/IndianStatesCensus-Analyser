package com.indianstates;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StateCensusAnalyzer {

    public int loadAnalyzer() throws Exception {
        int count = 0, lineNumber = 0;
        ArrayList<Census> censusList = new ArrayList<>();
        File file;
        CSVReader reader;
        try {
            try {
                file = new File("StateCensus.csv");
                reader = new CSVReader(new FileReader(file));
            } catch (RuntimeException e) {
                //Catches custom incorrect file exception
                throw new CustomExceptionIncorrectFile();
            }
            String[] line;
            while ((line = reader.readNext()) != null) {
                try {
                    if (lineNumber == 0) {
                        System.out.println(new Header(line[0], line[1], line[2]));
                        lineNumber++;
                        continue;
                    }
                    ++count;
                    censusList.add(new Census(Integer.valueOf(line[0]), line[1], line[2]));
                    //Catches custom incorrect type and header file exception
                } catch (NumberFormatException e) {
                    throw new TypeIncorrect();
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new HeaderException();
                }
            }
            if (count != censusList.size()) {
                //Catches custom incorrect file exception
                throw new CustomExceptionIncorrectFile();
            }
            censusList.forEach(System.out::println);

        } catch (CustomExceptionIncorrectFile | TypeIncorrect | HeaderException | DelimiterIncorrectException e) {
            System.out.println(e);
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        StateCensusAnalyzer analyzer = new StateCensusAnalyzer();
        int c = analyzer.loadAnalyzer();
        System.out.println(c);
    }
}
