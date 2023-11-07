package pl.gornik.Model;

public class Book extends Produkt{
    private String autor;

    public Book(String tytul, int liczbaSztuk, double cena) {
        super(tytul, liczbaSztuk, cena);


    }



    public Book(String tytul, int liczbaSztuk, double cena, String autor) {
        super(tytul, liczbaSztuk, cena);
        this.autor = autor;
    }

    @Override
    public String displayProdukt() {
        String result = super.displayProdukt().concat(", autor: " + autor);
        return result;
    }
}
