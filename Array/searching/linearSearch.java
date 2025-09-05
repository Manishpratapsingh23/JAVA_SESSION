//package Array.searching;

public class linearSearch {
    private static boolean search(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 7));
    }
}
