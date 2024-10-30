import java.lang.Math;
import java.util.Scanner;


public class Lesson3And5And9AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();//1
        double b = scanner.nextDouble();;//-2
        double c = scanner.nextDouble();//1
        double d = b*b - 4*a*c;//дискриминант
        if (d<0){   //8 4 2 для проверки
            System.out.println("без корней");
        }
        else if (d > 0) {   //3.2 -7.8 1 для проверки
            double x1 = ((-b) + Math.sqrt(d)) / (2*a);
            double x2 = ((-b) - Math.sqrt(d)) / (2*a);
            System.out.print(x1 + " " + x2);
            //System.out.printf("%.1f%n", x1 +" " + "%.1f%n", x2);
            //System.out.printf("%.1f%n", x1);
            //System.out.printf("%.1f%n", x2);
            //System.out.printf("%.1f%n", "%.1f%n", x1, x2);
            //System.out.printf("%.1f%n", x2, Math.sqrt(x2));
        }
        else if (d == 0) {     //2 4 2 для проверки
            double x = (-b) / 2*a;
            System.out.printf("%.1f%n", x, Math.sqrt(x)); //1f знак после запятой
        }


    }
}