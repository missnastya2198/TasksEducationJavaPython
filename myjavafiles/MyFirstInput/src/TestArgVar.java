//public class VarArg {
/*class VarArg {
    public int calcSum(int... values) {
        int res = 0;
        for (int x : values) {
            res += x; //res = x + res;
        }
        return res;
    }
}

public class TestArgVar {
    public static void main(String[] arg) {
        VarArg tstvarg = new VarArg();
        double a =  1.1;
        System.out.println(tstvarg.calcSum());
        System.out.println(tstvarg.calcSum(3));
        System.out.println(tstvarg.calcSum(55, 66));
        System.out.println(tstvarg.calcSum(77, 55, 33, 11, 99 , (int) a ));
    }
}*/
/*class Employee  {
    String name;
    int age;
    public Employee(String newName, int newAge)  {
        name = newName;
        age = newAge;
    }
}
public class TestArgVar {
    public static void main(String[] args) {
        Employee e =  new Employee("Alex", 30);
        System.out.println(e.name);
    }
}*/
/*class Employee {
    String name;
    int age;
    public Employee(String newName, int newAge)  {
        name = newName;
        age = newAge;
    }
}
public class TestArgVar {
    public static void main(String[] args) {
        Employee e =  new Employee(); //Employee e =  new Employee("test", 20);
        System.out.println(e.name);
    }
}*/
/*В методе main() производится обращение к конструктору без параметров класса Employee. А в классе объявлен конструктор с параметрами.
Компилятор не находит конструктора без параметров и выдает ошибку.
Ошибки бы не возникло, если бы у класса вообще не было объявлено конструкторов. В этом случае компилятор создал бы конструктор по умолчанию без параметров.*/
/*public class TestArgVar {
    private final int XX;

    {
        System.out.println("Dynamic section");
    }

    public TestArgVar() {
        System.out.println("Constructor");
    }

    public static void main(String[] arg) {
        System.out.println("Main");
        TestArgVar obj = new TestArgVar();
    }
}*/
