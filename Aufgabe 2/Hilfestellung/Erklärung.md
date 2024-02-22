# Erklärung der Hilfestellung

Um den Code für den einfachen Taschenrechner mit Haupt- und Hilfsmethoden zu erstellen, habe ich einen systematischen Ansatz verfolgt, der die Grundanforderungen der Aufgabe berücksichtigt. Hier ist der Denkprozess, den ich durchlaufen habe:

1. **Programmstruktur und Benutzerinteraktion in `main`:**
   - Zu Beginn habe ich überlegt, wie die Interaktion mit dem Benutzer ablaufen sollte. Dazu gehört die Eingabe von zwei Zahlen und die Auswahl der gewünschten Operation. Hierfür ist der Einsatz eines `Scanner`-Objekts zur Erfassung von Konsoleneingaben notwendig.
   - Danach habe ich die Validierung der Benutzereingabe eingebaut, um insbesondere bei der Operation Auswahl sicherzustellen, dass nur gültige Operationen durchgeführt werden.

2. **Auswahl der Operation:**
   - Jede `if`-Anweisung korrespondiert mit einer der vier Grundoperationen, wobei eine zusätzliche Bedingung für ungültige Eingaben hinzugefügt wurde.

3. **Definition der Hilfsmethoden:**
   - Um den Code sauber zu halten, wird in `main` keine Berechnung durchgeführt.
   - Die vier Hilfsmethoden (`add`, `subtract`, `multiply`, `divide`) folgen dem Prinzip der Einzelverantwortung.
   - Bei der Definition dieser Methoden habe ich berücksichtigt, dass sie zwei `double`-Werte als Eingaben nehmen und das Ergebnis ihrer Operation als `double` zurückgeben sollten. Dies ermöglicht eine präzise Berechnung und ist flexibel genug für die meisten einfachen Rechenoperationen.

4. **Fehlerbehandlung für Division durch Null:**
   - In der `divide`-Methode wurde eine Fehlerbehandlung implementiert, da die Division durch Null eine Fehlerquelle ist. 
   - Ich habe vorgesehen, dass in dieser Methode eine Überprüfung stattfindet, um sicherzustellen, dass der zweite Operand (`num2`) nicht `0` ist, bevor die Division durchgeführt wird. 
   - In der tatsächlichen Implementierung würde dies eine Fehlermeldung oder eine alternative Vorgehensweise erfordern, falls `num2 == 0` ist.
