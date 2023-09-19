public abstract class Buch {
    private int ISBN; 
    private String titel; 
    private int seitenanzahl; 
    private String kommentar; 
    public Buch(int ISBN, String titel, int seitenanzahl) {
        this.ISBN = ISBN; 
        this.titel = titel; 
        this.seitenanzahl = seitenanzahl; 
        this.kommentar = " "; 
    }
    public void kommentieren(String kommentar) {
        this.kommentar = kommentar; 
    }
    public String getTitel() {
        return this.titel; 
    }
}
