import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3]; // 2D-Array für das Spielbrett
        initializeBoard(board); // Initialisiert das Spielbrett mit leeren Zellen

        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'X'; // X beginnt das Spiel

        // Eine Schleife, um das Spiel fortzusetzen, bis ein Gewinner feststeht oder ein Unentschieden erreicht ist
        boolean gameEnded = false;
        while (!gameEnded) {
            printBoard(board); // Zeigt das aktuelle Spielbrett an
            // Benutzereingaben für Reihe und Spalte, Validierung der Eingaben
            // Aktualisierung des Spielbretts basierend auf der Benutzereingabe

            // Überprüfung des Spielstands: Gewinn oder Unentschieden
            // Wenn das Spiel beendet ist, setze gameEnded auf true und zeige das Ergebnis an

            // Spielerwechsel
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    // Initialisiert das Spielbrett mit leeren Zellen
    private static void initializeBoard(char[][] board) {
        // Fülle das Spielbrett mit Leerzeichen oder einem anderen leeren Zeichen
    }

    // Druckt das aktuelle Spielbrett in der Konsole
    private static void printBoard(char[][] board) {
        // Durchlaufe das 2D-Array und drucke jede Zelle zusammen mit Trennzeichen
    }

    // Überprüft, ob ein Spieler gewonnen hat
    private static boolean checkForWin(char[][] board) {
        // Überprüfe alle Gewinnbedingungen (Reihen, Spalten, Diagonalen)
        return false; // Dies ist ein Platzhalter
    }

    // Überprüft, ob ein Unentschieden vorliegt
    private static boolean checkForDraw(char[][] board) {
        // Überprüfe, ob alle Zellen gefüllt sind und kein Gewinner feststeht
        return false; // Dies ist ein Platzhalter
    }
}
