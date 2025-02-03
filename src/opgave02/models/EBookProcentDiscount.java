package opgave02.models;

public class EBookProcentDiscount extends ProcentDiscount {

    public EBookProcentDiscount(String description, int procentDiscount) {
        super(description, procentDiscount);
    }

    @Override
    public double applyDiscount(Basket basket) {
        double eBookTotal = 0;
        for (Book item : basket.getItems()) {
            if (item instanceof EBook eBook) {
                eBookTotal += eBook.getPrice();
            }
        }
        return eBookTotal * super.getProcentDiscount() / 100;
    }
}
