package low_level_design.Design_Pincipal.SOLID_Principal.DependencyInversionPrinciple.BadDesign;

class MySQLDatabase {
    void saveData(String data) {
        // Save to MySQL
    }
}

class UserService {
    private MySQLDatabase db = new MySQLDatabase(); // direct dependency

    void save(String data) {
        db.saveData(data);
    }
}


public class Main {
}
