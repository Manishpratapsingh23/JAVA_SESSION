import java.util.Stack;
public class Build_tree_from_infixExpression {
    public static void main(String[] args) {
        String st = "5*(6+5)/9";
        String s = "2-3/(5*2)+1";
        Solution ob = new Solution();
        System.out.println(ob.getPostFix(s));
        System.out.println("Postfix: " + ob.getPostFix(s));
        System.out.print("Inorder (reconstructed): ");
        Node root = ob.expTree(s);
        inorder(root);
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.ch + " ");
        inorder(root.right);
    }

}

class Node{
    char ch;
    Node left;
    Node right;
    public Node(char ch){
        this.ch = ch;
        left = null;
        right = null;
    }
}


class Solution{
    Stack<Character> stack = new Stack<>();
    public Node expTree(String s){
         String postfix = getPostFix(s);
         Stack<Node> stack = new Stack<>();
         for(char ch : postfix.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(new Node(ch));
            } else{
                Node right = stack.pop();
                Node left = stack.pop();
                Node node = new Node(ch);
                node.left = left;
                node.right = right;
                stack.push(node);
            }
         }
         return stack.pop();
    }

    public String getPostFix(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch  =s.charAt(i);
            if(ch>='0' && ch<='9'){
                sb.append(ch);
            } else if(ch=='('){
                stack.push(ch);
            } else if(ch==')'){
                while(stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            } else{
                while(!stack.isEmpty() && getValue(stack.peek())>=getValue(ch)){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
        sb.append(stack.pop());
    }
        return sb.toString();
    }

    private int getValue(char ch){
        if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        return -1;
    }
}
