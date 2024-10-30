import java.util.Arrays;
import java.util.Scanner;

public class Lesson4And6And3AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr2 = new int [size];
        if (size > 0){
            for (int i = 0; i < size; i++) {
                arr2[i] = scanner.nextInt();
            }//ввод массива
            boolean[] arr3 = new boolean[size];
            for(int i=0;i<(size);i++){
                if (arr2[i] == arr2[0] || arr2[i]== arr2[1]) {
                    arr3[i] = false;
                }
                else {
                    if (arr2[i] == (arr2[i-1]+arr2[i-2])){
                        arr3[i] = true;
                    }
                    else {arr3[i] = false;}
                }
            }
            System.out.println(Arrays.toString(arr3));
        }
        else if (size==0){
            System.out.println(0);
        }
    }
}
