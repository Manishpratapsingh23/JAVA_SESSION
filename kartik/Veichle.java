//package kartik;

public class Veichle {
    String type;
    int number_of_tyre;
    String color;
    String model;
    String owner;
    public Veichle(String t, int n, String c, String m){
        type = t;
        number_of_tyre = n;
        color = c;
        model = m;
    }

    public  Veichle(){
        // constructor
        type = "bataya nhi";
        number_of_tyre = 0;
        color = "bataya nhi";
        model = "bataya nhi";
    }

    public Veichle(String ownerName){
        owner = ownerName;
    }

    public void OwnerName(){
        System.out.println(owner);
    }

    public  void displayVeichleDetails(){
        System.out.println("Details of Veichle Use");
        System.out.println("Type of veichle : " + type);
        System.out.println("Tyre in Viechle : "+ number_of_tyre);
        System.out.println("Color Of Veichle : " + color);
        System.out.println("Model of Veichle : " + model);

    }
}
