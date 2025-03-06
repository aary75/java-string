// Creating a gradeCard class to create grade card of students
import java.util.Scanner;

public class GradeCard {
 
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in); // get user's input

         int numberOfStudent = scanner.nextInt();  // get number of studentspp

         double[][] scores = new double[numberOfStudent][3]; // a 2D double array to store scores of student
  
          scores = getScore(numberOfStudent);  // Call function to get score

         double[][] result = new double[numberOfStudent][3]; // a 2D double array to create result of student

         result = getResult(numberOfStudent,scores); // Call function to create result

         String[][] gradeCard = new String[numberOfStudent][1]; // a 2D string array to create grade card

         gradeCard = getGrade(numberOfStudent,result); // call function to create grade card

         printing(numberOfStudent,scores,result,gradeCard); // print the grade card
    }

// initialize the function to get score 
public static double[][] getScore(int numberOfStudent){
           
           double[][] scores = new double[numberOfStudent][3];
           Scanner scanner1 = new Scanner(System.in); // get user's input

           for(int i= 0;i < numberOfStudent;i++){
                System.out.println("For student " + (i + 1));  

                System.out.print("Physics Marks: ");
                scores[i][0] = scanner1.nextDouble();  // get physics marks

                System.out.print("Chemistry Marks: ");
                scores[i][1] = scanner1.nextDouble(); // get chemistry marks
     
                System.out.print("Math Marks: ");
                scores[i][2] = scanner1.nextDouble(); // gt math marks
                System.out.println();
         }
     return scores;  // return score
}

// Initialize the function to create result
public static double[][] getResult(int numberOfStudent,double[][] scores){
           
           double[][] result = new double[numberOfStudent][3]; // Create array to store result

           for(int i = 0; i< numberOfStudent; i++) {
               result[i][0] = scores[i][0] + scores[i][1] + scores[i][2];  // Total of all marks gain 
               result[i][1] = Math.round(result[i][0] / 3);           // Get average of total marks
               result[i][2] = Math.round((result[i][0] / 300) * 100);  // Get percentage of marks gain
           }

    return result;   // return result

}

// Initialize the function to create grade card
public static String[][] getGrade(int numberOfStudent, double[][] result) {
        
        String[][] grade = new String[numberOfStudent][1]; // Create array to create grade

        for(int i = 0; i< numberOfStudent; i++) {
             if(result[i][2] > 80) grade[i][0] = "Level 4,above agency-normalized standards";
             else if(result[i][2] > 70) grade[i][0] = "Level 3, at agency-normalized standards";
             else if(result[i][2] > 60) grade[i][0] = "Level 2, below, but apporaching agency-normalized standards";
             else if(result[i][2] > 50) grade[i][0] = "Level 1, well below agency-normalized standards";
             else if(result[i][2] > 40) grade[i][0] = "Level 1-, too below agency-normalized standards";
             else grade[i][0] = "Remedial Standards";
      }

     return grade; // return grades
}


// Printing the grade card
public static void printing(int numberOfStudent,double[][] scores,double[][] result, String[][] gradeCard) {

         for(int i = 0; i< numberOfStudent; i++) {
            System.out.println("For student "+ (i + 1));

            System.out.print("Marks in physics          ");
            System.out.print("Marks in chemistry        ");
            System.out.print("Marks in maths            ");
            System.out.print("Total Marks               ");
            System.out.print("Average Marks             ");
            System.out.print("Percentage                ");
            System.out.println("Grade                   ");

            System.out.print(scores[i][0] + "                           ");
            System.out.print(scores[i][1] + "                      ");
            System.out.print(scores[i][2] + "                    ");
            System.out.print(result[i][0] + "                     ");
            System.out.print(result[i][1] + "                     ");
            System.out.print(result[i][2] + "                 ");
            System.out.println(gradeCard[i][0]);
  }
}

}
