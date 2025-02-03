package opgave03.models;

import java.util.ArrayList;

public abstract class Billet {
    protected ArrayList<Bagage> bagage = new ArrayList<>();

    public abstract double beregnPrisPaaBagage();

    public void addBagage(Bagage bagage) {
        if (!this.bagage.contains(bagage)) {
            this.bagage.add(bagage);
        }
    }
}
