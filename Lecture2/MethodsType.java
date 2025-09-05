//package Lecture2;

public class MethodsType {
    //private static int n = 10;
    // returning and parametrized
    public   int display(int a, int b){
        return a*b;
    }

    // returning and non parametrized
    public static String display(){
        return "Kunal";
    }

    // non-returning and parametrized

    public static void display(double a, int l){
        System.out.println(a*l);
    }

    // //non-returning and non-parametrized
    public static void display1(){
        System.out.println("xxx");
    }
    // public static void main(String[] args) {
    //     MethodsType ob = new MethodsType();
    //     int ans = ob.display(5, 4);
    //     System.out.println(ans);

    //     String ans1 = ob.display();
    //     System.out.println(ans1);

    //     ob.display(5.0, 5);

    //     ob.display1();

    // }
}
