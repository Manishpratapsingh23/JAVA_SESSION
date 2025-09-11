//package recursion;

public class SubsequeueOfString {
    public static void main(String args[]){
        String s = "XYZ";
        String ans[] = subSequence(s);
        for(String st : ans){
            System.out.print(st +", ");
        }
    }

    private static String[] subSequence(String s){
        if(s.length()==0){
            String ans[] = {""};
            return ans;
        }
        String[] smallAns = subSequence(s.substring(1));
        String ans[] = new String[smallAns.length*2];

        for(int i=0;i<smallAns.length;i++){
            ans[i] = smallAns[i];
            ans[i+smallAns.length] = s.charAt(0)+smallAns[i];
        }

        return ans;

        
    }
}
