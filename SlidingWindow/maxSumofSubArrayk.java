//package SlidingWindow;

public class maxSumofSubArrayk {
    public   int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int left = 0, right = 0;
        int s = 0;
        while(right+k<=arr.length){
            s += arr[left];
            if(left-right+1<k) left++;
            else if(left-right+1 == k){
                sum = Math.max(sum,s);
                s -= arr[right];
                right++;
                left++;
            }
        }
        return sum;
    }
}
