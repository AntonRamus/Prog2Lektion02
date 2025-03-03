package opgave02.controller;


import opgave02.models.*;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new EBook(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        basket.addItem(new Book(450, "Hands on machine learning"));
        basket.addItem(new EBook(200, "SQL in 10 minutes a day"));
        basket.addDiscount(new ProcentDiscount("10% rabat på alt.", -10));
        basket.addDiscount(new EBookProcentDiscount("5% rabat på e-bøger", -5));
        basket.addDiscount(new FixedDiscount("25 kr rabat på beløb over 500 kr.", -25, 500));
        basket.addDiscount(new FixedDiscount("50 kr rabat på beløb over 1000 kr.",-50, 1000));
        basket.addDiscount(new TwoForOneDiscount("To for ens pris."));
        basket.printTotal();

    }
}
