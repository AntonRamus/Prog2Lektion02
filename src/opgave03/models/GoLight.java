package opgave03.models;

public class GoLight extends Billet {
    private final boolean harHaandBagage;

    public GoLight(boolean harHaandBagage) {
        this.harHaandBagage = harHaandBagage;
    }

    @Override
    public double beregnPrisPaaBagage() {
        double totalPris = 0;
        if (harHaandBagage) {
            totalPris += 120;
        }
        if (!super.bagage.isEmpty()) {
            for (Bagage bagagen : bagage) {
                totalPris += bagagen.udregnPris();
            }
        }
        return totalPris;
    }
}
