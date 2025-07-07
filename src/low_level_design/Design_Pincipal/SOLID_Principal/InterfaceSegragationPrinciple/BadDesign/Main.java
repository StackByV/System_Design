package low_level_design.Design_Pincipal.SOLID_Principal.InterfaceSegragationPrinciple.BadDesign;

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() { }
    public void eat() { }
}

class RobotWorker implements Worker {
    public void work() { }
    public void eat() {
        // robots don't eat
        throw new UnsupportedOperationException("Robots don't eat");
    }
}


public class Main {
    public static void main(String[] args){
        RobotWorker chitti = new RobotWorker();
        chitti.eat();

    }
}
