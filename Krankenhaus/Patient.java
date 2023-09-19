package Krankenhaus;

public class Patient {
    private double bisherigeRechnungssumme; 
    private boolean istPrivatversichert;
    private Arzt behandelnderArzt; 
    public Patient(double pBisherigeRechnungssumme, boolean pPrivat, Arzt benahdelnderArzt) {
        bisherigeRechnungssumme = pBisherigeRechnungssumme; 
        istPrivatversichert= pPrivat; 
        behandelnderArzt = benahdelnderArzt; 
    }
    public Arzt getBehandelndeArzt() {
        return behandelnderArzt; 
    }
    public void setBehandelnderArzt(Arzt behArzt) {
        behandelnderArzt = behArzt; 
    }
    public double getBisherigeRechnungssumme() {
        return bisherigeRechnungssumme; 
    }
    public void setBisherigeRechnungssumme(double bR) {
        bisherigeRechnungssumme = bR; 
    }
    public boolean getIstPrivatversichert() {
        return istPrivatversichert; 
    }
}
