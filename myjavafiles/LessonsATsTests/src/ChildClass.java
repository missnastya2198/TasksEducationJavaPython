/*class ParentClass {
    void parentMethod(int i) {
        System.out.println("parentMethod ParentClass" + i);
    }
}
class ChildClass extends ParentClass{
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }
    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }
    public static void main(String args[]) {
        ParentClass quest = new ChildClass ();   // 1
        quest.parentMethod(1);   // 2
        quest.childMethod(1);   // 3 // error Ошибка компиляции произойдет при попытке вызова метода, принадлежащего только подклассу, через ссылку на суперкласс, через которую он просто недоступен.
    }
}*/
class C {
    String version = "1.0 A";
    String testMethod() {
        return "A";
    }
}
class D extends C {
    String version = "1.0 B";
    String testMethod() {
        return "B";
    }
}
public class ChildClass {
    public static void main(String[] args) {
        C a = new D();
        System.out.println(a.version + a.testMethod()); //При вызове метода в данном случае будет использоваться механизм позднего связывания. Поэтому будет вызван метод не на основе типа ссылочной переменной, а на конкретном объекте, т.е будет вызван метод класса В. Поля в Java не являются полиморфными, поэтому будет обращение к полю на основе типа ссылочной переменной.
    }
}
