package Task06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String str = "2020/12/23 05:30";
        checkData(str);
        str = "2020/13/77 99:99";
        checkData(str);
        str = "abc@mail.com";
        returnDomain(str);
        str = "zzz@ccc.v";
        returnDomain(str);

    }

    public static void checkData(String str) {

        String regex = "[1-9][0-9]{3}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[0-1])\\s([01][0-9]|2[0-3]):([0-5][0-9])";

        boolean result = str.matches(regex);
        System.out.println(result);
    }

    public static void returnDomain(String str) {

        String regex = "[^@ \\t\\r\\n]+@([^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            String group = matcher.group(1);
            System.out.println(group);
        }
    }
}
