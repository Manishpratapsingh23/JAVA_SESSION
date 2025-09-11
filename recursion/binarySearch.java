public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 9;
        int l = 0;
        int r = arr.length - 1;
        int result = binarySearch(arr, target, l, r);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target, int l, int r) {
        if(l>r) return -1;
        int mid = l + (r - l) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, l, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, r);
        }
    }
}


