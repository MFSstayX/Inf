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
     public void neuesKonto(char art, int kundennummer) {
        boolean gefunden = false; 
        for( int i = 0; i <= kunden.length; i++) {
            if(kunden[i].getKundennummer() == kundennummer) {
                gefunden = true; 
                break;
            } 
        }
        if(gefunden) {
            if( art == 'g' ) {
                int kontonr = kundennummer*100+1;
                konten[anzahlKonten] = new Girokonto(0, kontonr, 0, null);
                Kunde kunde = null;
                for (int i = 0; i<= kunden.length; i++){
                    if (kunden[i].getKundennummer() == kundennummer){
                        kunde = kunden[i];
                        break; 
                    }
                }
                kunde.setGirokonto(new Girokonto(0, kontonr, 0, null));
            }else if( art == 's') {
                int kontonr = kundennummer*100+1;
                konten[anzahlKonten] = new Sparkonto(0, kontonr, 0, null);
            }
        }


    }
}