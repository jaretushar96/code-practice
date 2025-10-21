public class CompanyGoogle {
    private String companyName;
    private String location;
    private EmployeeGoogle emp;
    private DatabaseGoogle db;

    public CompanyGoogle(String companyName, String location, int empId, String empName, String dbName, String dbType) {
        this.companyName = companyName;
        this.location = location;
        this.emp = new EmployeeGoogle(empId, empName);
        this.db = new DatabaseGoogle(dbName, dbType);
    }

    public void show() {
        System.out.println("Company: " + companyName + ", Location: " + location);
        emp.show();
        db.show();
    }
}
