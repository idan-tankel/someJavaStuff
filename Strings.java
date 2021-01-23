public class Strings {
    public static boolean daughter(String s1, String s2){
        // first, check the length of the two strings
        if(s1.length()<s2.length())
            return false;
        if(s1.length() == s2.length())
            return (boolean)(s1==s2);
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        System.out.println(daughter(s1, s2));
    }
}