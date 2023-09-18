package KlausurÜbungen;

import KlausurÜbungen.Auto.Mensch;
import KlausurÜbungen.Auto.PKW;

public class Main {
    public static void main(String[] args) {
        PKW BMW = new PKW(120, 12000);
        Mensch paul = new Mensch(BMW, "Paul");
        BMW.fahren(20);
        

    }
}
