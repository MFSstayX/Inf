package KlausurÜbungen.Auto;

public class PKW {
    private int kmh; 
    private int gefahrenKm; 
    public PKW(int kmh, int gefahrenKm) {
        this.kmh = kmh; 
        this.gefahrenKm = gefahrenKm; 
    }
    public void fahren(int Strecke) {
        this.gefahrenKm -= Strecke; 
    }
    
}

