package aufgabe3;

import aufgabe3.data.DebugData; // K1: ohne import ist nicht möglich die inhalt  im DebugData zugreifen zu können

public class DebugMain {
    public static void main(String[] args) {
        DebugData a = new DebugData(3.4, 5.6);
        DebugData b = new DebugData(1.0, 1.0);
        // Result should be approx. 5.18
        System.out.println(String.format("The distance between %s and %s is %g",
            a.str(), b.str(), a.distance(b)));
    }
}

/*
##Zeile 3: 'import' fehlt
Fehlermeldung:
aufgabe3/DebugMain.java:5: error: cannot find symbol
        DebugData a = new DebugData(3.4, 5.6);
        ^
  symbol:   class DebugData
  location: class DebugMain
Der Compiler wird nicht zugewiesen, den Inhalt von DebugData.java zuzugreifen.
Somit weiß der Kompiler nicht, was DebugData in DebugMain.java bedeutet.
*/
