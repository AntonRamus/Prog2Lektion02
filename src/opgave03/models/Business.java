package opgave03.models;

public class Business extends Billet {

    @Override
    public double beregnPrisPaaBagage() {
        double totalPris = 0;
        int gratisBagageChecketInd = 0;
        for (Bagage bagagen : bagage) {
            if (bagagen.getVaegt() < 32) {
                if (gratisBagageChecketInd < 2) {
                    gratisBagageChecketInd++;
                } else {
                    totalPris += bagagen.udregnPris();
                }
            } else {
                totalPris += bagagen.udregnPris();
            }
        }
        return totalPris;
    }
}
