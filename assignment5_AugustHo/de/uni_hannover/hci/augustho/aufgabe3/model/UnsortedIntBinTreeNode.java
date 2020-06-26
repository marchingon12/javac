package de.uni_hannover.hci.aufgabe3.model;

import java.util.Random;

//Inserts randomly left or right. Needs to search through both subtrees, as
//there is no way of knowing where the node containing i might be.
public class UnsortedIntBinTreeNode extends IntBinTreeNode {
  private static Random rand = new Random(); //K3: NullPointerExecption; did not create a new variable assigned with type Random, thus returning null

  public UnsortedIntBinTreeNode(int content, UnsortedIntBinTreeNode left, UnsortedIntBinTreeNode right) {  //main method left out
    super(content, left, right);
    if ((left != null && left.content_ >= content) || (right != null && right.content_ <= content)) {
      System.err.println("Trying to create invalid sorted tree.");
      System.exit(2);
    }
  }
  //K2: UnsortedIntBinTreeNode method left out

  /**
   * Randomly inserts to left or right.
   * If left/right is not null, call insert on that child node.
   *
   * @param i Integer to insert.
   */
  @Override
  public void insert(int i) {
    if (UnsortedIntBinTreeNode.rand.nextBoolean()) {
      if (super.left_ == null)
        super.left_ = new UnsortedIntBinTreeNode(i, null, null);
      else
        super.left_.insert(i);
    } else {
      if (super.right_ == null)
        super.right_ = new UnsortedIntBinTreeNode(i, null, null);
      else
        super.right_.insert(i);
    }
  }

  /**
   * Looks if integer is in tree.
   * Looks through both subtrees, as they are not sorted.
   *
   * @param i Integer to search for.
   * @return  True if integer is in tree.
   */
  @Override
  public boolean contains(int i) {
    return super.content_ == i || (super.left_ != null && super.left_.contains(i)) || (super.right_ != null && super.right_.contains(i));
  }
}

/*

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
