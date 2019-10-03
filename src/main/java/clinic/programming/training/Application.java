package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside the app. does this print just by making the app variable a new application???");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
    }
}