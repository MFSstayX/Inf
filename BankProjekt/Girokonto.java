public class Girokonto extends Konto{
    private int dispo;
    public Girokonto(int dispo, int kontonr, int saldo, Kunde inhaber) {
        super(kontonr, saldo, inhaber);
        this.dispo = dispo;
    }
    public int getDispo() {
        return dispo; 
    }
    public void setDispo(int dispo) {
        this.dispo = dispo;
    }
    

}
