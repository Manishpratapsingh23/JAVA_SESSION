package  accessSpecifier.p1;

public class HospitalA {
    public static void main(String[] args) {
        HospitalData ob = new HospitalData();
        ob.displayDefault(); //default
        //ob.displayPrivate(); //private
        ob.displayProtected(); //protected
        ob.displayPublic();

    }
}
