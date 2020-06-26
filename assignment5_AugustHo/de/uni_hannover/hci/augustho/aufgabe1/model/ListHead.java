//August Ho
//Aufgabe 1

package de.uni_hannover.hci.augustho.aufgabe1.model;
/**
* This class contains different methods for a linked list.
* The main purpose is to create a linked list and print it out in the terminal.
*
* @author         August Ho <august.ho@stud.uni-hannover.de>
* @version        2020 June 11
*/
public class ListHead implements ISortableIntStack {
  /** A new ListNode for storing values; private so that the value is not modifiable, other methods need to use this variable */
  private ListNode listHead_;
  /**
  * This Constructor sets the member variable listHead_ to the given ListNode.
  * The Constructor is important to buil a new ListHead. Therefore it is usefull for the User and set public.
  * @author   Patric Plattner <patric.plattner@hci.uni-hannover.de>
  * @param ListNode List to set the ListHead to
  */
  public ListHead(ListNode head) {
      this.listHead_ = head;
  }

  /**
  * This Method converts a list into a String.
  * The str()-method is called in the main fuction and just reads the list. It should be public.
  * @author   Patric Plattner <patric.plattner@hci.uni-hannover.de>
  */
  public String str() {
      String result = "";
      for (ListNode walk = this.listHead_; walk != null; walk = walk.getNext()) {
          result += String.format("(%d)->", walk.getValue());
      }
      result += "null";
      return result;
  }

  public String toString(){
    String toPrint = "<TopOfStack>\n";
    for (ListNode walk = this.listHead_; walk != null; walk = walk.getNext()) {
        toPrint += String.format("%d\n", walk.getValue());
    }
    toPrint += "<BottomOfStack>";
    return toPrint;
  }

  /**
  * This Method sorts a list in ascending order.
  * This Method uses the bubblesort algorithm in a way to complicated way.
  * The sort()-method is called in the main fuction but it changes the data. It should be public because the User might need it.
  * @author  Patric Plattner <patric.plattner@hci.uni-hannover.de>
  */
  public void sort() {
      if (this.listHead_ != null && this.listHead_.getNext() != null) {
          boolean sorted = false;
          while(!sorted){
              sorted = true;
              // edge case: first two elements are out of order => list head variable has to be updated
              if (this.listHead_.getValue() > this.listHead_.getNext().getValue()) {
                  //swapping first two elements. Assume [this.listHead_]->(a)->(b)->(c)->

                  //saving relevant references
                  ListNode a = this.listHead_;
                  ListNode b = this.listHead_.getNext();
                  ListNode c = this.listHead_.getNext().getNext();
                  //you can do this without saving these references, however it is more complicated ;)

                  b.setNext(a);
                  // list now [this.listHead_]->(a)->(b)  (c)->
                  //                             ^    |
                  //                             +----+

                  a.setNext(c);
                  // list now [this.listHead_]->(b)<-(a)  (c)->
                  //                             |         ^
                  //                             +---------+

                  this.listHead_ = b;
                  // list now [this.listHead_]->(b)->(a)->(c)->
                  // done

                  sorted = false;
              }

              //creating variables of relevant list nodes
              ListNode a = this.listHead_;
              ListNode b  = this.listHead_.getNext();
              ListNode c = this.listHead_.getNext().getNext();
              //iterating over list
              while(c != null) {
                  if (b.getValue() > c.getValue()) {
                      //swapping elements cur and next in list ...->(a)->(b)->(c)->tmp
                      //saving reference to tmp
                      ListNode tmp = c.getNext();

                      c.setNext(b);
                      // list now ...->(a)->(b)->(c)  tmp
                      //                     ^    |
                      //                     +----+

                      b.setNext(tmp);
                      // list now ...->(a)  (c)->(b)->tmp
                      //                |         ^
                      //                +---------+

                      a.setNext(c);
                      // list now ...->(a)->(c)->(b)-> tmp
                      // done

                      sorted = false;
                  }
                  a = b;
                  b = c;
                  c = c.getNext();
              }
          }
      }
  }



/**
  * This method pushes the given interger ontop of the stack.
  * The method is public so that it can accessed by Main.java, where the function is being put to use.
  *
  * @param  int   i: input number
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 11
  */
  public void push(int i){
    this.listHead_ = new ListNode(Math.abs(i), this.listHead_);
  }

/**
  * This method pops the interger which is ontop of the stack.
  * The method is public so that it can accessed by Main.java, where the function is being put to use.
  *
  * @return  int  :The interger from top of the stack
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 11
  */
  public int pop(){
      int selected = this.listHead_.getValue();
      this.listHead_= this.listHead_.getNext();
      return selected;
  }

/**
  * This method copies and reutrns the interger ontop of the stack, but does not get removed from the stack.
  * The method is public so that it can accessed by Main.java, where the function is being put to use.
  *
  * @return  int  :The interger from top of the stack
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 11
  */
  public int peek(){
      int selected = this.listHead_.getValue();
      return selected;
  }
}
