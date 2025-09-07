package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9,5,1,4,3};
        int key,j;
        for(int i=1;i<arr.length;i++){
            key = arr[i];
            j = i;
            while(j>0 && arr[j-1]>key){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
