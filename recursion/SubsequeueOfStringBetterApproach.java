//package recursion;

public class SubsequeueOfStringBetterApproach {
    public static void main(String[] args) {
        String s = "XYZ";
        subSequence(s, "");
    }

    private static void subSequence(String input, String output){
        if(input.length()==0){
            System.out.println(output);
            //lst.add(output)
            return;
        }

        subSequence(input.substring(1), output);
        subSequence(input.substring(1), output+input.charAt(0));
    }
}
