import java.util.Scanner;

public class Lesson3And5And8AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();//12
        int piece = scanner.nextInt();;//8
        int pizza = 1;
        int count = piece;
        while (count % people != 0){
            count = count + piece;//16
            pizza = pizza + 1;//3
        }
        System.out.print(pizza);
    }
}
