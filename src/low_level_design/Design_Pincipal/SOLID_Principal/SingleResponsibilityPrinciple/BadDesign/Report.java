package low_level_design.Design_Pincipal.SOLID_Principal.SingleResponsibilityPrinciple.BadDesign;

public class Report {
    public String generateReport(){

        // logic to generate report
        return "report content";
    }
    public void printReport(String report){
        // logic to to print report
    }
    public void saveToFile(String report){
        // logic to save report to file
    }
}
