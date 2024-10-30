import java.util.Scanner;
import java.io.IOException;


public class Lesson3And5And3AT {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        if (num > 0) {
            String name = scanner.next();
            for (int i = 0; i < num; i++) {
                System.out.println("Привет, " + name);
            }
        }
        else if (num == 0){
            System.out.println("Оу... Похоже здесь никого...");
        }
        else {
            System.out.println("Серьезно? А что так негативно?");
        }

    }
}
