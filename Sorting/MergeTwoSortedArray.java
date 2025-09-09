package Sorting;

public class MergeTwoSortedArray {

    public static int[] MergeArray(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1+n2;
        int ans[] = new int[n];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else {
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<n1) ans[k++] = arr1[i++];
        while(j<n2) ans[k++] = arr2[j++];

        return ans;

    }

    public static void main(String[] args) {
        int arr1[] = {4,5,7,9,12,20};
        int arr2[] = {1,6,8,10,11,13,14};
        int ans[] = MergeArray(arr1,arr2);
        for(int i : ans) System.out.print(i+" ");

    }
}
