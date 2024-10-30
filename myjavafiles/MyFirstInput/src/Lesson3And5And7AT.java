import java.util.Scanner;

public class Lesson3And5And7AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//1
        int sum = num;//1
        int len = 0;//длина
        while (num!=0){
            num = scanner.nextInt();
            sum = (sum + num);
            len = len + 1;
        }
        System.out.print(sum/len);
    }
}

