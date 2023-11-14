package pl.gornik;

import pl.gornik.Model.Book;
import pl.gornik.Model.Disc;
import pl.gornik.Model.Produkt;
import pl.gornik.Model.Toy;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Koszykk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Produkt> produkty = new ArrayList<>();
        produkty.add(new Book(" Pan Tadeusz ",10, 30,"Adam Mickiewicz"));
        produkty.add(new Book(" Lalka ",9, 25, "Bolesław Prus"));
        produkty.add(new Book(" Quo Vadis ",8,20,"Henryk Sienkiewicz"));
        produkty.add(new Book(" Wiedżmin ",7,15,"A.Sapkowski"));
        produkty.add(new Disc(" Piosenka1 ", 11, 30,"Adam.A"));
        produkty.add(new Disc(" Piosenka2 ",12, 35, "Adam.B"));
        produkty.add(new Disc(" Piosenka3 ",13,40,"Adam.C"));
        produkty.add(new Disc(" Piosenka4 ",14,45,"Adam.D"));
        produkty.add(new Toy(" Lego ", 16, 340,8));
        produkty.add(new Toy(" Lalka ",43, 252, 3));
        produkty.add(new Toy(" Samochodzik ",22,29,5));
        produkty.add(new Toy(" Planszówka ",23,55,12));

            for(Produkt produkt:produkty){
            System.out.println(produkt.displayProdukt());
        }

        while(true) {

            while (true) {
                System.out.println("Jeżeli chcesz zakonczyc program wpisz koniec");
                Scanner scanner2 = new Scanner(System.in);
                String choice = scanner2.nextLine();
                if (choice.equals("koniec"))
                    break;
            }
            int liczbaProduktow = 1;
            Scanner scanner1 = new Scanner(System.in);

            while (liczbaProduktow != 2){
                System.out.printf("Podaj liczbe produktów który chcesz zakpic");
                int wybor = scanner1.nextInt();
                if(liczbaProduktow > wybor){

                }
                else{
                    System.out.println("Nie wystarczająca liczba produktów w sklepie");
                    break;
                }
            }


        }


        /*
        for(Produkt produkt:produkty){
            System.out.println(produkt.displayProdukt());
        }

        List<Koszykk>koszykk = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        String nazwa = scanner1.nextLine();

       int i = 0;
       for(Produkt produkt : produkty) {
           System.out.println(i + "." + produkt.getCena() + "." + produkt.getTytul() + "." + produkt.getLiczbaSztuk() + ".");
           i++;
       }
       int liczbaProduktow = 1;
       while(liczbaProduktow != 2){
           System.out.println("Podaj liczbe produktów których chcesz zakupić");
           scanner1.nextInt();
           if(liczbaProduktow
       }
       */


    }
}
