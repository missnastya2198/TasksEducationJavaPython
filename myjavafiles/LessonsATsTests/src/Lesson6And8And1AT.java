import java.util.Scanner;

public class Lesson6And8And1AT {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String s = sc.next();

        System.out.println(Action.sum(a, a));
        System.out.println(Action.sum(a, b));
        System.out.println(Action.sum(s, a));
    }
}

/*class Action {
    int a;
    double b;
    String s;
    public Action(int a, double b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }
   public static int sum(int a, int b) {
        return a + b;
    }
   public static double sum(int a, double b) {
        return a + b;
    }
    public static String sum(String s, int a) {
        return s + a;
    }

}*/
class Action {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static String sum(String s, int a) {
        return s + a;
    }
}