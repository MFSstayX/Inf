public class Bank {
    private Kunde[] kunden;
    private int anzahlKunden; 
    private Konto[] kontos;
    private int anzahlKonten;
    public Bank() {
        this.anzahlKunden = 0; 
        this.anzahlKonten = 0;
        kunden = new Kunde[1000];
        kontos = new Konto[1000];
    }
    public void neuerKunde(String name, String vorname, String anschrift, int geburtsdatum) {
        int kundennummer = anzahlKunden += 1000; 
        kunden[anzahlKunden] = new Kunde(name, vorname, anschrift, kundennummer, geburtsdatum);
        this.anzahlKunden += 1;
    }
     public void neuesKonto(int saldo, Kunde inhaber) {
        int kontonr = anzahlKonten += 1000; 
        kontos[anzahlKonten] = new Konto(kontonr,  saldo, null);
        this.anzahlKonten += 1;
    }
    // Hier müssen einzahlen, auzahlen und überweisen als Methode hin + neue kunden und neue Konten
}