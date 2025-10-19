// Aggregation Example
class BackendJava {
    private String backendTech;
    private int backendExp;

    public BackendJava(String backendTech, int backendExp)
     {
        this.backendTech = backendTech;
        this.backendExp = backendExp;
    }

    public void showBackendDetails() 
    {
        System.out.println("Backend Tech: " + backendTech + ", Experience: " + backendExp + " years");
    }
}

class FullStackJavaDeveloper 
{
    private String devName;
    private int experience;
    private BackendJava backend; // Aggregation

    public FullStackJavaDeveloper(String devName, int experience, BackendJava backend) 
    {
        this.devName = devName;
        this.experience = experience;
        this.backend = backend; // passed from outside (not created inside)
    }

    public void showDetails() {
        System.out.println("FullStack Java Developer: " + devName + ", Experience: " + experience + " years");
        backend.showBackendDetails();
    }
}

class PythonDeveloper {
    private String devName;
    private int experience;

    public PythonDeveloper(String devName, int experience) {
        this.devName = devName;
        this.experience = experience;
    }

    public void showDetails() {
        System.out.println("Python Developer: " + devName + ", Experience: " + experience + " years");
    }
}

class TCS {
    private FullStackJavaDeveloper fsDev;
    private PythonDeveloper pyDev;

    public TCS(FullStackJavaDeveloper fsDev, PythonDeveloper pyDev) {
        // Aggregation → TCS only holds references
        this.fsDev = fsDev;
        this.pyDev = pyDev;
    }

    public void showCompanyDetails() {
        System.out.println("Company: TCS");
        fsDev.showDetails();
        pyDev.showDetails();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        BackendJava backend = new BackendJava("Spring Boot", 3);
        FullStackJavaDeveloper fsDev = new FullStackJavaDeveloper("Tushar", 5, backend);
        PythonDeveloper pyDev = new PythonDeveloper("Rahul", 4);

        // pass existing developer objects to TCS
        TCS tcs = new TCS(fsDev, pyDev);
        tcs.showCompanyDetails();
    }
}
