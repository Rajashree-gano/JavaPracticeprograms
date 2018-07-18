package com.stackroute.coding;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileLen {

    public  String upperCase(String filePath) {
        try {
            FileReader file = new FileReader(filePath);
            BufferedReader b = new BufferedReader(file);
            for (String line; (line = b.readLine()) != null;) {

                String Upper = line.toUpperCase();
                return Upper;
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public  String fileLength(String filePath) {
        try {
            File f = new File(filePath);
            double len = f.length();
            String leng = Double.toString(len);

            return leng;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}