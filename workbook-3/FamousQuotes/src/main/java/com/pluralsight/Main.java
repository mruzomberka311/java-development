package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try {
            String[] famousQuotes = {"The successful warrior is the average man, with laser-like focus. Bruce Lee", "Keep calm and carry on. Winston Churchill", "Little by little, one travels far. J.R.R. Tolkien", "God helps those that help themselves. Benjamin Franklin", "Not all those who wander are lost. J.R.R. Tolkien", "We don’t want to tell our dreams. We want to show them. Cristiano Ronaldo", "I’ve failed over and over and over again in my life and that is why I succeed. Michael Jordan", "I came, I saw, I conquered. Julius Caesar", "Those who dare to fail miserably can achieve greatly. John F. Kennedy", "The greatest wealth is to live content with little. Plato", "It’s not whether you get knocked down, it’s whether you get up. Vince Lombardi"};

            System.out.println("Choose a quote between 1 and 10: ");

            System.out.println(famousQuotes[scanner.nextInt()]);
        }
        catch (Exception ex){
            System.err.println("Number is out of the bounds");
        }

    }
}