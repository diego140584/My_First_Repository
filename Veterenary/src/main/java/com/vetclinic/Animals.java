package com.vetclinic;

/**
 * Created by Stas on 28.03.2016.
 */
public class Animals {
    private String type, breed, name;
    private int age;
    private double weight;


    public Animals(String type, String breed, String name, int age, double weight) {
        this.type = type;
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animals animals = (Animals) o;

        if (age != animals.age) return false;
        if (Double.compare(animals.weight, weight) != 0) return false;
        if (type != null ? !type.equals(animals.type) : animals.type != null) return false;
        if (breed != null ? !breed.equals(animals.breed) : animals.breed != null) return false;
        return name != null ? name.equals(animals.name) : animals.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight ;
    }
}
