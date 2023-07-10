package org.example;

public class Person {

    String firstName;
    String lastName;
    int age;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    boolean isTeen() {
        return age > 12 && age < 20;
    }

    String getFullName() {
        if (lastName.isEmpty())
            return firstName;

        if (firstName.isEmpty())
            return lastName;

        return firstName + " " + lastName;
    }


}
