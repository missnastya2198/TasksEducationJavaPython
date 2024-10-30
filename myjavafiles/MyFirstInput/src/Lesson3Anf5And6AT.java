import java.util.Scanner;

public class Lesson3Anf5And6AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//2
        int max = num;

        /*do {

            next = scanner.nextInt();//4
            //System.out.print(next);
            if (max<next){
                max=next;
            }
        }
        while (next!=0);*/
        while (num!=0){

            num = scanner.nextInt();//4
            //System.out.print(next);
            if (max<num){
                max=num;
            }
        }
        System.out.print(max);
    }
}
