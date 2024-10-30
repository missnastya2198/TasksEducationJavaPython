import java.lang.Math;
//import java.util.Scanner;

public class Lesson2And2BaseDegree {
        //public static void main(String[] args) {
        public static boolean isPowerOfTwo() {
        /*System.out.println(Integer.bitCount(Math.abs(value)));
        return Integer.bitCount(Math.abs(value)) == 1 ? true : false;*/ //it's a correct for https://stepik.org/lesson/12760/step/9?unit=3108
        int value = 8;
        int value_2 = Math.abs(value);
        if (value_2 != 0) {
            double degree = ((Math.log10(value_2)) / (Math.log10(2)));
            //System.out.println((int)degree);
           return (degree % 1) == 0.0;
        }
        return false;

    }
}


