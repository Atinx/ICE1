package exercise1;

import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Atinx
 * @author Atin Jan 31, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] cardNum = new int[7];
        String[] suitName = new String[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
           
            //card.setValue(insert call to random number generator here)
            card.setValue(rand.nextInt(13));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            //hand[i] = card.setValue(rand.nextInt(13));
            
            cardNum[i] = card.getValue();
            suitName[i] = card.getSuit();
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        System.out.println("Choose a card using an int value with 1-10 and 11 for Jack, 12 for queen, 13 for King: ");
        int yourCardNum = input.nextInt();
        System.out.println("Choose your Suit 1 for for Hearts, 2 for Diamonds, 3 for Spades and 4 for Clubs");
        int yourCardSuit = (input.nextInt()-1);
        
        System.out.println("The card you chose is " + yourCardNum + " of " + Card.SUITS[yourCardSuit]);
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        boolean match = false;
        for(int i = 0; i< hand.length; i++){
            
            if(yourCardNum == cardNum[i] && Card.SUITS[yourCardSuit].equals(suitName[i])){
                match = true;
            }
        }
        // Then loop through the cards in the array to see if there's a match.
        if(match){
            printInfo();
        }
        // If the guess is successful, invoke the printInfo() method below.
        
    }
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        //I'm Done!!
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Atin");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on Social Media");
        System.out.println("-- Enjoy each and everything ");
	System.out.println();	

        System.out.println("My hobbies are:");
        System.out.println("-- Walking");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Laying on my bed");

        System.out.println();
        
    
    }

}
