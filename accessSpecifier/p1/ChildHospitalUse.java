package accessSpecifier.p1;

public class ChildHospitalUse {
    public static void  main(String args[]){
        ChildHospital ob = new ChildHospital();
        ob.displayPublic();
        //ob.displayPrivate();
        ob.displayDefault();
        ob.displayProtected();
    }
}
