import java.util.Arrays;
public class LowerCaseUpperCaseStrings{
    public static void main(String[] args) {
        List<String> StringList = Arrays.asList("red","Blue","pink","GREEN");
        System.out.println("Before Converting");
        for(String str:StringList)
        {
            System.out.println(str);
        }
        StringList.replaceAll(str->str.toUpperCase());
        System.out.println("Uppercase StringList:");
        for(String str:StringList)
        {
            System.out.println(str);
        }
        StringList.replaceAll(str->str.toLowerCase());
        System.out.println("Lowercase StringList");
        for(String str:StringList)
        {
            System.out.println(str);
        }
    }
}
/*
Output:
Before Converting
red
Blue
pink
GREEN
Uppercase Strings:
RED
BLUE
PINK
GREEN
Lowercase Strings:
red
blue
pink
green

*/

