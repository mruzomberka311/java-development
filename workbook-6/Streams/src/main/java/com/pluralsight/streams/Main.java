package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    ArrayList<Person> people = new ArrayList<>();

    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Person person1 = new Person("Spongebob", "Squarepants", 15);
        Person person2 = new Person("Patrick", "Star", 15);
        Person person3 = new Person("Squidward", "Tenticles", 40);
        Person person4 = new Person("Eugene", "Krabs", 50);
        Person person5 = new Person("Eugene", "Plankton", 50);
        Person person6 = new Person("Sandy", "Cheeks", 28);
        Person person7 = new Person("Pearl", "Krabs", 16);
        Person person8 = new Person("Gary", "Squarepants", 9);
        Person person9 = new Person("Mermaid", "Man", 82);
        Person person10 = new Person("Barnacle", "Boy", 80);

        System.out.println("Please enter a name");
        String name = scanner.nextLine();
        filterByName(name);
        System.out.println("Would you like to find the average age?");
        getAverageAge();
        String max = scanner.nextLine();
        displayOldest(max);
        String min = scanner.nextLine();
        displayYoungest(min);


    }
        public void filterByName(String name){
            for (Person person : people) {
                if (name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName())) {
                    List<Person> nameList = new ArrayList<>();
                    nameList.add(person);
                    System.out.println(nameList);
                }
            }
        }


        public void getAverageAge(){
            double totalAge = 0;
            for (Person person : people) {
                totalAge += person.getAge();
                double averageAge = totalAge /= people.size();
                System.out.println(averageAge);
            }
        }

        public void displayOldest (String max) {
            for (Person person : people){
                System.out.println(Math.max(person.getAge(),));  
            }
        }

        public void displayYoungest (String min) {
            for (Person person : people) {
                System.out.println(Math.min(person.getAge(people)));
            }
        }



}
