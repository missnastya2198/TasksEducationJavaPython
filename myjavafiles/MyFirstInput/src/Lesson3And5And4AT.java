
import java.util.Scanner;

public class Lesson3And5And4AT{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //4
        int b = scanner.nextInt();//2
        int h = scanner.nextInt();//6
        int day = 0;
        if (a>=h){
            System.out.print(day+1);
        }
        else if (a <= b) {
            System.out.println("Никогда");
        }
        else {
            int dist = 0;
            for (int i=0;((dist + a )<=h);i++){
                dist = dist + a - b; //2
                day = day+1;
            }
            System.out.print(day);
        }
    }
}
