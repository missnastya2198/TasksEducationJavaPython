import java.util.Scanner;

public class Lesson2And7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int sec = s % 60;
        //System.out.println("sec: " + sec);
        int min = (s / 60) % 60;
        //System.out.println("min: " + min);
        int hr = (s / 3600) % 24;
        //System.out.println("hour: " + hr);
        String strSec = ((sec < 10) ? "0" + sec : Integer.toString(sec));
        String strMin = ((min < 10) ? "0" + min : Integer.toString(min));
        //String strHr = ((hr < 10) ? "0" + hr  : Integer.toString(hr));
        String strHr = Integer.toString(hr);

        System.out.println(strHr + ":" + strMin + ":" + strSec);


    }
}
