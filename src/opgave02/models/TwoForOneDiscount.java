package opgave02.models;

public class TwoForOneDiscount extends Discount {
    private final String description;

    public TwoForOneDiscount(String description) {
        this.description = description;
    }

    @Override
    public double applyDiscount(Basket basket) {
        Book cheapestBook = basket.getItems().getFirst();
        if (basket.getItems().size() > 1) {
            for (int i = 1; i < basket.getItems().size(); i++) {
                if (cheapestBook.getPrice() > basket.getItems().get(i).getPrice()) {
                    cheapestBook = basket.getItems().get(i);
                }
            }
        }
        return -cheapestBook.getPrice();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
