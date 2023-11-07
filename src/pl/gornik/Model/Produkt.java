package pl.gornik.Model;

public class Produkt {
    private String tytul;
    private int liczbaSztuk;
    private double cena;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public void setLiczbaSztuk(int liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Produkt(String tytul, int liczbaSztuk, double cena) {
        this.tytul = tytul;
        this.liczbaSztuk = liczbaSztuk;
        this.cena = cena;
    }
    public static double countPrice(String tytul, int liczbaSztuk, double cena){

            return liczbaSztuk * cena;
        }


    public String displayProdukt() {
        return "Produkt{" +
                "tytul='" + tytul + '\'' +
                ", liczbaSztuk=" + liczbaSztuk +
                ", cena=" + cena +
                '}';
    }

    }


