package opgave02.models;

public abstract class Discount {

    public abstract double applyDiscount(Basket basket);
    public abstract String getDescription();
}
