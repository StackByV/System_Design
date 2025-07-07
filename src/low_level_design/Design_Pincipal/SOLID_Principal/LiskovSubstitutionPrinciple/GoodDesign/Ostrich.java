package low_level_design.Design_Pincipal.SOLID_Principal.LiskovSubstitutionPrinciple.GoodDesign;

public class Ostrich implements Bird{
    @Override
    public void eat() {
        System.out.println("Ostrich eats");
    }
}
