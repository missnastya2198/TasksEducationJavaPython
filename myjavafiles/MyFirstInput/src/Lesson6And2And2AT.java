class Car {
    private int numOfCars;
    public Car() {
        numOfCars++;
    }
    public int getNumOfCars() {
        return numOfCars;
    }
}
public class Lesson6And2And2AT {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();
        System.out.println(сar3.getNumOfCars());
    }
}