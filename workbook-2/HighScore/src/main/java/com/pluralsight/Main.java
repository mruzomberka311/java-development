package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the score of the game? in format (Home:Visitor|0:0)");
        String score = scanner.nextLine();

        String home = score.substring(14,15);
        String away = score.substring(17);

        int homeScore = Integer.parseInt(home);
        int awayScore = Integer.parseInt(away);

        if (homeScore > awayScore) {
            System.out.println("Home team wins!" + homeScore + " - " + awayScore);
        }else {
            System.out.println("Visitors win!" + awayScore + " - " + homeScore);

            scanner.close();

        }
    }
}
