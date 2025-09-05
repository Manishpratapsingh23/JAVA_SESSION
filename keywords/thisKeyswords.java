//package keywords;

public class thisKeyswords {
    public static int a;
    public static String b;
    public thisKeyswords(int a, String b){
        this.a = a;
        this.b = b;
    }

    public static void display(){
        System.out.println("global variable "+a+" "+b);
    }

    public static void display1(){
        int a = 1;
        String b = "Kunal";
        System.out.println("local variable  "+a+" "+b);
    }

    public static void main(String[] args) {
        thisKeyswords tk  = new thisKeyswords(2,"Kartik");
        display();
        display1();
    }
}
