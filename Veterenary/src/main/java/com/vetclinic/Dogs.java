package com.vetclinic;

/**
 * Created by Stas on 28.03.2016.
 */
public class Dogs extends Animals {
    private String type, breed, name;
    private int age;
    private double weight;
    private People master;

    Dogs(String type, String breed, String name, int age, double weight) {
        super(type, breed, name, age, weight);
    }
}
