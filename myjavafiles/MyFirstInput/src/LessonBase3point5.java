public class LessonBase3point5 {
    public static void main(String[] args) {
        /*String[] spamWords = {"gap"};
        int maxLength = 10;
        TextAnalyzer[] text = {
                new SpamAnalyzer(spamWords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(maxLength)
        };
        */
        NegativeTextAnalyzer a = new NegativeTextAnalyzer();
        SpamAnalyzer s = new SpamAnalyzer(new String[]{"gap", "spam"});
        TooLongTextAnalyzer l = new TooLongTextAnalyzer(15);

        TextAnalyzer[] T = {a, s, l};
        System.out.println(checkLabels(T, "tolongtolong tolongtolong tolongtolong"));
        System.out.println(checkLabels(T, "notlong spam"));
        System.out.println(checkLabels(T, ":((("));
        System.out.println(checkLabels(T, "huek"));
    }

    public static Label checkLabels (TextAnalyzer[] analyzers, String text){
        for (TextAnalyzer i: analyzers){
            System.out.println("в цикле " + i.processText(text));
            if (i.processText(text) != Label.OK) {
                return i.processText(text);
            }
        }
        return Label.OK;
    }

}
interface TextAnalyzer {
    Label processText(String text);
}
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    //private Label label;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    @Override
    protected String[] getKeywords(){
        return keywords;
    }
    @Override
    protected Label getLabel(){
        return Label.SPAM;
    }

}
class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords = {":(", "=(", ":|"};
    //private Label label;
    public NegativeTextAnalyzer() {
        this.keywords = keywords;
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    public TooLongTextAnalyzer (int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text){
        if (text.length() > maxLength){
            return Label.TOO_LONG;
        }
        else return Label.OK;
    }

}
abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel ();
    public Label processText(String text){
        String[] keywords = getKeywords();
        for (String i: keywords){
            if (text.contains(i)){
                return getLabel();
            }
        }
        return Label.OK;
    }

}