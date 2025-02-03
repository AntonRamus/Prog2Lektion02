package opgave03.models;

public class GoSmart extends Billet {

    @Override
    public double beregnPrisPaaBagage() {
        double totalPris = 0;
        boolean gratisBagageChecketInd = false;
        for (Bagage bagagen : bagage) {
            if (bagagen.getVaegt() < 23) {
                if (!gratisBagageChecketInd) {
                    gratisBagageChecketInd = true;
                } else {
                    totalPris += 310;
                }
            } else {
                totalPris += bagagen.udregnPris();
            }
        }
        return totalPris;
    }
}
