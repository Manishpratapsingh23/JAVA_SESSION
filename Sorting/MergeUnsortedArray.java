package Sorting;

public class MergeUnsortedArray {
    public static void main(String args[]){
        int arr[] = {6,9,1,7,3,8,4};
        int start = 0;
        int end = arr.length-1;
        merge(arr, start, end);
        for(int i : arr) System.out.print(i+" ");
    }

    public static void merge(int arr[], int start, int end){
        if(start>=end) return;
        int mid = (start+end)/2;
        merge(arr, start, mid);
        merge(arr, mid+1, end);
        mergeSort(arr, start, mid, end);
    }


    public static void mergeSort(int arr[], int start, int mid, int end){
        int n1 = mid-start+1;
        int n2 = end-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int k = 0;
        for(int i=start;i<=mid;i++){
            left[k] = arr[i];
            k++;
        }
        k=0;
        for(int i=mid+1;i<=end;i++){
            right[k] = arr[i];
            k++;
        }
        int i=0,j=0;
        k = start;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while(i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];
    }
}
