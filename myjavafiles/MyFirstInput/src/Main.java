import java.io.BufferedReader;
import java.io.IOException;
//import java.util.*;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//import static java.util.regex.Grapheme.T;

//import static sun.invoke.util.Wrapper.Format.format;
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);
    }
}*/
/*public class Main {

    public static void main(String[] args) {

        System.out.println("Да пребудет с тобой сила, юный падаван!");

    }

}*/
/*public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);
    }
}*/
/*import java.security.MessageDigest;

public class Main {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}*/

/*public class Main {
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
}*/

/*public class Main {


        public static void main(String[] args) {
            Child obj = new Child();
            obj.display(); // вызываем метод родительского класса
            obj.show(); // вызываем метод дочернего класса
            System.out.println("Value of a: " + obj.a); // доступ к полю родительского класса
            System.out.println("Value of b: " + obj.b); // доступ к полю дочернего класса
        }

}*/

/*public class Main {
    public static void main(String[] args) {
        String[] spamWords = {"gap"};
        int maxLength = 10;
        //String text = "text text gap";
        TextAnalyzer[] textAnalyzer = {
                new SpamAnalyzer(spamWords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(maxLength)
        };
    }
    public Label checkLabels (TextAnalyzer[] analyzers, String text){
        for (TextAnalyzer i: analyzers){
            if (i.processText(text) != Label.OK) {
                return i.processText(text);
            }
        }
        return Label.OK;
    }

}*/


/*public class Main {
    public static void main(String[] args) {
        Lesson4point1and2 b = new Lesson4point1and2();
        Lesson4point1and1 a = (Lesson4point1and1) b;//ожидаем ошибку
    }
}
*/
/*public class Main {

    public static void main(String[] args) {
       double x = -2;
       System.out.println(sqrt(x));
    }
    public static double sqrt(double x) {

        if (x < 0) {
            throw new IllegalArgumentException ("Expected non-negative number, got " + x);
        }
        else return Math.sqrt(x);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
   public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
       // System.out.println("ttt" + Arrays.toString((Thread.currentThread().getStackTrace())));
      int l =stackTraceElement.length -1;

      System.out.println(l);
       if (stackTraceElement.length < l) {
           return null;
       }
       return stackTraceElement[2].getClassName() + "#" + stackTraceElement[2].getMethodName();

}
   /*public static String getCallerClassAndMethodName() {
       if (Thread.currentThread().getStackTrace().length > 3) {
           return Thread.currentThread().getStackTrace()[3].getClassName() + "#" + Thread.currentThread().getStackTrace()[3].getMethodName();
       }
       return null;
   }*/
//}

/*public class Main {
    /*public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("I like Java.");//1
        StringBuilder sb2 = new StringBuilder(sb1);//2
        //System.out.println(sb1.toString().equals(sb2.toString())); //к одому типу вернет true. равнивает только объекты по ссылке
        //System.out.println(sb1.equals(sb2)); //false
    }*/
 /*   public static void main(String[] args) {
        char[] name =new char[] {'P','a','u','l'};
        String boy = new String(name); //1
        System.out.println(boy);
        StringBuilder sd1 =new StringBuilder("String Builder");
        String str5 = new String(sd1); //2
        StringBuffer sb2 = new StringBuffer("String Buffer");
        String str6 = new String(sb2); //3
        String empName= null;//4

        String str1 = "Один два,три!четыре;пять шесть.семь";
        Pattern p1 = Pattern.compile("[ ,!;.]");
        String s[] = p1.split(str1);
        System.out.println(Arrays.toString(s));

        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);
        System.out.println(m);

    }

}*/
/*
public class Main{
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); //размер массива
        String[] str = new String[l];
        for (int i = 0; i < l; i++){
            str[i] = sc.next();
            //System.out.println(str[i]);
        }
        System.out.println(Arrays.toString(str));
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("[ ,!;.:]+");
        String[] words = p1.split(str);
        System.out.println(Arrays.toString(words));


    }
}*/
/*public class Main  {
    public static void main(String[] args)  {
        try  {
            method();
        }  catch (StackOverflowError e)  {
            for (int i=0; i<2; ++i)
                System.out.print(i);
        }
    }
    public static void method() {
        method();
    }
}*/
//public class Main {
    /*public static void main(String[] args) {
        hereWillBeTrouble(42, 0);
    }

    private static void hereWillBeTrouble(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("ты опять делишь на ноль?");
        }
        int oops = a / b;
        System.out.println(oops);
    }*/

