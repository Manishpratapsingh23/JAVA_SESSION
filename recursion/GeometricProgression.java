public class GeometricProgression {
    public static void main(String args[]){
        int k = 5;
        System.out.println(helper(k));
    }

    private static double helper(int k){
        if(k==0) return 1;
        return helper(k-1)+Math.pow(0.5,k);
    }
}
