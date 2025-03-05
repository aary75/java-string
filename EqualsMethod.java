import java.util.Scanner;

public class EqualsMethod {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          String str = "Hello";

          String second_string = scanner.nextLine();

          System.out.print(str.equals(second_string));

          str = second_string;

          System.out.print(str.equals(second_string));

          scanner.close();
          // Here if we take same values for both str and second_string then they point to the same place because in string, equals method depends on the reference values
}}
