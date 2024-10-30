import java.util.Arrays;
import java.util.Scanner;
public class Lesson4And6And5AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();//4
        int col= scanner.nextInt();//4
        int[][] a = new int [row][col];
        int[][] b = new int [col][row];
        for ( int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                a[i][j] = scanner.nextInt();
                //System.out.print(a[i][j] + " ");
            }
           // System.out.println();
        }
        for (int i=0; i<row;i++){
            for (int j=0; j<col; j++){
                b[i][j]=a[j][i];
                if (j==(col-1)){
                    System.out.print(b[i][j]);
                }
                else {System.out.print(b[i][j] + " ");}
            }
            System.out.println();
        }
    }
}
