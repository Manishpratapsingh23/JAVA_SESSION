//package inhertance;

public class Room {
    final int rent  = 6000;
    int length; // class vriable ya global variable
    int breadth; // class vriable ya global variable
    public Room(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return length*breadth;
    }


    protected void roomDetails(){
        System.out.println("room ka secret data h");
        // patient : {name, age, bedno, phno, charges, gender, medicies, doc name, disease}
    }

    public void display(){
        roomDetails();
        // "kartik".coampareto(name)==true fetch bedno.
    }
}
