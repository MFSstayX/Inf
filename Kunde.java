public class Kunde {
    private String name; 
    private String vorname; 
    private String anschrift; 
    private int kundennummer; 
    private int PIN; 

    public Kunde(String name, String vorname, String anschrift, int kundenummer, int PIN) {
        this.name = name; 
        this.vorname = vorname; 
        this.anschrift = anschrift; 
        this.kundennummer = kundenummer; 
        this.PIN = PIN; 
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
    public int getPIN() {
        return PIN; 
    }
    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

}