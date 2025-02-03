package opgave03;

import opgave03.models.Bagage;
import opgave03.models.Business;
import opgave03.models.GoLight;
import opgave03.models.GoSmart;

public class Main {
    public static void main(String[] args) {
        GoLight goLight1 = new GoLight(false);
        GoLight goLight2 = new GoLight(true);

        GoSmart goSmart = new GoSmart();

        Business business = new Business();

        Bagage bagageLille = new Bagage(10);
        Bagage bagageMellem = new Bagage(25);
        Bagage bagageStor = new Bagage(30);
        Bagage bagageKaempe = new Bagage(35);

        System.out.println(goLight1.beregnPrisPaaBagage());
        System.out.println(goLight2.beregnPrisPaaBagage());

        goLight1.addBagage(bagageLille);
        goLight2.addBagage(bagageLille);
        System.out.println(goLight1.beregnPrisPaaBagage());
        System.out.println(goLight2.beregnPrisPaaBagage());

        goSmart.addBagage(bagageLille);
        System.out.println(goSmart.beregnPrisPaaBagage());
        goSmart.addBagage(new Bagage(30));
        System.out.println(goSmart.beregnPrisPaaBagage());

        business.addBagage(bagageLille);
        business.addBagage(bagageStor);
        business.addBagage(new Bagage(30));
        System.out.println(business.beregnPrisPaaBagage());


    }
}
