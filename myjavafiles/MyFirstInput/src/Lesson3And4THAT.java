import java.util.Scanner;
import java.util.Arrays;
public class Lesson3And4THAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr2 = new int [size];
        int res = 0;
        if (size == 0){
            System.out.println("Массив нулевого размера");
        }
        else {
            for (int i = 0; i < size; i++) {
                arr2[i] = scanner.nextInt();
            }
           for (int i = 0; i < (size-1); i++) {
                if (arr2[i] > arr2[i+1]) {
                    res = arr2[i];
                }
                else res = arr2[i+1];
            }
            System.out.println(res);
           /* или через сртировку массиыва методом для массивов
            Arrays.sort(arr2);
            System.out.println(arr2[size - 1]);*/
        }
    }
}
