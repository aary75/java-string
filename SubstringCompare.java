import java.util.Scanner;

public class SubstringCompare {
     public static void compare(String substring, String substringByMethod) {
          
          if(substring.length() != substringByMethod.length()) {
               System.out.print("Results are not same");
               return ;
           }
          else{
             for(int i = 0;i<substring.length(); i++){
               if(substring.charAt(i) != substringByMethod.charAt(i)) {
                    System.out.print("Results are not same");
                   return ;
               }
            }
         }

        System.out.print("Results are same");
        return ;
     }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String str = scanner.nextLine();

         String substring = "";

         int index = scanner.nextInt();

         for(int i = 0;i<index;i++) {
             substring += str.charAt(i);
         }

         String substringByMethod = str.substring(0,index);

         compare(substring,substringByMethod);

}}
