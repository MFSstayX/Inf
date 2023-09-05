class Main{public static void main(String[] args) {
    Bank volksbank = new Bank();
    Kunde kunde = new Kunde("Wetzel", "Paul", "Parselvalstraße 48", 282475, 210907, volksbank);
    Konto konto = new Konto(23497293, 500, kunde);
    System.out.println(konto.getSaldo());
    
}
}