import java.util.ArrayList;
import java.util.Arrays;

class Person1 {
    private  final ArrayList friends = new ArrayList<>();
    public ArrayList getFriends() {
        return friends;
    }
    public  void addFriend(Person1 friend) {
        friends.add(friend);
    }
}
public class Lesson6And2And1AT {
    public static void main(String[] args) {
        Person1 man1 = new Person1();
        System.out.println(man1);
        Person1 man2 = new Person1();
        System.out.println(man2);
        Person1 man3 = new Person1();
        System.out.println(man3);

        man3.addFriend(man1);
        man3.addFriend(man2);
        //man3.addFriend(man3);
        System.out.println(man3.getFriends());
    }
}
/*class Car {
    private static int numOfCars;
    public Car() {
        numOfCars++;
    }
    public int getNumOfCars() {
        return numOfCars;
    }
}
public class Lesson6And2And1AT {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();
        System.out.println(сar3.getNumOfCars());
    }
}*/
