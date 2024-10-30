class A extends Object {
    public void job() {
        System.out.println("Class A");
    }
}
public class Lesson6And3And4AT extends  A  {
    public void job() {
        System.out.println("Class B");
    }
    public static void main(String[] args) {
        A b = new Lesson6And3And4AT();
        b.job();
    }
}