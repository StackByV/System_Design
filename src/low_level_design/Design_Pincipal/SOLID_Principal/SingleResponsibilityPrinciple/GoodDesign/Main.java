package low_level_design.Design_Pincipal.SOLID_Principal.SingleResponsibilityPrinciple.GoodDesign;

class Report{
    public String generate(){
        // report generation logic
        return "return report content";

    }
}

class ReportPrinter{
    public void print(String report){
        // report printing logic
    }
}

class Reportsaver{
    public void save(String report){
        // logicto save report
    }
}

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.generate();
    }

}
