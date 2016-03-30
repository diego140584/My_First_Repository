package com.vetclinic;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Stas on 30.03.2016.
 */
public class Search {
    private Clinic clinic;
    private static int choiceCount;
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    Search() throws IOException {
        clinic = new Clinic();
        while (true) {
            setChoice();
            if (choiceCount == 0)
                break;
            process(choiceCount);
        }
    }


    private void setChoice() {
        System.out.println("Please select your choice:\n1-Add Visitor.\n2-Search visitors\n3-Show pets\n4-Show all visitors\n0-Exit");
        do {
            try {
                System.out.println("Enter 0-4:");
                choiceCount = Integer.parseInt(bf.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (choiceCount == 0) {
                System.out.println("Bye-bye!!!");
                return;
            }
            if (choiceCount < 0 || choiceCount > 4) {
                System.out.println("Please make right choice");
            }
        }
        while (choiceCount < 0 || choiceCount > 4);
    }

    private void process(int choice) {

        switch (choice) {
            case 1:
                clinic.addVisitors();

                break;
            case 2:
                clinic.SearchByHuman(JOptionPane.showInputDialog("Enter search name"), JOptionPane.showInputDialog("Enter search lastName"));
                break;
            case 3:
                clinic.SearchByPetsType(JOptionPane.showInputDialog("Enter pets type"));
                break;
            case 4:
                clinic.getVisitors();
        }
    }

}
