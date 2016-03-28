package com.vetclinic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Stas on 28.03.2016.
 */
public class Clinic {
    String name, lastName, petsType, petsBreed, petsName;
    int petsAge;
    double petsWeight;
    List<People> peoples = new ArrayList<>();
    char choice;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void addVisitors() throws IOException

    {
        while (true) {

            System.out.println("Enter your Name");
            try {
                name = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter your LastName");
            try {
                lastName = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter your pets type");
            try {
                petsType = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter your pets breed");
            try {
                petsBreed = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter your pets name");
            try {
                petsName = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter your pets age");
            try {
                petsAge = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter your pets weight");
            try {
                petsWeight = Double.parseDouble(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            Animals animals1 = new Animals(petsType, petsBreed, petsName, petsAge, petsWeight);
            People people1 = new People(name, lastName, animals1);

            peoples.add(people1);

            System.out.println("add another visitor - y, exit - n");
            choice = (char) System.in.read();
            if (choice == 'n')
                break;


        }
    }

    public void getVisitors() {
        for (People people : peoples) {
            System.out.println(people);
        }

    }

}
