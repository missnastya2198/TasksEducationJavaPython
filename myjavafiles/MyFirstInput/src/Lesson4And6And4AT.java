import java.util.Arrays;
import java.util.Scanner;
public class Lesson4And6And4AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//5
        int M = scanner.nextInt();//6
        int[][] a = new int [N][M];
        int Ibeg = 0, Ifin = 0, Jbeg = 0, Jfin = 0;//точки излома (поворота)
        int k = 1;// переменная, значением которой мы будем заполнять массив, пока она не достигнет значения M*N
        int i = 0;
        int j = 0;
        while (k <= N * M){
            a[i][j] = k;
            if (i == Ibeg && j < M - Jfin - 1)
                ++j;
            else if (j == M - Jfin - 1 && i < N - Ifin - 1)
                ++i;
            else if (i == N - Ifin - 1 && j > Jbeg)
                --j;
            else
                --i;
            if ((i == Ibeg + 1) && (j == Jbeg) && (Jbeg != M - Jfin - 1)){
                ++Ibeg;
                ++Ifin;
                ++Jbeg;
                ++Jfin;
            }
            ++k;
        }
        for ( i = 0; i < N; i++){
            for ( j = 0; j < M; j++){

                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
