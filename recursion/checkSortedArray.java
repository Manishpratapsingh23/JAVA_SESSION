//package recursion;

public class checkSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,9,10,11};
        boolean ans = check(arr, 0);
        System.out.println(ans);

        int arr1[] = {1,3,5,6,7,12,10,11};
        boolean ans1 = check(arr1, 0);
        System.out.println(ans1);
    }

    private static boolean check(int arr[], int idx){
        if(idx==arr.length-1 || arr.length==0) return true;
        if(arr[idx]>arr[idx+1]) return false;
        return check(arr, idx+1);
    }
}
