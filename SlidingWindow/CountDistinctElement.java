//package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElement {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0, right = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(right+k<=arr.length){
            int freq = map.getOrDefault(arr[left], 0);
            map.put(arr[left], freq+1);
            
            if(left-right+1<k) left++;
            else if(left-right+1==k){
                ans.add(map.keySet().size());
                int f = map.get(arr[right]);
                if(f==1) map.remove(arr[right]);
                else map.put(arr[right], f-1);
                right++;
                left++;
                
            }
        }
        return ans;
        
    }
}
