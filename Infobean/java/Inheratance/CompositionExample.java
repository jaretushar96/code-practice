// Composition Example
class BackendJava {
    private String backendTech;
    private int backendExp;

    public BackendJava(String backendTech, int backendExp) {
        this.backendTech = backendTech;
        this.backendExp = backendExp;
    }

    public void showBackendDetails() {
        System.out.println("Backend Tech: " + backendTech + ", Experience: " + backendExp + " years");
    }
}

class FullStackJavaDeveloper {
    private String devName;
    private int experience;
    private BackendJava backend; // Composition

    public FullStackJavaDeveloper(String devName, int experience) {
        this.devName = devName;
        this.experience = experience;
        this.backend = new BackendJava("Spring Boot", 3); // created inside (composition)
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

    public TCS() {
        // composition → TCS creates these objects itself
        fsDev = new FullStackJavaDeveloper("Tushar", 5);
        pyDev = new PythonDeveloper("Rahul", 4);
    }

    public void showCompanyDetails() {
        System.out.println("Company: TCS");
        fsDev.showDetails();
        pyDev.showDetails();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        TCS tcs = new TCS();
        tcs.showCompanyDetails();
    }
}

