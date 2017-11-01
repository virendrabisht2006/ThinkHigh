/**
 * Created by esha on 06/02/16.
 */
public class DuplcateChar {
    public static void main(String args[]) {
        String str = "Welcome to -bangalore's";
        System.out.println(str.trim());
        String regex = "[-+.^:,'_\\s]";
        String finalS = removeDupCHar(str.replaceAll(regex, ""));
        System.out.println("Final String: " + finalS);


        //2nd approach
        String s = "Welcome to bangalore";
        int l = s.length();
        char ch;
        String ans = "";

        for (int i = 0; i < l; i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                ans = ans + ch;
                s = s.replace(ch, ' '); //Replacing all occurrence of the current character by a space
            }
        }

        System.out.println("Word after removing duplicate characters : " + ans);
    }

    private static String removeDupCHar(String str) {
        System.out.println(str.trim());
        int l = str.length();
        char ch;
        String ans = "";
        for (int i = 0; i < l; i++) {
            ch = str.charAt(i);
            if (!ans.contains(String.valueOf(ch))) {
                ans = ans + ch;
            }
        }
        return ans;
    }
}
