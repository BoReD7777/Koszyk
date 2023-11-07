package pl.gornik.Model;

public class Disc extends Produkt{
    private String wykonawca;

    public Disc(String tytul, int liczbaSztuk, double cena) {
        super(tytul, liczbaSztuk, cena);
    }

    public Disc(String tytul, int liczbaSztuk, double cena, String wykonawca) {
        super(tytul, liczbaSztuk, cena);
        this.wykonawca = wykonawca;
    }

    @Override
    public String displayProdukt() {
        String result = super.displayProdukt().concat(", wykonawca: " + wykonawca);
        return result;
    }
}
