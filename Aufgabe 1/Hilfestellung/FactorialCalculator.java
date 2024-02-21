import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Fakultätsberechner!");
        System.out.print("Bitte geben Sie eine nicht-negative ganze Zahl ein: ");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Die eingegebene Zahl darf nicht negativ sein. Bitte starten Sie das Programm neu und geben Sie eine gültige Zahl ein.");
        } else {
            System.out.print("Wählen Sie die Berechnungsmethode (1 für iterativ, 2 für rekursiv): ");
            int method = scanner.nextInt();

            if (method == 1) {
                System.out.println("Iterative Berechnung ausgewählt.");
                System.out.println("Die Fakultät von " + number + " ist: " + factorialIterative(number));
            } else if (method == 2) {
                System.out.println("Rekursive Berechnung ausgewählt.");
                System.out.println("Die Fakultät von " + number + " ist: " + factorialRecursive(number));
            } else {
                System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 für iterativ oder 2 für rekursiv.");
            }
        }
        scanner.close();
    }

    // Iterative Methode zur Berechnung der Fakultät
    private static long factorialIterative(int number) {
        // Implementiere die iterative Logik hier
        return 0; // Dies ist ein Platzhalter, ersetze 0 durch deine Implementierung
    }

    // Rekursive Methode zur Berechnung der Fakultät
    private static long factorialRecursive(int number) {
        // Implementiere die rekursive Logik hier
        return 0; // Dies ist ein Platzhalter, ersetze 0 durch deine Implementierung
    }
}
