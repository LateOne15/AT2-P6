/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberwithspaceswithfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author 30128198
 */
public class NumberWithSpacesWithFiles {

    public static void main(String[] args) {
        File inFile = new File("number.txt");
        FileWriter outFile;
        
        try {
            try (Scanner myReader = new Scanner(inFile)) {
                String data = "";
                while (myReader.hasNextLine()) {
                    data += myReader.nextLine();
                }
                
                int size = data.length();
                int number = Integer.parseInt(data);
                ArrayList<Integer> separated = new ArrayList<Integer>();
                
                while(number > 0) {
                    separated.add(number % 10);
                    number = number/10;
                }

                ArrayList<Integer> corrected = new ArrayList<Integer>();
                for(int num : separated) {
                    corrected.addFirst(num);
                }
                
                outFile = new FileWriter("separated.txt");
                String outSeparation = "";
                int i = 0;
                for(int sepNum : corrected) {
                    i++;
                    outSeparation += sepNum;
                    if (i < size) {
                        outSeparation += " ";
                    }
                }
                outFile.write(outSeparation);
                outFile.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: number.txt not found.");
            }
        } catch (IOException ex) {
            System.out.println("Error: separated.txt cannot be created.");
        }
    }
}
