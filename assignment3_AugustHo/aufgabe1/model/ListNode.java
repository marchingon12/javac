//August Ho
//Aufgabe 2

package aufgabe1.model;

/**
  * This class is to create a new datatype "ListNode", consisting of two conditions.
  * This class also contains getter and setter methods for the ListHead.java file.
  *
  * @author          August Ho <august.ho@stud.uni-hannover.de>
  * @version         2020 May 08
  */
public class ListNode {
  /** storage for values */
  int wert;
  /** storage for next Nodes*/
  ListNode nxt;

  /**
    * This method puts the values given from main to work.
    *
    * @author         August Ho <august.ho@stud.uni-hannover.de>
    * @param   next   Assigns given next ListNode to nxt.
    * @param   value  Assigns given value to wert.
    * @version        2020 May 08
    */
  public ListNode(int value,ListNode next) {
    nxt = next;
    wert = value;
  }
/**
  * Getter for wert (value).
  * @returns wert.
  */
  public int getValue() {
    return wert;
  }
  /**
    * Getter for nxt (next).
    * @returns nxt.
    */
  public ListNode getNext() {
    return nxt;
    }
    /**
      * Setter for element (content of value).
      *
      */
  public void setValue(int element) {
    this.wert = element;
  }
  /**
    * Setter for number (next).
    *
    */
  public void setNext(ListNode number) {
    this.nxt = number;
  }

  void insertAfter(int i) {
    ListNode newNode1 = this.getNext();
    ListNode newNode2 = new ListNode(i, newNode1);
    this.nxt = newNode2;
  }

  void insertAfter(ListNode node) {
    this.setNext(node);

    for(ListNode newNode = node; newNode != null; newNode = newNode.getNext()) {
      if(newNode.getNext() == null) {
        newNode.setNext(this.getNext());
        break;
      }
    }
  }


}
