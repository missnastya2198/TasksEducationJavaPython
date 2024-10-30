public class Lesson6And8And3AT {
    public static void main(String args[]) {
    Cat albatros = new Cat("котовас", "мяу");
    albatros.speak();
}
}
class Animal {

    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " говорит " + this.voice);
    }
}
class Cat extends Animal {
    public Cat(String name, String voice) {
        super(name, voice);
    }

    public void Cat(String name,String voice){

    }
}