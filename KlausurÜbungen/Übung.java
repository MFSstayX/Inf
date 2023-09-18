package KlausurÜbungen;
import java.lang.Math; 

public abstract class Übung {
    //final 
    private final double PI = 3.41; 
    private double Pi = Math.PI; 
    //Überladen
    public int summe(int z1, int z2) {
        return z1 + z2; 
    }
    public int summe(int z1, int z2, int z3) {
        return z1 + z2 + z3; 
    }
    //Überschreiben 
    //Zwei Methoden mit identische Sigantur, eine in der Oberklasse, die andere in der Unterlklasse 

    //static 
    public static int summeStatic(int z1, int z2) {
        return z1 + z2; 
    }
    

}
