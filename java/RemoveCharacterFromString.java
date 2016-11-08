
public class RemoveCharacterFromString {

    public String removeChar(String str, char c) {
        return str.replace(String.valueOf(c), "");
    }

    public String removeSeq(String str, String remove) {
        return str.replace(remove, "");
    }

    public String removeChar2(String str, char c) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c)
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] argv) {
        RemoveCharacterFromString myClass = new RemoveCharacterFromString();

        System.out.println(myClass.removeChar("!a!aaa!", '!'));

        System.out.println(myClass.removeChar("09-09-2012", '-'));

        System.out.println(myClass.removeSeq("abcabdadrdvabcd", "abc"));
    }
}
