class area{
    public area(){
        int  a = 2;
        int b = 3;
        System.out.println(a*b);
    }

    public area(int a){
        System.out.println(a*a);
    }

    public area(double a){
        System.out.println(3.14*3.14*a);
    }

    public area(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String args[]){
       area a = new area();

        System.out.println("square");
        area square = new area(5);

        System.out.println("rectangle");
        area rectangle = new area(5,4);

         System.out.println("circle");
        area circle = new area(7.0);
    

    }

}