package low_level_design.Design_Pincipal.SOLID_Principal.DependencyInversionPrinciple.GoodDesign;

// Abstraction
interface Database {
    void saveData(String data);
}

// Low-level module
class MySQLDatabase implements Database {
    public void saveData(String data) {
        // Save to MySQL
    }
}

// High-level module
class UserService {
    private Database db;

    // DIP: Depend on abstraction
    public UserService(Database db) {
        this.db = db;
    }

    void save(String data) {
        db.saveData(data);
    }
}

public class Main {
}
