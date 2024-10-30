/*import java.util.Scanner;

public class Lesson5And10And2AT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        Triangle triangle = new Triangle(new Point(x1, y1), new Point(x2, y2),  new Point(x3, y3));

        System.out.println(triangle.area());
    }
}
class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        //стороны треуголника:
        double A = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double B = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
        double C = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        //площадь:
        double s = Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) - (c.getY() - a.getY()) * (b.getX() - a.getX())));
        if ((((A + B) <= C) || ((A + C) <= B) || ((B + C) <= A)) || s == 0) {
            System.out.println("Треугольник не существует");
            System. exit(0);
            //throw new IllegalArgumentException("\"Треугольник не существует\"");
        }
    }
   public double area() {
       double s = Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) - (c.getY() - a.getY()) * (b.getX() - a.getX())));
       return s;

    }
}

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}*/
