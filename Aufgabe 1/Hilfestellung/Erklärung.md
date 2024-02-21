# Erklärung der Hilfestellung

1. **Programmstruktur und Benutzerinteraktion**:
    - Zuerst habe ich die grundlegende Struktur des Programms mit einer `main`-Methode definiert, die den Einstiegspunkt für Java-Anwendungen darstellt.
    - Dann habe ich einen `Scanner` hinzugefügt, um Benutzereingaben über die Konsole zu ermöglichen, und den Benutzer aufgefordert, eine Zahl einzugeben.

2. **Eingabevalidierung**:
    - Um sicherzustellen, dass keine negativen Zahlen eingegeben werden, habe ich eine `if`-Anweisung hinzugefügt, die prüft, ob die eingegebene Zahl kleiner als 0 ist. Falls ja, gibt das Programm eine Fehlermeldung aus und beendet sich, anstatt fortzufahren.

3. **Auswahl der Berechnungsmethode**:
    - Nach der Validierung der Eingabe habe ich den Benutzer aufgefordert, die Methode zur Berechnung der Fakultät zu wählen (iterativ oder rekursiv). Hierfür habe ich erneut eine Benutzereingabe angefordert.
    - Dabei habe ich `if`- und `else if`-Blöcke verwendet, um auf die Benutzereingabe zu reagieren: `1` für die iterative Methode, `2` für die rekursive Methode, und eine Fehlermeldung für jede andere Eingabe.

4. **Platzhalter für Berechnungsmethoden**:
    - Ich habe zwei Hilfsmethoden `factorialIterative` und `factorialRecursive` mit Platzhaltern hinzugefügt. Diese Methoden sind vorgesehen, um die Fakultät einer Zahl iterativ bzw. rekursiv zu berechnen, wobei die eigentliche Implementierungslogik noch fehlt.

5. **Ausgabe**:
    - Basierend auf der Auswahl des Benutzers ruft das Programm die entsprechende Methode auf und gibt das Ergebnis (vorerst als Platzhalter) aus.
