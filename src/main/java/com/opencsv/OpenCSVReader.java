package com.opencsv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "/home/admin1/IdeaProjects/OpenCSVProject/src/main/resources/users.csv";
    public static void main(String[] args) throws IOException {
            Reader reader = null;
            reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord=csvReader.readNext())!=null) {
                System.out.println("Name :" + nextRecord[0]);
                System.out.println("Email :" + nextRecord[1]);
                System.out.println("Phone :" + nextRecord[2]);
                System.out.println("Country :" + nextRecord[3]);
                System.out.println("=========================");
            }
    }
}
