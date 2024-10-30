import java.math.BigInteger;

public class Lesson2And4Point3Base {
    public static void main(String[] args) {
   // public static BigInteger factorial(int value) {
        int value = 3;

        /*int ret = 1;
        for (int i = 1; i <= a; ++i) {
            ret = ret * i;
        }
        System.out.println(ret);*/
        BigInteger ret = BigInteger.valueOf(1);
        for (int i = 1; i <= value; ++i) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ret);

    }
}
