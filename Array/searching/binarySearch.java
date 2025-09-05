//package Array.searching;

public class binarySearch {
    private static boolean search(int arr[], int target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]>target){
                end = mid-1;
            }
            else start = mid+1;
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(search(arr, 10));
        System.out.println(search(arr, 12));
    }
}
