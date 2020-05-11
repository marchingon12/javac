//August Ho
//Aufgabe 2

package aufgabe1.model;

import aufgabe1.model.ListNode;

  /**
    * This class contains different methods for a linked list.
    * The main purpose is to create a linked list and print it out in the terminal.
    *
    * @author         August Ho <august.ho@stud.uni-hannover.de>
    * @version        2020 May 08
    */

public class ListHead {
  /** A new ListNode for storing values */
  ListNode crrNode;

  /**
    * This method creates a new nodes for a complete list. The values are stored into each new node.
    *
    * @author         August Ho <august.ho@stud.uni-hannover.de>
    * @param   data   Interger array for storing the content of the list
    * @version        2020 May 08
    */
  public ListHead(int[] data){
    this.crrNode = new ListNode(data[0], null);
    ListNode newNode = this.crrNode;  // new Node

    for(int i = 1; i < data.length; i++) {
      this.crrNode.setNext(new ListNode(data[i], null));
      this.crrNode = this.crrNode.getNext();
    }
    this.crrNode = newNode;  // set current Node to new Node
  }

  /**
    * This method sets current Node (first Node) as the head of the list.
    *
    * @author         August Ho <august.ho@stud.uni-hannover.de>
    * @param   head   Sets the head of the list.
    * @version        2020 May 08
    */
  public ListHead(ListNode head) {
    this.crrNode = head;
  }

  /**
    * This method converts the linked list into a printable string format.
    * The method uses an empty String and adds the value of the node and using a
    * loop to get the next value of the next node.
    *
    * @author          August Ho <august.ho@stud.uni-hannover.de>
    * @version         2020 May 08
    */
  public String str() {
    String s = ""; // empty string
    int value = 0;
    ListNode node = this.crrNode;

    while(node != null) {
      value = node.getValue();
      s += "(" + value + ")" + "->";  // print brackets and co. into empty string
      node = node.getNext();
    }
    return "[listHead]" + s + "null";
  }
  /* The value is assinged between the brackets "('value')" and arrow pointers "->"
  * will be printed after each closed bracket. The string "null" is assigned at
  * the end of the string 's'.
  */

  // Bubblesort Algorithm
  // void sort(){
  //   for (int i = 0; i < arr.length; i++) {
  //     for (int j = i + 1; j < arr.length; j++) {
  //       int temp = 0;
  //       if (arr[i] > arr[j]) {
  //         temp = arr[i];
  //         arr[i] = arr[j];
  //         arr[j] = temp;
  //       }
  //     }
  //   }
  // }


  /**
    * This method uses the bubblesort method with alternations from the last assignment (see above).
    * The boolean "done" has been added as a switch to clarify if the list has been sorted or not.
    *
    * @author          August Ho <august.ho@stud.uni-hannover.de>
    * @version         2020 May 08
    */
  public void bubblesort() {
    boolean done = false;
    while (done == false) {
    done = true;
    //node sorts
      for(ListNode node = this.crrNode; node.getNext() != null; node = node.getNext()) {
        if(node.getValue() > node.getNext().getValue()){

          int digit1 = node.getValue();
          int digit2 = node.getNext().getValue();

          node.setValue(digit2);
          node.getNext().setValue(digit1);

          done = false;
        }
      }
    }
  }
  /* If the current value is larger than the value of the next node,
   * it should switch values by setting each other in their place. This should continue until
   * all values are in order and when the next node is null.
   */

  //sort using bubblesort method (see above)
  public void sort() {
    bubblesort();
  }

  public void insert(int index, int i) {
    int count = 0;
    for (ListNode newNode2 = this.crrNode; newNode2 != null; newNode2 = newNode2.getNext()) {
        if(count == index-1) {
          ListNode newNode1 = new ListNode(i, newNode2.getNext());
          newNode2.setNext(newNode1);
          break;
        }
        count++;
    }
  }


  public void insert(int index, ListNode node) {
    int count = 0;
    for (ListNode newNode2 = this.crrNode; newNode2 != null; newNode2 = newNode2.getNext()) {
        if(count == index-1) {
          node.setNext(newNode2.getNext());
          newNode2.setNext(node);
          break;
        }
        count++;
    }
  }
}
