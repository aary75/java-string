// Creating the GameOfCards class to distribute all cards randomly in given number of players
import java.util.Scanner;
import java.util.Random;

public class GameOfCards {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in); // Scanner class to get user's input

         String[] deck = {"Hearts","Diamonds","Spades","Clubs"};  // All  decks

         String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}; //Al cards

         int numberOfCards = deck.length * rank.length; // get total number of players
         
         String[][] rankCards = new String[deck.length][rank.length]; // Array to give rank to cards

         rankCards = createRank(deck,rank);  // array after giving rank to cards

        String[][] shuffle = new String[deck.length][rank.length]; // array to shuffle the cards

        shuffle = shuffledDeck(rankCards,deck,rank); // array after shuffling the cards

        int numberOfPlayers = scanner.nextInt(); // get total number of players

       int numberOfCardsGet = numberOfCards/ numberOfPlayers;  // get total number of cards every player get after distribution

       String[][] cardsGet = new String[numberOfPlayers][numberOfCardsGet];  // array to distribute cards

       cardsGet = getCards(shuffle,numberOfCardsGet,numberOfPlayers,deck,rank);  // distributed cards to players

       // Printingt the distributed cards to players
       for(int i = 0; i< numberOfPlayers; i++) {
             System.out.println("Player " + (i + 1) +" have: ");

             for(int j = 0; j < numberOfCardsGet;j++){
                  System.out.println("Rank: " + cardsGet[i][j]);
             }
          System.out.println();
       }

}

// Call the function to give rank to cards
public static String[][] createRank(String[] deck,String[] rank){
             
          String[][] rankCards = new String[deck.length][rank.length];
          
          for(int i = 0;i<deck.length;i++){
             for(int j = 0; j<rank.length; j++){
                 rankCards[i][j] = rank[j] + " " + deck[i];
                
             }
          }
     return rankCards;
}


// Call the function shuffleDeck to shuffle the cards
public static String[][] shuffledDeck(String[][] rankCards,String[] deck,String[] rank) {
          
          Random random = new Random();

         for(int i = 0; i < deck.length; i++ ){
                 for(int j = 0; j < rank.length; j++) {

                   int randomDeck = random.nextInt(deck.length); //get random deck
                   int randomRank = random.nextInt(rank.length);  // get random rank
            
                   String randomCard = rankCards[randomDeck][randomRank];  // get random card

                   String card = rankCards[i][j];
                   rankCards[i][j] = randomCard;
                   randomCard = card;
                   
                }
          }
    return rankCards;
}

// Call the function to getCards after distribution
public static String[][] getCards(String[][] shuffle,int numberOfCardsGet,int numberOfPlayers,String[] deck,String[] rank) {
                 
               String[][] cardsGet = new String[numberOfPlayers][numberOfCardsGet];
               
               Random random = new Random();

               for(int i = 0; i< numberOfPlayers;i++) {
                   for(int j = 0; j< numberOfCardsGet; j++) {

                     int randomDeck = random.nextInt(deck.length);
                     int randomRank = random.nextInt(rank.length); 

                     cardsGet[i][j] = shuffle[randomDeck][randomRank]; // distribute random card
                   }
               }

     return cardsGet;
}
}


// Input: Number of players: 13
//Output:
// Player 1 have:
// Rank: Jack Spades
// Rank: Queen Spades
// Rank: 10 Clubs
// Rank: 9 Spades

// Player 2 have:
// Rank: 4 Clubs
// Rank: 8 Spades
// Rank: 3 Clubs
// Rank: 9 Spades

// Player 3 have:
// Rank: 4 Diamonds
// Rank: Queen Spades
// Rank: Jack Spades
// Rank: 4 Clubs

// Player 4 have:
// Rank: 6 Spades
// Rank: 3 Clubs
// Rank: King Clubs
// Rank: 4 Clubs

// Player 5 have:
// Rank: Queen Spades
// Rank: 4 Clubs
// Rank: 9 Spades
// Rank: 2 Clubs

// Player 6 have:
// Rank: 8 Spades
// Rank: 10 Clubs
// Rank: 9 Spades
// Rank: 9 Spades

// Player 7 have:
// Rank: Jack Clubs
// Rank: King Spades
// Rank: 9 Spades
// Rank: King Clubs

// Player 8 have:
// Rank: 8 Spades
// Rank: 4 Diamonds
// Rank: 9 Clubs
// Rank: 8 Spades

// Player 9 have:
// Rank: 4 Diamonds
// Rank: 4 Spades
// Rank: 2 Clubs
// Rank: 9 Clubs

// Player 10 have:
// Rank: 8 Spades
// Rank: 9 Clubs
// Rank: 9 Clubs
// Rank: 9 Spades

// Player 11 have:
// Rank: King Clubs
// Rank: 9 Spades
// Rank: Jack Spades
// Rank: 9 Spades

// Player 12 have:
// Rank: 9 Clubs
// Rank: 9 Spades
// Rank: 4 Diamonds
// Rank: Jack Spades

// Player 13 have:
// Rank: 4 Clubs
// Rank: 4 Diamonds
// Rank: 9 Clubs
// Rank: 8 Spades

