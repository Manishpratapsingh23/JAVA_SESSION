package accessSpecifier.p2;
import accessSpecifier.p1.HospitalData;

public class ChildHospitalDifferent extends HospitalData {
    public ChildHospitalDifferent(){
        super();
    }

    public static void main(String[] args) {
        ChildHospitalDifferent ob = new ChildHospitalDifferent();
        ob.displayPublic();
        // ob.displayPrivate();
        // ob.displayDefault();
        ob.displayProtected();
    }
}
