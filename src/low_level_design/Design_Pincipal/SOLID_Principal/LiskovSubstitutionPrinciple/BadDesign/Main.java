package low_level_design.Design_Pincipal.SOLID_Principal.LiskovSubstitutionPrinciple.BadDesign;

class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}



public class Main {
    public static void main(String[] args){
        Bird bird = new Ostrich();
        bird.fly();  // exception

    }

}
