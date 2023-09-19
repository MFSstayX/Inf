package Krankenhaus;

public class Main {
    public static void main(String[] args) {
        Arzt paul = new Arzt("Pail", "sfgj", 2, "dufggfg", false); 
        Chefarzt p = new Chefarzt("skjfng", "sfjnv", 3, "sifbhuidfsbv", false);
        p.neuerTeammitarbeiter(paul);
        System.out.println(p.getTeam()); 
    }
}
