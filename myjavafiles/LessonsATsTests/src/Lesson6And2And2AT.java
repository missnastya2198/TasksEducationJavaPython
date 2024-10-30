import java.util.Arrays;


class JavaCourse {
    String courseName = "Java";
}

public class Lesson6And2And2AT {
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    public static void main(String[] args) {
        JavaCourse courses[] = { new JavaCourse(), new JavaCourse() };
       // System.out.println(courses[0].courseName + courses[1].courseName);

        courses[0].courseName = "MegaCourse";
        //System.out.println(courses[0].courseName + courses[1].courseName);
        for (JavaCourse c : courses) {
            c = new JavaCourse();

        }
        //System.out.println(courses[0].courseName + courses[1].courseName);

        for (JavaCourse c : courses) {
            System.out.print(c.courseName);
        }
    }
}