// Creating the class calneder to print a calender
import java.util.Scanner;

public class Calender {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in); // get user's input

         // creating months name array
         String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

         int[] days = {0,1,2,3,4,5,6}; // creating days array

         System.out.print("Enter Year: ");
         int year = scanner.nextInt();  // Enter year
 
         System.out.print("Enter Month: ");
         int month = scanner.nextInt(); // Enter month
 

         int day = getFirstDay(month,year); // get first day of month
        // System.out.print(day);

         int[][] calender = new int[6][7];

         int date = 1;
         int week = 0;

         String monthName = "";

         int totalDays = 0;
 
         // getting total days in month by month number
         if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) totalDays = 31;
         else if(month == 4 || month == 6 || month == 9 || month == 11) totalDays = 30;
         else if(month == 2){
                  if(leapYear(year)) totalDays = 29;
                  else totalDays = 28;
              }

         
        // Printing the date of that month
         while(date <= totalDays){
               if(day > 6){
                 week++;
                 day = 0;
                }

               while(day <= 6 && date <= totalDays)  {
//                    System.out.print(week+" ");
  //                  System.out.print(date+" ");
    //                System.out.println(day);
                   calender[week][day++] = date++;
               }
        }
         
         String[] daysName = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

         // Printing the days name
         for(int i = 0;i<daysName.length;i++){
             System.out.print(daysName[i] + "  ");
         }
         System.out.println();

         //Printing the calender
         for(int i = 0;i<=week;i++){
             for(int j = 0;j<=6;j++){

                 if(calender[i][j] == 0) System.out.print("     ");
                 else System.out.print(calender[i][j]+"   ");

             }
         System.out.println();
        }
  }




// Checking the year is leap year or not
   public static boolean leapYear(int year){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) return true;
         return false;
   }

   // Getting the first day of month using georgian calculations
   public static int getFirstDay(int month, int year){
         int year1 = year - (14 - month)/12;

         int x = year1 + (year1/4) - (year1/100) + (year1/400);
         
         int month1 = month + 12 * (((14 - month)/12) - 2);

         int days1 = (1 + x + (31*month1)/12) % 7;
         
     return days1;
 }
}

// Input: Enter Year: 2025
//       Enter Month: 3
// Output: Sun  Mon  Tue  Wed  Thu  Fri  Sat
//                                      1
//         2   3   4   5   6   7   8
//         9   10   11   12   13   14   15
//        16   17   18   19   20   21   22 
//        23   24   25   26   27   28   29
//        30   31
