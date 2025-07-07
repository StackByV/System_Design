package low_level_design.Design_Pincipal.SOLID_Principal.InterfaceSegragationPrinciple.GoodDesign;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() { }
    public void eat() { }
}

class RobotWorker implements Workable {
    public void work() { }
}


public class Main {
    public static void main(String[] args){


    }
}
