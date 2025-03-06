import java.util.Scanner;

public class BMICalculator {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int numberOfPerson = scanner.nextInt();

       double[][] figure = new double[numberOfPerson][2];

       figure = getFigure(numberOfPerson);

       String[][] BMIcalculate = new String[numberOfPerson][2];

       BMIcalculate = getBMI(numberOfPerson,figure);

       display(numberOfPerson,figure,BMIcalculate);
 }


public static double[][] getFigure(int numberOfPerson) {

    Scanner scanner1 = new Scanner(System.in);

    double[][] figure = new double[numberOfPerson][2];

    for(int i = 0; i< numberOfPerson; i++) {
        System.out.println("Enter for person " + (i + 1));

        System.out.print("Enter weight(in Kgs)) "); 
        figure[i][0] = scanner1.nextDouble();

        System.out.print("Enter height(in cms)) ");
        figure[i][1] = scanner1.nextDouble();
    System.out.println();
    }

     return figure;
}

public static String[][] getBMI(int numberOfPerson, double[][] figure) {

      String[][] BMIcalculate = new String[numberOfPerson][2];

      for(int i = 0; i< numberOfPerson; i++) {

         double heightMetres = figure[i][1] / 100;

         double bmi = Math.round(figure[i][0] / (heightMetres * heightMetres));
         
         BMIcalculate[i][0] = String.valueOf(bmi);

        if(bmi <= 18.4) BMIcalculate[i][1] = "Underweight";
        else if(bmi <= 24.9) BMIcalculate[i][1] = "Normal";
        else if(bmi <= 39.9) BMIcalculate[i][1] = "Overweight";
        else BMIcalculate[i][1] = "Obese";
    }

   return BMIcalculate;
}

public static void display(int numberOfPerson,double[][] figure,String[][] BMIcalculate) {
       
       for(int i = 0; i<numberOfPerson; i++) {
           System.out.println("Person " + (i + 1));

           System.out.print("Weight        ");
           System.out.print("Height        ");
           System.out.print("BMI           ");
           System.out.println("BMI status     ");

           System.out.print(figure[i][0] + "         ");
           System.out.print(figure[i][1] + "         ");
           System.out.print(BMIcalculate[i][0] + "          ");
           System.out.println(BMIcalculate[i][1] + "       ");
   System.out.println();    
}
}
}


 // Input: 3
// Output: Enter for person 1
 //       Enter weight(in Kgs)) 67
      //  Enter height(in cms)) 134

    //    Enter for person 2
     //   Enter weight(in Kgs)) 76
     //   Enter height(in cms)) 187

   //     Enter for person 3
    //    Enter weight(in Kgs)) 77
  //      Enter height(in cms)) 190

// Person 1
// Weight        Height        BMI           BMI status
// 67.0         134.0         37.0       Overweight

// Person 2
// Weight        Height        BMI           BMI status
// 76.0         187.0         22.0       Normal

// Person 3
// Weight        Height        BMI           BMI status
//77.0         190.0         21.0       Normal
