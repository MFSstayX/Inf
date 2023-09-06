public class Bank {
    private Kunde[] kunden;
    private int annzahlKunden; 
    public Bank(Kunde[] kunden, int anzahlKunden) {
        this.annzahlKunden = anzahlKunden; 
        kunden[] = new Kunde[1000];
    }
    public void neuerKunde(Kunde kunde) {
        kunden[annzahlKunden] = kunde; 
        this.annzahlKunden += 1;
    }
    public void neuesKonto(String art) {
        
    }
    // Hier müssen einzahlen, auzahlen und überweisen als Methode hin + neue kunden und neue Konten
}