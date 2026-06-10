package Module01.Day3.Strings;

public class StringFunctionsMain {
    public static void main(String[] args) {
        String data="Hello World";
        System.out.println(data.charAt(0));
        System.out.println(data.length());
        System.out.println(data.charAt(data.length()-1));
        System.out.println(data.substring(0,5));
        System.out.println(data.substring(6));
        System.out.println(data.replace("Hello","Hi"));
        System.out.println(data.toLowerCase());
        System.out.println(data.toUpperCase());
        System.out.println(data.trim());
        System.out.println(data.indexOf("o"));
        System.out.println(data.lastIndexOf("o"));
        System.out.println(data.contains("z"));
        System.out.println(data.split(" "));
        System.out.println(data.startsWith("H"));
        System.out.println(data.endsWith("d"));
        System.out.println(data.concat(" Galaxy"));
        String s1="Hello";
        String s2="HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));//lexigraphical comparision
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
