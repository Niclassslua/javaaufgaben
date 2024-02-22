import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzereingabe für die Zahlen und die gewünschte Operation
        System.out.println("Willkommen beim einfachen Taschenrechner!");
        System.out.print("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Wählen Sie die Operation (1 für Addition, 2 für Subtraktion, 3 für Multiplikation, 4 für Division): ");
        int operation = scanner.nextInt();

        // Verarbeitung der Benutzerauswahl und Ausführung der Operation
        if (operation == 1) {
            // Addition
        } else if (operation == 2) {
            // Subtraktion
        } else if (operation == 3) {
            // Multiplikation
        } else if (operation == 4) {
            // Division, mit Fehlerbehandlung für Division durch Null
        } else {
            System.out.println("Ungültige Auswahl der Operation.");
        }

        scanner.close();
    }

    // Methode für die Addition
    private static double add(double num1, double num2) {
        // Implementiere die Logik zur Addition von num1 und num2
        return 0; // Platzhalter
    }

    // Methode für die Subtraktion
    private static double subtract(double num1, double num2) {
        // Implementiere die Logik zur Subtraktion von num2 von num1
        return 0; // Platzhalter
    }

    // Methode für die Multiplikation
    private static double multiply(double num1, double num2) {
        // Implementiere die Logik zur Multiplikation von num1 und num2
        return 0; // Platzhalter
    }

    // Methode für die Division
    private static double divide(double num1, double num2) {
        // Implementiere die Logik zur Division von num1 durch num2
        // Vergiss nicht, eine Fehlerbehandlung für Division durch Null hinzuzufügen
        return 0; // Platzhalter
    }

}
