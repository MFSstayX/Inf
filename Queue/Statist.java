public class Statist {
    private String name;
    private char gesch;
    
    public Statist(String name, char gesch) {
        this.name = name; 
        this.gesch = gesch; 
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGesch() {
        return this.gesch;
    }

    public void setGesch(char gesch) {
        this.gesch = gesch;
    }
}
