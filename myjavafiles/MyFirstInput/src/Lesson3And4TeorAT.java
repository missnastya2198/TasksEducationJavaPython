public class Lesson3And4TeorAT {
    public static void main(String[] args) {
        /*int i = 0;
        outer: while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }*/
        int sum = 0;
        for (int val = 1; val <= 10; val++) {
            sum += val;
            System.out.println(sum + "\n");
        }
        System.out.println("Sum of numbers 1..10 = " + sum);
    }
}
