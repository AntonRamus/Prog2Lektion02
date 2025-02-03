package opgave02.models;

public class ProcentDiscount extends Discount {
    private final String description;
    private final int procentDiscount;

    public ProcentDiscount(String description, int procentDiscount) {
        this.description = description;
        this.procentDiscount = procentDiscount;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * procentDiscount / 100;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
