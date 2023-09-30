import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ...");

        String response = input.nextLine();

        System.out.println("Result: " + response);
        input.close();
    }
}
