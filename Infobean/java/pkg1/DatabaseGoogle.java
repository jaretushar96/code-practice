public class DatabaseGoogle {
    private String dbName;
    private String dbType;

    public DatabaseGoogle(String dbName, String dbType) {
        this.dbName = dbName;
        this.dbType = dbType;
    }

    public void show() {
        System.out.println("Database: " + dbName + ", Type: " + dbType);
    }
}

