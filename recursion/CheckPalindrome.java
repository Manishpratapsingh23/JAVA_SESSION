public class CheckPalindrome {
    public static void main(String args[]){
        String s = "abaaba";
        System.out.println(helper(s));
    }

    private static boolean helper(String s){
        if(s.length()==1 || )
    }
}
package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String s ="malayalam";
        System.out.println(palen(s,0,s.length()-1));
    }
    public static boolean palen(String s,int l,int r){
        if(l>=r){
            return true;
        }
        if (s.charAt(l) != s.charAt(r)){
            return false;
        }
        return palen(s,l+1,r-1);
}
}