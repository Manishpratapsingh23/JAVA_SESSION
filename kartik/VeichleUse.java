//package kartik;

public class VeichleUse {
    public static void main(String args[]){
        Veichle Bus = new Veichle("Bus", 6, "Yellow", "2017");
        Bus.displayVeichleDetails();

        System.out.println("");

        Veichle Train = new Veichle("Train", 600, "White", "2022");
        Train.displayVeichleDetails();

        System.out.println("");

        Veichle Car = new Veichle();
        Car.color = "Black";
        Car.model = "2019";
        Car.number_of_tyre = 4;
        Car.type = "Car";
        Car.displayVeichleDetails();

        Veichle owner = new Veichle("Kartik");
        owner.OwnerName();

    }
}
