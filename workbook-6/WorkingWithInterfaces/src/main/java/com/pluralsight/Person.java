package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }




    @Override
   public int compareTo(Person myFamily){
        int last = this.lastName.compareTo(myFamily.lastName);
        return last == 0 ? this.firstName.compareTo(myFamily.firstName) : last;

    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
