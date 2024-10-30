import java.util.Scanner;
import java.util.Arrays;

public class Lesson4And6And2AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr2 = new int [size];
        int sum = 0;
        if (size > 0){
            for (int i = 0; i < size; i++) {
                arr2[i] = scanner.nextInt();
            }//ввод массива
            System.out.println(Arrays.toString(arr2));
            for (int i: arr2) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
        else if (size==0){
            System.out.println(sum);
        }
    }
}
