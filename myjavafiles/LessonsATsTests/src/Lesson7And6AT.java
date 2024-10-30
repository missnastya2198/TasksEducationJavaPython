import java.util.Scanner;

class Lesson7And6AT {
    public static void main(String[] args){
        Triangle tr = new Triangle(new Point4(0, 0), new Point4(3, 0), new Point4(0, 4));
        Quadrilateral qu = new Quadrilateral(new Point4(1, 0), new Point4(2, 1), new Point4(1, 2), new Point4(0, 1));
        Circle ci = new Circle(new Point4(1, 1), 3);

        System.out.println(tr.area());
        System.out.println(qu.area());
        System.out.println(ci.area());

        System.out.println(tr.pointsToString());
        //System.out.println(tr.toString());
        System.out.println(qu.pointsToString());
        System.out.println(ci.pointsToString());
    }
}

class Triangle extends Figure{
    Point4 a, b, c;
    public Triangle(Point4 a, Point4 b, Point4 c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        double s = Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) - (c.getY() - a.getY()) * (b.getX() - a.getX())));
        return s;
    }
    @Override
    public  String pointsToString(){
        return "(" + a.getX() +"," + a.getY() +')' + "(" + b.getX() +"," + b.getY() +')' + "(" + c.getX() +"," + c.getY() +')';
    }
}
class Quadrilateral extends Figure{
    Point4 a, b, c, d;
    public Quadrilateral(Point4 a, Point4 b, Point4 c, Point4 d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double area(){
        double s1 = Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) - (c.getY() - a.getY()) * (b.getX() - a.getX())));
        double s2 = Math.abs(0.5 * ((d.getX() - a.getX()) * (c.getY() - a.getY()) - (d.getY() - a.getY()) * (c.getX() - a.getX())));

        return s1+s2;
    }
    @Override
    public  String pointsToString(){
        return "(" + a.getX() +"," + a.getY() +')' + "(" + b.getX() +"," + b.getY() +')' + "(" + c.getX() +"," + c.getY() +')'+ "(" + d.getX() +"," + d.getY() +')';
    }
}

class Circle extends Figure{
    Point4 a;
    double radius;
    public Circle(Point4 a, double radius){
        this.a = a;
        this.radius = radius;


    }
    @Override
    public double area(){
        double s = radius * radius * Math.PI;
        return s;
    }
    @Override
    public  String pointsToString(){
        return "(" + a.getX() +"," + a.getY() +')';
    }
}

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
}


class Point4 {
    private double x;
    private double y;

    public Point4(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
