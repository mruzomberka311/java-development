package com.pluralsight;

import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck playingDeck = new Deck();
        playingDeck.shuffle();
        Hand playerHand = new Hand();
        playerHand.deal(playingDeck.deal());
        Hand dealerHand = new Hand();
        dealerHand.deal(playingDeck.deal());

        playerHand.print();
        dealerHand.print();



        boolean isPlayerTurn = true;

        while (isPlayerTurn = true){
            String choice = scanner.nextLine();

            System.out.println("Would you like to hit or stand?");
            if (choice.equalsIgnoreCase("Hit"))
            {
                playerHand.deal(playingDeck.deal());
                playerHand.print();
                return;
            }
            if (choice.equalsIgnoreCase("Stand")){
                playerHand.print();
            }
        }

        isPlayerTurn = false;

        boolean isDealerTurn = true;

        while (isDealerTurn = true)
        {
            String dealerChoice = scanner.nextLine();
            System.out.println("Would the dealer like to hit or stand?");
            if (dealerChoice.equalsIgnoreCase("Hit"))
            {
                dealerHand.deal(playingDeck.deal());
                dealerHand.print();
                return;
            }
            if (dealerChoice.equalsIgnoreCase("Stand"))
            {
                dealerHand.print();
            }
        }
        int playerHandValue = playerHand.getValue();
        int dealerHandValue = playerHand.getValue();

        if (playerHandValue > dealerHandValue && playerHandValue < 21){
            System.out.println("The player has won!");
        }
        if (dealerHandValue > playerHandValue && dealerHandValue < 21){
            System.out.println("The Dealer has won :(");
        }

    }


}
