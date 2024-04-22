import java.util.Scanner;

public class Waehrungsumrechner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println(" Willkommen beim Währungsumrechner <3 ");
        System.out.println("\n| --------------------------------------------------- |\n| Das sind die Wechselkurse:  1€ = 1.09$ (EUR -> USD) |");
        System.out.println("|                             1$ = 0,92€ (USD -> EUR) |");
        System.out.println("|                             1£ = 1,17€ (GPT -> EUR) |\n| --------------------------------------------------- |\n");

        boolean validInput = false;

        while(!validInput) {
            System.out.println(" Bitte Betrag eingeben: ");
            double input = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Bitte Ausgangswährung eingeben (USD, EUR, GBP): ");
            String startCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Bitte Zielwährung eingeben (USD, EUR, GBP): ");
            String endCurrency = scanner.nextLine().toUpperCase();

            final double USD_TO_EUR = 0.93;
            final double EUR_TO_USD = 1.07;
            final double GBP_TO_USD = 1.25;
            final double USD_TO_GBP = 0.80;
            final double EUR_TO_GPT = 0.86;
            final double GPT_TO_EUR = 1.17;

            if(input < 0) {
                System.out.println("Einagbe ungültig");
            }else {
                double result = 0;
                if (startCurrency.equals("EUR")) {
                    if (endCurrency.equals("USD")) {  //Eur/USD
                        result = input *  EUR_TO_USD;
                    } else if (endCurrency.equals("GBP")) { //Eur/GPT
                        result = input * EUR_TO_GPT ;
                    }
                } else if (startCurrency.equals("USD")) {
                    if (endCurrency.equals("EUR")) {    //USD/Eur
                        result = input *  USD_TO_EUR;
                    } else if (endCurrency.equals("GBP")) { //USD/GPT
                        result = input * USD_TO_GBP;

                    }
                } else if (startCurrency.equals("GBP")) {
                    if (endCurrency.equals("EUR")){     //GPT/Eur
                        result = input * GPT_TO_EUR;
                    } else if (endCurrency.equals("USD")) { //GPT/USD
                        result = input * GBP_TO_USD;;
                    }
                } else {
                    System.out.println("Eingabe ungültig.");
                }
                System.out.println("Das Ergebnis ist: " + result + " " + endCurrency);
                validInput = true;
            }
            System.out.println(" * M E N UE *");
            System.out.println(" 1. Neue Umrechung");
            System.out.println(" 2. Programm beenden");

            int auswahl =  scanner.nextInt();

            if (auswahl == 1) {
                System.out.println(" Sie haben sich für eine neue Umrechnung entschieden. ");
                validInput = false;
            } else if (auswahl == 2) {
                System.out.println("Das Programm wird beendet.");
                break;
            } else {
                System.out.println("Ihre Auswahl ist im Menü nicht vorhanden.");
            }
        }

        scanner.close();
    }
}