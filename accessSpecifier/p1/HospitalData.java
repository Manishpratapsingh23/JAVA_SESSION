package accessSpecifier.p1;

public class HospitalData {
    public String hospitalName = "City Hospital";       // public → accessible everywhere
    protected String doctorName = "Dr. Sharma";         // protected → accessible in subclasses and for classes in same package,
                                                                                    // even in different package only for subclasses
    String patientName = "John Doe";                    // default → accessible only inside same package
    private String secretCode = "HSP123";               // private → accessible only inside this class

    public HospitalData(){
        System.out.println("Constructer Called");
    }

    public void displayPublic() {
        System.out.println("Hospital: " + hospitalName);
    }

    protected void displayProtected() {
        System.out.println("Doctor: " + doctorName);
    }

    void displayDefault() {
        System.out.println("Patient: " + patientName);
    }

    private void displayPrivate() {
        System.out.println("Secret Code: " + secretCode);
    }

    
}
