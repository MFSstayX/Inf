package Krankenhaus;

public class Krankenhaus {
    private double abrechnugssatzKassenpatienten; 
    private double abrechnungssatzPrivatpatienten; 
    public Krankenhaus(double pAbrechnungssatzKassenpatienten, double pAbrechnungssatzPrivatpatienten) {
        abrechnugssatzKassenpatienten = pAbrechnungssatzKassenpatienten; 
        abrechnungssatzPrivatpatienten = pAbrechnungssatzPrivatpatienten; 
    }
    public void behandeln(Patient pPatient, Arzt pArzt, int pBehandlungsdauer) {
        double abrechung;
        double kosten; 
        if(pPatient.getIstPrivatversichert()) {
            abrechung = abrechnungssatzPrivatpatienten;
            pArzt.setBehandeltPrivatpatienten(true);

        }else {
            abrechung = abrechnugssatzKassenpatienten;
            pArzt.setBehandeltPrivatpatienten(false);
        }
        pPatient.setBehandelnderArzt(pArzt); 
        kosten = abrechung *pBehandlungsdauer;
        pPatient.setBisherigeRechnungssumme(kosten); 

    }
}
