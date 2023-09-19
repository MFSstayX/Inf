package Krankenhaus;

public class Main {
    public static void main(String[] args) {
        Arzt paul = new Arzt("Pail", "sfgj", 2, "dufggfg", true); 
        Chefarzt p = new Chefarzt("skjfng", "sfjnv", 3, "sifbhuidfsbv", false);
        Krankenhaus k = new Krankenhaus(2.0, 2.0);
        Patient l = new Patient(2.0, false, paul);
        k.behandeln(l, p, 20);
        System.out.println(l.getBisherigeRechnungssumme()); 
        System.out.println(paul.getBehandeltPrivatpatienten());
    }
}
