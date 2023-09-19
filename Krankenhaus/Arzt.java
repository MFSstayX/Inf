package Krankenhaus;

public class Arzt extends Personal{
    private String fachgebiet; 
    private boolean behandeltPrivatpatienten; 

    public void setBehandeltPrivatpatienten(boolean behandeltPrivatpatienten) {
        this.behandeltPrivatpatienten = behandeltPrivatpatienten;
    }
    public Arzt(String pName, String pAnschrift, double pGehalt, String pFachgebiet, boolean pBehandeltPrivatpatienten) {
        super(pName, pAnschrift, pGehalt);
        fachgebiet = pFachgebiet; 
        behandeltPrivatpatienten = pBehandeltPrivatpatienten; 
    }
    public String getFachgebiet() {
        return this.fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    public boolean isBehandeltPrivatpatienten() {
        return this.behandeltPrivatpatienten;
    }

    public boolean getBehandeltPrivatpatienten() {
        return this.behandeltPrivatpatienten;
    }

}
