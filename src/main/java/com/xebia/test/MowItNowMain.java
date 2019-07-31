package com.xebia.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MowItNowMain {

    public static void main(String[] args) {
        File inputFile = new File(MowItNowMain.class.getClassLoader().getResource("input.txt").getFile());
        String input = readFileContent(inputFile);
        new MowItNow(input);
    }

    private static String readFileContent(File file){
        String content = "";
        try {
            content = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e){
            System.out.println("Erreur de lecture du fichier d'entrée");
        }
        return content;
    }
}
