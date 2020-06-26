//August Ho

package de.uni_hannover.hci.augustho.aufgabe1.model;

/**
  * This class is to create a new datatype "ListNode", consisting of two conditions.
  * This class also contains getter and setter methods for the ListHead.java file, as well as two helper functions
  * for inserting extra nodes.
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

/**
  * This method sets nxt to a node starting with the given integer and ending with the next node (this.getNext()).
  * The method has a public so that it can accessed by Main.java, where the function is being put to use.
  *
  * @author          August Ho <august.ho@stud.uni-hannover.de>
  * @version         2020 May 08
  */
  public void insertAfter(int i) {
    ListNode newNode1 = this.getNext();
    ListNode newNode2 = new ListNode(i, newNode1);
    this.nxt = newNode2;
  }


/**
  * This method keeps looping until it reaches the end of the list (null) while setting the given node (node) to the next node (this.getNext()) with each loop.
  * The method has a public so that it can accessed by Main.java, where the function is being put to use.
  *
  * @author          August Ho <august.ho@stud.uni-hannover.de>
  * @version         2020 May 08
  */
  public void insertAfter(ListNode node) {
    this.setNext(node);

    for(ListNode newNode = node; newNode != null; newNode = newNode.getNext()) {  // keep looping until reached the end of the list (null)
      if(newNode.getNext() == null) {
        newNode.setNext(this.getNext());
        break;
      }
    }
  }
}
