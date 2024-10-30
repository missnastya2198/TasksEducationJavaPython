
/*public class Lesson6And4And1AT  { //class Boy
    private int age = 19;
    private String name = "Michael";
    public static void main(String[] args) {
        Lesson6And4And1AT b = new Lesson6And4And1AT();
        b.toString();
        System.out.print(b);
    }
    public String toString() {
        return name + " is " + age + " years old";

    }
}*/
/*class Person1 {
    String version = "Person";
}
class Student extends Person1 {
    String version = "Student";
}
public class Lesson6And4And1AT {
    public static void main(String[] args) {
        Person1 person = new Student ();//  В этом случае, у класса Student есть два поля с именем version (свое и унаследованное). Обращение к полю происходит через ссылку на суперкласс Person, потому используется унаследованное поле.
        System.out.println(person.version);
    }
}*/
class Person2 {
    String name;
    public Person2 (String name) {
        this.name = name;
    }
}
class SuperMan extends Person2 {
    String skills;
    SuperMan(String skills, String name) {
        super(name);
        this.skills = skills;
    }
    public String showInfo() {
        return name + " has " + skills;
    }
}
public class Lesson6And4And1AT {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("super vision", "Clark Kent");
        System.out.print(superMan.showInfo());
    }
}
