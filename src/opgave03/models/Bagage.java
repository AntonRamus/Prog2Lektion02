package opgave03.models;

public class Bagage {
    private final double vaegt;

    public Bagage(double vaegt) {
        this.vaegt = vaegt;
    }

    public double udregnPris() {
        if (vaegt < 23) {
            return  310;
        } else if (vaegt > 28) {
            return  590;
        } else {
            return  330;
        }
    }

    public double getVaegt() {
        return vaegt;
    }
}
