import java.util.Scanner;

import java.util.Scanner;
public class Lesson2Ana3Base {
    //String text = "Madam, I'm Adam!";
   //public static void main(String[] args) {

    public static void main(String[] args) {
          String text = "Madam, I'm Adam!";
          String str_repl = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
          //System.out.println(str_repl);
          String str_2 = new StringBuilder(str_repl).reverse().toString();
          //System.out.println(str_2);
          boolean a = str_repl.equals(str_2);
          System.out.println(a);
          /*if (revers.equals(str_repl)){
              return true;
          }
          return false;*/

    }
}
