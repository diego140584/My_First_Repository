package com.vetclinic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Stas on 28.03.2016.
 */
public class Clinic {
    private String name, lastName, petsType, petsBreed, petsName;
    private int petsAge;
    private double petsWeight;
    private List<People> peoples = new ArrayList<>();
    private boolean flag;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Add visitor name, last name and add pets.
     */

    public void addVisitors()

    {

        System.out.println("Enter your FirstName");
        try {
            name = br.readLine();
        } catch (NullPointerException e) {
            e.printStackTrace();
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
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Enter your pets weight");
        try {
            petsWeight = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animals animals1 = new Animals(petsType, petsBreed, petsName, petsAge, petsWeight);
        People people1 = new People(name, lastName, animals1);

        peoples.add(people1);


        System.out.println("End of adding visitor.");
    }


    /**
     * Search by human name and last name.
     *
     * @param lastName
     */
    public void SearchByHuman(String name, String lastName) {
        flag = false;
        for (People people : peoples) {
            if (people.firstName.equalsIgnoreCase(name) && people.lastName.equalsIgnoreCase(lastName)) {
                System.out.println(people);
                flag = true;
            }
            if (flag == false)
                System.out.println("Sorry we don't have   visitor with name " + name + " " + lastName);
        }

    }

    public void SearchByPetsType(String petsType) {
        flag = false;
        for (People people : peoples) {
            if (people.pet.getType().equalsIgnoreCase(petsType)) {
                System.out.println(people);
                flag = true;
            }
            if (flag == false)
                System.out.println("Sorry we don't have   visitor with name " + petsType);
        }

    }

    /**
     * Get info about all visitors and their pets from people's list.
     */

    public void getVisitors() {
        for (People people : peoples) {
            System.out.println(people);
        }

    }
}
