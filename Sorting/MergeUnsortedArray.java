package Sorting;

public class MergeUnsortedArray {
    public static void main(String args[]){
        int arr[] = {39,27,43,3,9,82,10};
        int s = 0, l = arr.length-1;
        MergeSort(arr, s, l);
    }

    private static void MergeSort(int arr[], int s, int l){
        if(s<l){
            int m = s+(l-s)/2;
            MergeSort(arr,s,m);
            MergeSort(arr, m+1, l);
            Merge(arr, s, m, l);
        }
    }

    private static void Merge(int arr[], int s, int m, int l){
        int n1 = m-s+1;
        int n2 = l-m;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=s)
    }
}
