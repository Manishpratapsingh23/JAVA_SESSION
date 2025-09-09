//package abstraction;
 
abstract class Shape{
    abstract double area(); // abstract method -> jiski body ko define nhi krte

    String color; // global variable

    public Shape(String color) //constructor
    {
        System.out.println("Shape constructor called"); //1.
        this.color = color;
    }

    public String getColor(){ // concrete method
        return color;
    }
}


class Circle extends Shape{
    int radius;
    public Circle(String color, int radius){
        super(color);
        System.out.println("Circle constructor called"); //2.
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius*radius;
    }

}

class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(String color, int length, int breadth){
        super(color);
        System.out.println("Rectangle constructor called"); //2.
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return length * breadth;
    }

}



public class polymorphism {
    public static void main(String args[]){
        Shape sp = new Circle("Red", 7);
        double ans = sp.area();
        System.out.println("Area Of Circle "+ans);
        System.out.println("Color Of Circle "+ sp.getColor());


        System.out.println();
        Shape sp1 = new Rectangle("Yellow", 5, 4);
        double ans1 = sp1.area();
        System.out.println("Area Of Rectangle "+ans1);
        System.out.println("Color Of Reactangle "+ sp1.getColor());
    }
}
