import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String regex = "(\\w)(\\s\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("A 5");

        int groupCount = matcher.groupCount();
        System.out.println("Number of capturing groups: " + groupCount);
    }
}
