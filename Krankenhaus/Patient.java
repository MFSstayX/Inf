package Krankenhaus;

public class Patient {
    private double bisherigeRechnungssumme; 
    private boolean privat;
    public Patient(double pBisherigeRechnungssumme, boolean pPrivat) {
        bisherigeRechnungssumme = pBisherigeRechnungssumme; 
        privat = pPrivat; 
    }
    public double getBisherigeRechnungssumme() {
        return bisherigeRechnungssumme; 
    }
    public void setBisherigeRechnungssumme(double bR) {
        bisherigeRechnungssumme = bR; 
    }
}
