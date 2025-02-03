package opgave02.models;

public class FixedDiscount extends Discount {
    private final String description;
    private final int fixedDiscount;
    private final int minimumAmount;

    public FixedDiscount(String description, int fixedDiscount, int minimumAmount) {
        this.description = description;
        this.fixedDiscount = fixedDiscount;
        this.minimumAmount = minimumAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount >= minimumAmount) {
            return fixedDiscount;
        } else {
            return 0;
        }
    }

    @Override
    public String getDescription() {
        return description;
    }
}
