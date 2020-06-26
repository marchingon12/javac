package de.uni_hannover.hci.aufgabe3.model;

//Inserts integers in a sorted way. Only needs to search in one subtree as a
//result.
public class SortedIntBinTreeNode extends IntBinTreeNode {

  public SortedIntBinTreeNode(int content, SortedIntBinTreeNode left, SortedIntBinTreeNode right) {
    super(content, left, right);
    if ((left != null && left.content_ >= content) || (right != null && right.content_ <= content)) {
      System.err.println("Trying to create invalid sorted tree.");
      System.exit(2);
    }
  }

  /**
   * Inserts integer into the sorted tree.
   * Smaller Integers will be placed into the left subtree, larger ones into
   * the right subtree. Equal ones will be ignored
   *
   * @param i Integer to insert.
   */
  @Override
  public void insert(int i) {
    if (i < super.content_) {
      if (super.left_ == null)
        super.left_ = new SortedIntBinTreeNode(i, null, null);
      else
        super.left_.insert(i);
    } else if (i > super.content_) {
      if (super.right_ == null)
        super.right_ = new SortedIntBinTreeNode(i, null, null);
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
  //K1: contains method left out
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

*/
