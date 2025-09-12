public class powerRecursion {
    public static void main(String[] args) {
        int x = 5;
        int n=10;
        System.out.println(powerr(x,n));
    }
    public static double  powerr(int x,int n){
        if(n==0) return 1;
        return  x * powerr(x,n-1);
    }
}

