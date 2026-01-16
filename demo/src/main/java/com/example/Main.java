public class Main {

    public static void main(String[] args) {
        try {
            Roata r1 = new Roata(10);
            Roata r2 = new Roata(12);
            Roata r3 = new Roata(14);
            Roata r4 = new Roata(16);

            Masina masina = new Masina("Dacia");

            masina.adaugaRoata(r1);
            masina.adaugaRoata(r2);
            masina.adaugaRoata(r3);
            masina.adaugaRoata(r4);

            double arieTotala = masina.calculeazaArieTotala();
            System.out.println("Aria totala a rotilor: " + arieTotala);

        } catch (PreaMulteRoti e) {
            System.out.println(e.getMessage());
        }
    }
}
