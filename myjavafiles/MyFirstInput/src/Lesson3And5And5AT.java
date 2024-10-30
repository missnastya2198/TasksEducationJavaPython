import java.util.Scanner;

public class Lesson3And5And5AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int general = scanner.nextInt();
        int person = scanner.nextInt();
        int money;
        if (general < 0) {
            System.out.print("Еда не так плоха, чтобы за ее поедание доплачивали");
        }
        else if (person <= 0 ) {
            System.out.print("Кто здесь?!");
        }
        else {
            //money = ((general*10/100)/person) + general/person;
            money = (int) (general* 1.1)/person;
            System.out.print(money);
        }

    }
}