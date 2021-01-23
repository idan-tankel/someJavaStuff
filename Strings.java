public class Strings {
    public static boolean daughter(String s1, String s2) {
        // if some of the strings are null for some reason
        if (s2.length() == 0 || s2 == null)
            return true;

        if (s1 == null) // and s2 is not null because of the statement above
            return false;

        // first, check the length of the two strings
        if (s1.length() < s2.length())
            return false;
        // cut the first char at the both strings
        // if the s1[0] equals s2[0] cut them both
        // if s1[0] != s2[0] cut only s1 and keep comparing
        if (s1.charAt(0) == s2.charAt(0))
            return daughter(s1.substring(1), s2.substring(1));
        else
            return daughter(s1.substring(1), s2);
    }

    // a little test
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hllo wold";
        System.out.println(daughter(s1, s2));
    }
}