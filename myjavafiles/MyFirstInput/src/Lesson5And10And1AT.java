
import java.util.Scanner;

public class Lesson5And10And1AT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);
        /*Line line1 = new Line(1,2);
        Line line2 = new Line(2,1);*/
        System.out.println(line1.intersection(line2));
    }
}
class Line {
    int k, b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        //System.out.println(k);
        //System.out.println(other.k);
        if ((other.b==b && other.k==k) || (other.k==k) ){
            return null;
        }
        else {
            int x = (other.b - b) / (k - other.k);
            int y = k * x + b;
            return new Point(x, y);
        }


    }

}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
