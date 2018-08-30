/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rancor;

import Fourteeners.Mountain;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class Rancor {

    public static ArrayList<Mountain> listOfObjects;
    public static String fileLocation = "/home/bryan/Projects/14erDetails.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        listOfObjects = new ArrayList();
        getInput();

        try {
            openFile(fileLocation);
        } catch (IOException ex) {
            Logger.getLogger(Rancor.class.getName()).log(Level.SEVERE, null, ex);
        }

        Collections.sort(listOfObjects, new SortByTotalDifficulty());

        printList();
    }

    public static void openFile(String filename) throws FileNotFoundException, IOException {

        String line = null;

        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            String itemElements[] = line.split(",");
            if (itemElements[0].compareToIgnoreCase("mountain") == 0) {
                line = bufferedReader.readLine();
                itemElements = null;
                itemElements = line.split(",");
            }
            String tempName = itemElements[0];
            int tempElements[] = new int[itemElements.length - 1];

            for (int i = 0; i < tempElements.length; i++) {
                tempElements[i] = Integer.parseInt(itemElements[i + 1]);
            }

            listOfObjects.add(new Mountain(tempName, tempElements[0], tempElements[1], tempElements[2], tempElements[3], tempElements[4]));

        }

        // Always close files.
        bufferedReader.close();

    }
    
    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        
        System.out.println("Welcome to the Rancor!\nYou are rating Mountains.");
        System.out.println("To exit at any time, just type exit.");
        System.out.println("Would you like to change which file you are accessing?");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            System.out.print("Please enter a full path to file location: ");
            input = scanner.nextLine();
            fileLocation = null;
            fileLocation = input;
        }
        
        while (input == null || !input.equalsIgnoreCase("exit")) {
            System.out.println("Would you like to change a scale of a parameter in the ranking?");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                System.out.println("Which parameter?");
                System.out.println("1. Elevation\n2. Exposure\n3. Elevation Gain");
                System.out.println("4. Round Trip Distance\n5. Technical Rating");
                input = scanner.nextLine();
                int inputNumber = Integer.parseInt(input);
                switch (inputNumber) {
                    case 1:
                        System.out.println("Ok, what's the new elevation?");
                        input = scanner.nextLine();
                        break;
                }
            }
        }
    }

    public static void printList() {
        for (int i = 0; i < listOfObjects.size(); i++) {
            System.out.println(listOfObjects.get(i).getName() + ":\t" + listOfObjects.get(i).getTotalDifficulty());
        }
    }

}

class SortByTotalDifficulty implements Comparator<Mountain> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Mountain a, Mountain b) {
        return b.getTotalDifficulty() - a.getTotalDifficulty();
    }
}
