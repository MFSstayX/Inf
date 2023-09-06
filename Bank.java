public class Bank {
    private Kunde[] kunden;
    private int annzahlKunden; 
    private Konto[] kontos;
    public Bank() {
        this.annzahlKunden = 0; 
        kunden = new Kunde[1000];
    }
    public void neuerKunde(String name, String vorname, String anschrift, int geburtsdatum) {
        int kundennummer = annzahlKunden += 1000; 
        kunden[annzahlKunden] = new Kunde(name, vorname, anschrift, kundennummer, geburtsdatum);
        this.annzahlKunden += 1;
    }
     public void neuesKonto(String name, String vorname, String anschrift, int geburtsdatum) {
        int kundennummer = annzahlKunden += 1000; 
        kunden[annzahlKunden] = new Kunde(name, vorname, anschrift, kundennummer, geburtsdatum);
        this.annzahlKunden += 1;
    }
    public void neuesKonto(String art) {
        
    }
    // Hier müssen einzahlen, auzahlen und überweisen als Methode hin + neue kunden und neue Konten
}