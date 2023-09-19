package Krankenhaus;

public class Personal {
    private String name; 
    private String anschrift; 
    private double gehalt; 

    public Personal(String pName, String pAnschrift, double pGehalt) {
        name = pName; 
        anschrift = pAnschrift; 
        gehalt = pGehalt; 
    }
     public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnschrift() {
        return this.anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public double getGehalt() {
        return this.gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
