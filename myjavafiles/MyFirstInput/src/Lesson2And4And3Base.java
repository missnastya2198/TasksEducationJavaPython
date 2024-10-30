import java.util.Arrays;

public class Lesson2And4And3Base {
    public static void main (String[]args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder sb = new StringBuilder();
        int n = roles.length;
        int m = textLines.length;
        int i = 0;
        while (i<n) {
            String name = roles[i];
            sb.append(name + ":" + "\n");
            int j = 0;
            while (j<m) {
                String text = textLines[j];
                if (text.startsWith(name + ":")) { //startWith() https://otus.ru/nest/post/1370/
                    //sb.append((j+1) +") " + text.replaceFirst(name + ": ", "") + "\n" );
                    sb.append(j + 1).append(") ").append(text.replaceFirst(name + ": ", "")).append("\n");
                }
                j++;

            }
            sb.append("\n");
            i++;
        }
        System.out.println(sb);
    }
}
