package pl.gornik.Model;

public class Toy extends Produkt{

    private int minimalnyWiek;


    public Toy(String tytul, int liczbaSztuk, double cena) {
        super(tytul, liczbaSztuk, cena);
    }

    public Toy(String tytul, int liczbaSztuk, double cena, int minimalnyWiek) {
        super(tytul, liczbaSztuk, cena);
        this.minimalnyWiek = minimalnyWiek;
    }

    @Override
    public String displayProdukt() {
        String result = super.displayProdukt().concat(", minimalnyWiek: " + minimalnyWiek);
        return result;
    }
}
