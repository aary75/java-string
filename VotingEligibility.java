import java.util.Random;

public class VotingEligibility {
      public static void main(String[] args) {
         
        int[] age = new int[10];

        Random random = new Random();
 
       for(int i = 0;i<10;i++) {
           age[i] = random.nextInt(101);
       }

       String[][] eligibility = new String[10][2];

       for(int i = 0;i<10;i++){
          if(age[i] >= 18){
              eligibility[i][0] = String.valueOf(age[i]);
              eligibility[i][1] = "This student can vote";
          }
         else{
              eligibility[i][0] = String.valueOf(age[i]);
              eligibility[i][1] = "This student cannot vote";
         }

        System.out.println(eligibility[i][0] + "  " + eligibility[i][1]);
      }
}}

// Output::
// 97  This student can vote
// 68  This student can vote
// 74  This student can vote
// 52  This student can vote
// 55  This student can vote
// 89  This student can vote
// 4  This student cannot vote
// 52  This student can vote
// 18  This student can vote
// 36  This student can vote

