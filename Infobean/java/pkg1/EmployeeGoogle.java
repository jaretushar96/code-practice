public class EmployeeGoogle {
    private int id;
    private String name;

    public EmployeeGoogle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
