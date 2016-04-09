package com.users;

/**
 * Created by Stas on 06.04.2016.
 */
public class Users {
    String FirstName, LastName;
    int Age;

    public Users(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (Age != users.Age) return false;
        if (FirstName != null ? !FirstName.equals(users.FirstName) : users.FirstName != null) return false;
        return LastName != null ? LastName.equals(users.LastName) : users.LastName == null;

    }

    @Override
    public int hashCode() {
        int result = FirstName != null ? FirstName.hashCode() : 0;
        result = 31 * result + (LastName != null ? LastName.hashCode() : 0);
        result = 31 * result + Age;
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