/*    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        Logger logA = Logger.getLogger(ClassA.class.getName());
        //System.out.println(log.toString());
        logA.setLevel(Level.ALL);
        Logger logB = Logger.getLogger(ClassB.class.getName());
        logB.setLevel(Level.WARNING);

        ConsoleHandler handler = new ConsoleHandler();

        Logger logC = Logger.getLogger(ClassC.class.getName());
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        logC.addHandler(handler);
        logC.setUseParentHandlers(false);

    }
}
class ClassA{

}
class ClassB{

}
class ClassC{*/

/*public class Main {
    public static void main(String[] args) {

        MailService spy = new Spy(Logger.getLogger(Class.class.getName()));
        MailService thief = new Thief(10);
        MailService inspector = new Inspector();
        MailService[] msArray = {spy, thief, inspector};
        MailMessage mail = new MailMessage("Romeo", "Juliet", "I love you!");
        MailMessage mail2 = new MailMessage("Austin Powers", "James Bond", "Big secret!");
        MailPackage mail3 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 15));
        MailPackage mail4 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 25));
        MailPackage mail5 = new MailPackage("Austin Powers", "James Bond", new Package("weapons", 5));

        UntrustworthyMailWorker umw = new UntrustworthyMailWorker(msArray);
        try {
            umw.processMail(mail);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail2);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail3);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail4);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail5);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }

        System.out.println("Thief have stolen $" + ((Thief) thief).getStolenValue() + "!");
    }}*/
/*public class Main {
    public static void main(String[] args) throws IOException {

        int next = 0;
        int prev = System.in.read();
        while (prev != -1) {
            next = System.in.read();
            if (prev != 13 || next != 10) {
                System.out.write(prev);
            }
            prev = next;
        }
        System.out.flush();}
}*/

/*public class Main {
    public static void main(String[] args) throws IOException {
        byte[] buf = {48, 49, 50, 51};
        ByteArrayInputStream arr = new ByteArrayInputStream(buf);
        System.out.println(readAsString(arr, Charset.forName("US-ASCII")));
        System.out.flush();
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        Reader inputReader = new InputStreamReader(inputStream, charset);

        String retval;
        //StringBuffer sb = new StringBuffer();
        StringWriter sb = new StringWriter();
       // System.out.println("тут");
        int sym;
        while ((sym = inputReader.read())!=-1){
            //sb.append(sym);
            sb.write(sym);
            //System.out.println(sb);
        }
        retval = sb.toString();
        return retval;

    }
}*/
/*public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        while (scan.hasNext()){ //Пока есть что считывать
            try {
                sum += scan.nextDouble();
            }
            catch (InputMismatchException e){
                scan.next();
            }
        }
        scan.close();
       System.out.format("%.6f", sum);
    }

}*/
/*public class Main {
    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
        System.out.println(Arrays.toString(animalM2));
    }
    public static Animal[] deserializeAnimalArray(byte[] data)  {
        Animal[] animals = null;
        try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data)))//открываем поток ввода байт
        {
            int size = ois.readInt();
            animals = new Animal[size];
            for (int i = 0; i < size; i++)
            {
            animals[i] = (Animal)ois.readObject();

            }
        }
        catch (EOFException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassCastException e){
            throw new IllegalArgumentException(e);
        }
        return animals;
    }
}
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
    @Override
    public String toString() {
        return "name: " + name;
    }

}*/
/*public class Main {
    public static void main(String[] args)  {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }
}
class Pair  <T, S> {
    private  T i;
    private  S s;


    private Pair(T i, S s){
        this.i = i;
        this.s = s;
    }

    public static <T, S> Pair<T, S> of(T i, S s) {
        return new Pair<>(i, s);
    }

    public T getFirst() {
        return i;
    }


    public S getSecond() {
        return s;
    }


    @Override
    public int hashCode(){
        int result = i.hashCode();
        result = 31 * result + s.hashCode();
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        //Pair p = (Pair) obj;
        //return i.equals(p.i) && s.equals(p.s);
        if (Pair.class.isInstance(obj)) {
            return Objects.equals(i, ((Pair<?,?>)obj).i) &&
                    Objects.equals(s, ((Pair<?,?>)obj).s);
        }
        return false;
    }
}*/


