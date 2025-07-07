package low_level_design.Design_Pincipal.SOLID_Principal.LiskovSubstitutionPrinciple.GoodDesign;

public class Main {
    public static void main(String[] args){
        Sparrow s = new Sparrow();
        s.eat();
        s.fly();

        Ostrich o = new Ostrich();
        o.eat();
    }
}
