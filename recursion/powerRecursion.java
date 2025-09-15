public class powerRecursion {
    public static void main(String[] args) {
        int x = 5;
        int n=10;
        powerr(x,n,1);
    }
    public static void  powerr(int x,int n, int ans){
        if(n==0) {
            System.out.println(ans);
            return;
        }
        ans = x*ans;
        powerr(x,n-1,ans);
    }
}

