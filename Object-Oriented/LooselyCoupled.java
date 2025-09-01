// 1. Define the abstraction (the contract).
interface DatabaseService {
    void saveData();
}

// 2. Provide a concrete implementation.
class MySQLService implements DatabaseService {
    @Override
    public void saveData() {
        // Complex, specific MySQL code here...
        System.out.println("Saving data to MySQL database.");
    }
}

// 3. The CustomerManager class is given the abstract type.
class CustomerManager {
    // We depend on the abstract interface, not a specific implementation.
    private DatabaseService dbService; 

    // Dependency is injected through the constructor.
    public CustomerManager(DatabaseService service) {
        this.dbService = service;
    }

    public void saveCustomer() {
        // We just call the method on the interface.
        dbService.saveData(); 
    }
}

// 4. In the LooselyCoupled application, we wire it all together.
public class LooselyCoupled {
    public static void main(String[] args) {
        // We can easily swap implementations at runtime.
        DatabaseService mySql = new MySQLService();
        CustomerManager manager = new CustomerManager(mySql);
        manager.saveCustomer(); // Prints "Saving data to MySQL database."
        
        // We could swap to an Oracle implementation with no changes to CustomerManager.
        // DatabaseService oracle = new OracleService();
        // CustomerManager manager2 = new CustomerManager(oracle);
    }
}