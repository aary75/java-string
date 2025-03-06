// Creating Game to class to play rock,scissors, paper game
import java.util.Scanner;
import java.util.Random;

public class Game {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // get user's input
         Random random = new Random();   // Random class to get random number

         String[] user = {"Rock","Scissors","Paper"};   // inputs for user

         String[] computer = {"Rock", "Scissors","Paper"}; // inputs for computer

        int userWins = 0;
        int computerWins = 0;
        int gameHappen = 0;
        int totalGame = scanner.nextInt();

        long currentTime = System.currentTimeMillis();  // current time in milliseconds
        double[][] result = new double[totalGame][2];   // array to store average and percentage

        String[] res = new String[totalGame];   // array to store who wins

        while(gameHappen < totalGame) {

        int userRandom = random.nextInt(3);     // get random number between 0 to 2
        int computerRandom = random.nextInt(3);

         //System.out.print(userRandom);
         // Output for all possible cases
        if(user[userRandom] == computer[computerRandom]) gameHappen++;
        else if((user[userRandom] == "Rock" && computer[computerRandom] == "Scissors") ||
               (user[userRandom] == "Scissors" && computer[computerRandom] == "Paper") ||
               (user[userRandom] == "Paper" && computer[computerRandom] == "Rock")){
                   userWins++;
                   res[gameHappen] = "User Wins";
                   result[gameHappen][0] = (double)userWins/(gameHappen + 1);
                   result[gameHappen][1] = (double)result[gameHappen][0]*100;
                  gameHappen++;
          }
      else  if((user[userRandom] == "Scissors" && computer[computerRandom] == "Rock") ||
               (user[userRandom] == "Paper" && computer[computerRandom] == "Scissors") ||
               (user[userRandom] == "Rock" && computer[computerRandom] == "Paper")){
                   computerWins++;
                   res[gameHappen] = "Computer Wins";
                   result[gameHappen][0] = (double)computerWins/(gameHappen + 1);
                   result[gameHappen][1] = (double)result[gameHappen][0]*100;
               gameHappen++;
        }
    }


    int track = 0;
    while(track < totalGame){
        System.out.println("For "+ (track + 1) +"th game " + res[track] + " with average " + String.format("%.2f",result[track][0]) + " and percentage " + String.format("%.2f",result[track++][1]));
    }

 }}

