public class NumberConversion {
    public static void main(String args[]){
        String s = "001023";
        //System.out.println(helper(s,0));
        System.out.println(helperBetter(s,0,0));
    }

    public static int helper(String s, int i){
        if(i==s.length()) return 0;
        char ch = s.charAt(s.length()-i-1);
        int n  = (ch-'0');
        //(int)(ch) - 5
        return n*(int)(Math.pow(10,i))+helper(s,i+1);
    }


    public static int helperBetter(String s, int i, int ans){
        if(s.length()==i) return ans; // tialed recusion
        char ch = s.charAt(i);
        int n  = (ch-'0');
        ans = ans*10+n;
        return helperBetter(s, i+1, ans);
    }


    public static int helperHeadBetter(String s, int i){
        
    }
}
