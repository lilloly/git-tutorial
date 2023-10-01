import java.util.Scanner;

public class App {
    private Scanner userInput;
    String pulseRate;
    String respiratoryRate;
    String oxygenSaturation;


    // EFFECTS: runs the homework application
    public App() {
        userInput = new Scanner(System.in);
        runApp();
    }

    public void runApp() {

        boolean keepGoing = true;
        String input;

        userInput = new Scanner(System.in);

        while (keepGoing) {
            displayMenu();
            input = userInput.nextLine();
            input = input.toUpperCase();

            if (input.equals("QUIT")) {
                keepGoing = false;
            }
            else {
                processCommand(input);
            }
        }

        System.out.println("Goodbye!");
    }

    private void processCommand(String input) {
        if (input.equals("ENTER VITALS")) {
            enterVital();
        } else if (input.equals("PRINT REPORT")) {
            printReport();
        } else {
            System.out.println("Selection not valid. Please try again ...");
        }
    }

    private void displayMenu() {
        System.out.println("\nSelect:");
        System.out.println("Enter vitals");
        System.out.println("Print Report");
        System.out.println("Quit");
    }

    private void enterVital() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Pulse Rate per minute");
        String response = input1.nextLine().toUpperCase();
        pulseRate = response;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Respiratory Rate per minute");
        response = input2.nextLine().toUpperCase();
        respiratoryRate = response;

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Oxygen Saturation");
        response = input3.nextLine().toUpperCase();
        oxygenSaturation = response;

        System.out.println("Vitals Recorded");
    }

    private void printReport() {
        System.out.println("Pulse Rate Result: " + pulseRate);
        System.out.println("Respiratory Rate Result: " + respiratoryRate);
        System.out.println("Oxygen Saturation: " + oxygenSaturation);

        int temp = Integer.parseInt(pulseRate);
        if (temp > 80) {
            System.out.println("\t You are a COPD patient with a high risk of dying");
        }
    }
}
