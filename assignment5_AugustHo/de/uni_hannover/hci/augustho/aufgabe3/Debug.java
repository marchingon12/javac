package de.uni_hannover.hci.aufgabe3;

import de.uni_hannover.hci.aufgabe3.model.*;


public class Debug {
  public static void main(String[] args) {

    IntBinTreeNode treeSorted = new SortedIntBinTreeNode(1, null, null);
    IntBinTreeNode treeUnsorted = new UnsortedIntBinTreeNode(1, null, null);
    int[] toInsert = { 4, 2, 6, 8, 0, 2, 1, 5, 1 };
    // for each i in toInsert
    for (int i : toInsert) {
      treeSorted.insert(i);
      treeUnsorted.insert(i);
    }
    System.out.println(treeSorted);
    System.out.println(treeUnsorted);
  }
}

/*

##1
Zeile 45 @SortedIntBinTreeNode.java: Die contains Methode wurde nicht geschrieben.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/SortedIntBinTreeNode.java:5: error: SortedIntBinTreeNode is not abstract and does not override abstract method contains(int) in IntBinTreeNode
public class SortedIntBinTreeNode extends IntBinTreeNode {
       ^
1 error
*************
Da die gesamte Methode fehlt, kann kein boolean Wert zurückgegeben werden. Somit kann auch Debug.java nicht weiter kompiliert werden.

##2
Zeile 10 @UnsortedIntBinTreeNode.java: Die Konstruktor Methode wurde nicht geschrieben.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/UnsortedIntBinTreeNode.java:7: error: constructor IntBinTreeNode in class IntBinTreeNode cannot be applied to given types;
public class UnsortedIntBinTreeNode extends IntBinTreeNode {
       ^
  required: int,IntBinTreeNode,IntBinTreeNode
  found: no arguments
  reason: actual and formal argument lists differ in length

*************
Da die gesamte Konstruktor Methode fehlt, können keine Werte benutzt werden. Somit kann auch Debug.java nicht weiter kompiliert werden.

##3
Zeile 8 @UnsortedIntBinTreeNode.java: In Zeile 27 wird eine Pointer zu rand gerichtet. Es wird null an den Pointer zurückgegeben.
*************
Exception in thread "main" java.lang.NullPointerException
        at de.uni_hannover.hci.aufgabe3.model.UnsortedIntBinTreeNode.insert(UnsortedIntBinTreeNode.java:25)
        at de.uni_hannover.hci.aufgabe3.Debug.main(Debug.java:15)

*************
Die Name "rand" wurde deklariert, enthält aber noch kein Wert. Java setzt diese aus default zu null, also wird der Pointer zu "nichts" gerichtet.
Declared variable with name "rand", but does not contain a primitive value yet. Java sets this to null by default, as it points to "nothing".


*/
