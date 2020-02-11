package com.company;
import java.util.Scanner;

public class Main {
    static int max = 13;
    static int min = 1;
    static int range = max - min + 2;
    static int length = 1000;
    static int[] firstDeck = new int[length];
    static int[] secondDeck = new int[length];
    static int firstWins = 0;
    static int secondWins = 0;

    public static void main(String[] args) {
	Scanner userLength = new Scanner(System.in);
	System.out.println("What size would you like the decks to be?");
	length = userLength.nextInt();
	generateDecks(length);
	compareDecks();
	determineWinner();
    }


    public static void generateDecks(int length){
        for (int i = 0; i < length; i++){
        firstDeck[i] = (int)(Math.random()*range);
        secondDeck[i] = (int)(Math.random()*range);
        if (firstDeck[i] == 0){
            firstDeck[i] = 1;
        } else if (secondDeck[i] == 0){
            secondDeck[i] = 1;
        }
        }
        printDeck(firstDeck);
        printDeck(secondDeck);

    }

    public static void printDeck(int[] deck){
        for (int i = 0; i < length; i++){
            System.out.print(deck[i]+" ");
        }
        System.out.print("\n");
    }

    public static void compareDecks(){
        for (int i = 0; i < length; i++){
            if (firstDeck[i]>secondDeck[i]){
                firstWins = firstWins + 1;
            } else if (secondDeck[i]>firstDeck[i]){
                secondWins = secondWins + 1;
            } else {
            }
        }
    }

    public static void determineWinner(){
        if (firstWins > secondWins){
            System.out.print("Player 1 Wins!");
        } else if (secondWins > firstWins){
            System.out.print("Player 2 Wins!");
        } else if (firstWins == secondWins){
            System.out.print("Player 1 and Player 2 Tied!");
        }
    }

}
