
public class Kunde {
    private String name; 
    private String vorname; 
    private String anschrift; 
    private int kundennummer; 
    private int geburtsdatum;
    private Girokonto girokonto;
    private Sparkonto sparkonto;

    public Kunde(String name, String vorname, String anschrift, int kundenummer, int geburtsdatum) {
        this.name = name; 
        this.vorname = vorname; 
        this.anschrift = anschrift; 
        this.geburtsdatum = geburtsdatum;
        this.girokonto = null; 
        this.sparkonto = null; 


    }
    public Girokonto getGirokonto() {
        return this.girokonto;
    }
    public void setGirokonto(Girokonto girokonto) {
        this.girokonto = girokonto;
    }
    public Sparkonto getSparkonto() {
        return this.sparkonto;
    }
    public void setSparkonto(Sparkonto sparkonto) {
        this.sparkonto = sparkonto;
    }

    public String getName() {
        return name; 
    }
    public void setName(String name) {
        this.name = name; 
    }
    public String getVorname() {
        return vorname; 
    }
    public void setVorname(String vorname) {
        this.vorname = vorname; 
    }
    public String getAnschrift() {
        return anschrift; 
    }
    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public int getGeburtsdatum() {
        return this.geburtsdatum;
    }
    public void setGeburtsdatum(int geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    
    public void einzahlen(int betrag, int kontonr){
        
    }
    public void auszahlen(int betrag, int kontonr){

    }
    public void abheben(int betrag, int kontonr, int pin){

    }
    public void überweisen(int betrag, int kontonrEingang, int kontonrAusgang ){

    }


}