
 class Insurance {
    public static final int LOW = 100;
    public int getPremium() {
        return LOW;
    }
    public static String getCategory() {
        return "Insurance";
    }
}
 class CarInsurance extends Insurance {
    public static final int HIGH = 200;
    @Override
    public int getPremium() {
        return HIGH;
    }
    public static String getCategory() {
        return "CarInsurance";
    }
}
public class Lesson6And5And1AT {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        System.out.println("category: " + current.getCategory() );
        System.out.println("category: " + CarInsurance.getCategory() );
    }
}
