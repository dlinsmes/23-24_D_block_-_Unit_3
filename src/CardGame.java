import java.util.Scanner;
public class CardGame {
    public static void main(String [] args) {

        String [] suits = {"spades", "diamonds",  "hearts", "clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //print every combination of cards -
        // ex Ace of Spades, 2 of spades, etc
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                System.out.println(ranks[j] + " of " + suits[i]);
            }
        }

        //String bc array type is string
        //rank and suit are VALUES, not indices
        //print all the suits for a given rank before the next rank is printed
        for (String rank: ranks) {
            for (String suit: suits) {
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println();

        //pick a random card
        //two random numbers - one as an index for each array
        int rankI = (int)(Math.random() * 13);
        int suitI = (int)(Math.random() * 4);

        System.out.println("random card is " + ranks[rankI] + " of " + suits[suitI]);

        int [] deck = new int [52];
        for (int i = 0; i < 52; i++){
            deck[i] = i;
        }

        //0 - Ace of Spades, 1 - 2 of spades, ..., 12 - king of spades
        //13 - Ace of diamonds, ....
        //26 - Ace of hearts, ...
        //39 - Ace of clubs, ... , 51 - king of clubs

        for (int i = 0; i < 52; i++) {

            //indices [0, 12] - remainder after dividing by 13 is always [0, 12]
            String rank = ranks[ deck[i] % 13];

            //indices [0, 3]
            // use int division to get a number to use as index
            String suit = suits[ deck[i] / 13];

            System.out.println(deck[i] + " is the " + rank + " of " + suit);

        }
        System.out.println();
        System.out.println("shuffled deck:");

        //shuffle the deck
        //-use swapping and random numbers
        //-generate a random index and swap with another index
        for(int i = 0; i < 52; i++) {
            int randI = (int)(Math.random() * 52);

            int temp = deck[i];
            deck[i] = deck[randI];
            deck[randI] = temp;
        }

        //pick two random indices to swap
        for(int i = 0; i < 200; i++) {
            int randI = (int)(Math.random() * 52);
            int randI2 = (int)(Math.random() * 52);

            int temp = deck[randI2];
            deck[randI2] = deck[randI];
            deck[randI] = temp;
        }


        //print shuffled deck
        for (int i = 0; i < 52; i++) {

            //indices [0, 12] - remainder after dividing by 13 is always [0, 12]
            String rank = ranks[ deck[i] % 13];

            //indices [0, 3]
            // use int division to get a number to use as index
            String suit = suits[ deck[i] / 13];

            System.out.println(deck[i] + " is the " + rank + " of " + suit);

        }

        //user has a hand of 7 cards drawn from the top of the deck
        int [] hand = new int[7];

        //top is used as index to represent the next card in the deck
        //that hasn't been drawn yet
        //-increment top after every card draw
        int top = 0;

        for (int i = 0; i < 7; i++) {
            //add the top card to the hand
            hand[i] = deck[top];
            top++;
        }

        System.out.println();
        Scanner s = new Scanner(System.in);


        boolean fourOfKind = false;
        while (top < 52 && fourOfKind == false) {

            //print cards in hand
            System.out.println("your hand: ");
            for (int i = 0; i < 7; i++) {
                suitI = hand[i] / 13;
                rankI = hand[i] % 13;
                System.out.println(i + " - " + ranks[rankI] + " of " + suits[suitI]);
            }

            //keep asking the user for the index of the card they want to replace with
            System.out.println("what index would you like to get a new card for?");
            int index = s.nextInt();

            //a new card from deck.
            int newCard = deck[top];
            top++;

            hand[index] = newCard;

            //-continue this until the user has 4 of a kind (same rank) OR there are no more
            //cards in the deck

            //two loops - for every card, check for other cards in the hand w the same rank
            for (int i = 0; i < 7; i++) {

                rankI = hand[i] % 13;
                int countSameRank = 0;

                for(int j = 0; j < 7; j++) {
                    int rankJ = hand[j] % 13;
                    if (rankI == rankJ) {
                        countSameRank++;
                    }
                }

                if(countSameRank == 4) {
                    fourOfKind = true;
                }
            }

        }


        //print cards in hand
        System.out.println("your hand: ");
        for (int i = 0; i < 7; i++) {
            suitI = hand[i] / 13;
            rankI = hand[i] % 13;
            System.out.println(i + " - " + ranks[rankI] + " of " + suits[suitI]);
        }


    }
}
