import java.util.*;

public class Masina {
    private String marca;
    private List<Roata>roti;

    public Masina(String marca) {
        this.marca = marca;
        this.roti = new ArrayList<>();
    }

    public void adaugaRoata(Roata roata) throws PreaMulteRoti {
        if(roti.size() >= 4) {
            throw new PreaMulteRoti();
        }
        roti.add(roata);
    }

    public double calculeazaArieTotala() {
        double suma = 0;
        for (Roata r : roti){
            suma += r.calculeazaArie();
        }
        return suma;
    }

}