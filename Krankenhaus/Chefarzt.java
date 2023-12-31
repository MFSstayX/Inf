package Krankenhaus;

public class Chefarzt extends Arzt{
    private Arzt[] teammitarbeiter; 
    private int anzahlTeammitarbeiter; 
    public Chefarzt(String pName, String pAnschrift, double pGehalt, String pFachgebiet, boolean pBehandeltPrivatpatienten) {
        super(pName, pAnschrift, pGehalt, pFachgebiet, pBehandeltPrivatpatienten);
        anzahlTeammitarbeiter = 0; 
        teammitarbeiter = new Arzt[20];
    }
    public void neuerTeammitarbeiter(Arzt pArzt){
        teammitarbeiter[anzahlTeammitarbeiter] = pArzt; 
        anzahlTeammitarbeiter += 1; 
    }
    public Arzt[] getTeam() {
        return teammitarbeiter; 
    }
}