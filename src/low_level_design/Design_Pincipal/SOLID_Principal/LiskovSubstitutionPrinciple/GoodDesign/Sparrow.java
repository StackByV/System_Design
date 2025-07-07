package low_level_design.Design_Pincipal.SOLID_Principal.LiskovSubstitutionPrinciple.GoodDesign;

public class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow fly");

    }

    @Override
    public void eat() {
        System.out.println("Sparrow eat");
    }
}