/*public class Main {
    public static void main(String[] args)  {
        Set<Integer> set1 = Set.of(1,2,7);
        Set<Integer> set2 = Set.of(7,2,4);
        symmetricDifference(set1, set2);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>(set1);
        Set<T> set4 = new HashSet<T>(set2);
        Set<T> setFinal = new HashSet<>(); //пустое множество
        //System.out.println("это приравнивание set3" + set3);
        //System.out.println("это приравнивание set4" + set4);

        if (set3.equals(set4)){
            //System.out.println(set3.equals(set4));
            return setFinal;
        }
        else {
            set3.removeAll(set2);
            set4.removeAll(set1);

            setFinal.addAll(set3);
            setFinal.addAll(set4);


            //System.out.println("set1= " + set1);
            //System.out.println("set2= " + set2);
            //System.out.println("set3= " + set3);
            //System.out.println("set4= " + set4);
            //System.out.println(setFinal);
            return setFinal;
        }

    }
}*/


/*public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int n = 0;
        while (scan.hasNextInt()){
            if (n % 2 != 0){
                array.add(scan.nextInt());
            }
            else scan.next();
            n++;
        }
        //scan.close();

        //array.removeIf(value -> (array.indexOf(value) % 2 == 0 || array.indexOf(value)==0));
        Collections.reverse(array);
        //System.out.println(array.toString());
        //System.out.println(Arrays.toString(array.toArray()));
        for (int i = 0; i < array.size(); i++) {

           System.out.print(array.get(i) + " ");
        }
    }
}*/

/*способ 2
		import java.util.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int n = 0;
        while (scan.hasNextInt()){ //Пока есть что считывать
            try{
                array.add(scan.nextInt());
            }
            catch (InputMismatchException e){
                scan.next();
            }
        }
        //scan.close();

        array.removeIf(value -> (array.indexOf(value) % 2 == 0 || array.indexOf(value)==0));
        //Collections.reverse(array);
        //System.out.println(array.toString());
        //System.out.println(Arrays.toString(array.toArray()));
        for (int i = array.size() - 1; i >= 0; i--) {
                if(i == 0) {
                    System.out.print(array.get(i));
                } else {
                System.out.print(array.get(i) + " ");
                }
        }


    }
}*/

/*public class Main {
    public static void main(String[] args) {
        String str = "test";
        String str2 =  null;


        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength.apply(str2));
        System.out.println(safeStringLength.apply(str));

    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);

    }
}*/
/*public class Main {
    public static void main(String[] args){
        pseudoRandomStream(13).limit(7).mapToObj(x -> " " + x).forEach(System.out::print);
    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n*n/10)%1000);
    }
}*/
/*public class Main {
    public static void main(String[] args){
        Stream<Integer> str1 = Stream.of(1, 3, 69, 5);
        Stream<Integer> str2 = Stream.of();
        Comparator<Integer> comp = Comparator.comparingInt(o -> o);
        BiConsumer<Integer, Integer> biConsumer = (index, name) -> System.out.println(index + " " + name);
        findMinMax(str1, comp, biConsumer);

    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (list.isEmpty()){
            minMaxConsumer.accept(null, null);
            System.out.println(minMaxConsumer);

        } else {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }
}*/
public class Main {
    public static void main(String[] args) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, charset));

        Stream<String> citiesStream = Stream.of(reader.readLine().toLowerCase());
        reader.close();

        citiesStream.flatMap(Pattern.compile("[^\\p{L}\\p{Digit}]+")::splitAsStream).collect(Collectors
                .toMap(word -> word, word -> 1,Integer::sum)).entrySet().stream()
                //.sorted(Map.Entry.comparingByValue())
                .sorted((es1, es2) ->es1.getValue().equals(es2.getValue()) ? es1.getKey().compareTo(es2.getKey()) : es1.getValue().compareTo(es2.getValue()))
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll)
                //.map(Map.Entry::getKey).collect(Collectors.toList())
                .entrySet()
                .stream()
                .forEach(entry  -> System.out.println(entry.getKey()+ ": " + entry.getValue()));



    }
}