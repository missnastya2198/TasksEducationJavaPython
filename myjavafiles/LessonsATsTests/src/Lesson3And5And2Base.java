import java.lang.CharSequence;
import java.util.Arrays;
class AsciiCharSequence implements CharSequence {
    private byte[] content;
    public AsciiCharSequence(byte[] content){ //Конструктор класса
        this.content = content;
    }
    @Override
    public int length(){  //длина массива
        return content.length;
    }
    @Override
    public char charAt(int index) { //Переопределение charAt().(номер символа, т.е. индекс массива) - возврат символа массива
        //System.out.println((char)content[index]);
        return (char)content[index];
    }
    @Override
    public CharSequence subSequence(int start, int end) { //байтовый массив чтобы взять подстроку
        byte[] result = new byte[end-start]; // or byte[] result = new byte[length()]

        for (int i=start; i< end; i++){
            result[i-start] = content[i];
        }
        return new AsciiCharSequence(result);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder(length());
        for(int i=0; i< length();i++){
            //result.append((char)content[i]);
            result.append((char)charAt(i));
        }
        return result.toString();
    }
}
public class Lesson3And5And2Base {

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        //System.out.println("Подпоследовательность - " + answer.subSequence(0, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Jello!
    }


}
