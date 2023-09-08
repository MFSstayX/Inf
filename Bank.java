public class Bank {
    private Kunde[] kunden;
    private int anzahlKunden;
    private Konto[] konten;
    private int anzahlKonten;

    public Bank() {
        this.anzahlKunden = 0; 
        this.anzahlKonten = 0;
        kunden = new Kunde[1000];
        konten = new Konto[2000];
    }
     public Kunde[] getKunden() {
        return this.kunden;
    }
    public void setKunden(Kunde[] kunden) {
        this.kunden = kunden;
    }
    public int getAnzahlKunden() {
        return this.anzahlKunden;
    }
    public void setAnzahlKunden(int anzahlKunden) {
        this.anzahlKunden = anzahlKunden;
    }
    public Konto[] getKontos() {
        return this.konten;
    }
    public void setKontos(Konto[] kontos) {
        this.konten = kontos;
    }
    public int getAnzahlKonten() {
        return this.anzahlKonten;
    }
    public void setAnzahlKonten(int anzahlKonten) {
        this.anzahlKonten = anzahlKonten;
    }
    public void neuerKunde(String name, String vorname, String anschrift, int geburtsdatum) {
        int kundennummer = anzahlKunden += 1000; 
        kunden[anzahlKunden] = new Kunde(name, vorname, anschrift, kundennummer, geburtsdatum);
        this.anzahlKunden += 1;
    }
     public void neuesKonto(char art, int saldo, Kunde inhaber) {
        int kontonr = anzahlKonten += 1000; 
        konten[anzahlKonten] = new Konto(kontonr,  saldo, null);
        this.anzahlKonten += 1;
    }
}