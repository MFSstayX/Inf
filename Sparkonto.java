public class Sparkonto extends Konto{
    private double zinssatz; 
    public Sparkonto(double zinssatz, int kontonr, int saldo){
        super(kontonr, saldo);
        this.zinssatz = zinssatz;
}
public double getZinssatz() {
    return zinssatz; 
}
public void setZinssatz(double zinssatz) {
    this.zinssatz = zinssatz; 
}

}
