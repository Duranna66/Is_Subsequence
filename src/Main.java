public class Main {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aec", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0 && t.length() == 0)
            return true;
        if(t.length() == 0)
            return false;
        if(s.length() == 0)
            return true;
        int ind = 0;
        int k = 0;
        for(int i = ind; i < t.length(); i++)
        {
            if(s.charAt(k) == t.charAt(i))
            {
                ind = i;
                k++;
            }
            if(k == s.length())
            {
                return true;
            }
        }
        return false;
    }
}