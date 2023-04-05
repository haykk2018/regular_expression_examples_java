package armenia.am;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEX {

    public static void main(String[] args) {

        /*
        reg exp '\' in java  equal '\\'
        \S = \\S
        \s	Matches any white-space character.	\w\s	"D " in "ID A1.3"
        \S	Matches any non-white-space character.	\s\S	" _" in "int __ctr"
         */
        String[] arr = "hello my friends".split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("hello my friends".replace(" ", "_"));
        System.out.println("number 11 room".replaceAll("\\d", "*"));

        /*

         */
        System.out.println("--regex pattern test--");

        String text = "this is my email - test@test.org " + "this is company email invalid@k.m " + "this is company president email valid44@gmail.com and ...";

        Pattern pattern1 = Pattern.compile("[^ ]+@[^ ]+\\.[^ ]");
        Pattern pattern2 = Pattern.compile("\\S+@\\S+\\.\\S+");
        Pattern pattern3 = Pattern.compile("\\S+@\\S+\\.\\S{2,}");

        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);
        Matcher matcher3 = pattern3.matcher(text);

        Pattern patternSubgroup = Pattern.compile("(\\S+)@\\S+\\.(\\S{2,})");
        Matcher matcher4 = patternSubgroup.matcher(text);


        System.out.println("---[^ ]+@[^ ]+\\\\.[^ ]---");
        while (matcher1.find()) System.out.println(matcher1.group());

        System.out.println("---\\\\S+@\\\\S+\\\\.\\\\S+---");
        while (matcher2.find()) System.out.println(matcher2.group());

        System.out.println("---\\\\S+@\\\\S+\\\\.\\\\S{2,}---");
        while (matcher3.find()) System.out.println(matcher3.group());

        System.out.println("---example with subgroups---");
        while (matcher4.find()) System.out.println("group1-"+matcher4.group(1) +  " group2-"+matcher4.group(2));

    }
}
