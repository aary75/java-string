import java.util.Scanner;

public class ASCIIValues {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          char ch = scanner.next().charAt(0);
          
//  Converting the character into its ascii values using typecasting
          int ascii = (int)ch;

           System.out.print(ascii);
}}
