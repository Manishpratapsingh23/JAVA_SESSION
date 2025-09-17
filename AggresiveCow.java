import java.util.Arrays;
public class AggresiveCow {
    public static void main(String args[]){
        int stalls[] = {1,2,4,8,9};
        int cows = 3;
        int ans = solve(stalls, cows);
        System.out.println(ans);

    }

    public static int solve(int stalls[], int cows){
        Arrays.sort(stalls);
        int low = stalls[0];
        int high = stalls[stalls.length-1]-stalls[0];
        while(low<=high){
            int mid = (low+high)/2;
            boolean canWePlace = canWePlaceCow(stalls, mid, cows);
            if(canWePlace) low = mid+1;
            else high = mid-1;
        }
        return high;
    }


    public static boolean canWePlaceCow(int stalls[], int dist, int cows){
        int placedCow = 1;
        int lastPos = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPos>=dist){
                placedCow++;
                lastPos = stalls[i];
            }
            if(placedCow>=cows) return true;
        }
        return false;
    }
}
