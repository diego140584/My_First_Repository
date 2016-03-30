package com.vetclinic;

/**
 * Created by Stas on 28.03.2016.
 */
public class People {
    String firstName, lastName;
    Animals pet;

    public People(String firstName, String lastName, Animals pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPet(Animals pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (firstName != null ? !firstName.equals(people.firstName) : people.firstName != null) return false;
        if (lastName != null ? !lastName.equals(people.lastName) : people.lastName != null) return false;
        return pet != null ? pet.equals(people.pet) : people.pet == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                '}';
    }
}
