package Krankenhaus;

public class Arzt extends Personal{
    private String fachgebiet; 
    private boolean behandeltPrivatpatienten; 
    public Arzt(String pName, String pAnschrift, double pGehalt, String pFachgebiet, boolean pBehandeltPrivatpatienten) {
        super(pName, pAnschrift, pGehalt);
        fachgebiet = pFachgebiet; 
        behandeltPrivatpatienten = pBehandeltPrivatpatienten; 
    }
}
