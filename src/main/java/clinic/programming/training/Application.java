package clinic.programming.training;
import java.util.*;

public class Application {
    public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String greeting : greetings) {
			System.out.println("Greeting: " + greeting);
		}
	}
    public Application() {
        System.out.println ("Inside the app. does this print just by making the app variable a new application???");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
}