//August Ho
//Aufgabe 1

package de.uni_hannover.hci.augustho.aufgabe1.model;

/**
  * A public interface with functions for the stack.
  *
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 11
  */
  public interface ISortableIntStack {
  /**
    * This method pushes the given interger ontop of the stack.
    * The method is public so that it can accessed by Main.java, where the function is being put to use.
    * This method is called when used in the terminal.
    *
    * @param  int   i: input number
    */
    public void push(int i);

  /**
    * This method pops the interger which is ontop of the stack.
    * The method is public so that it can accessed by Main.java, where the function is being put to use.
    * This method is called when used in the terminal.
    *
    * @return  int  :The interger from top of the stack
    */
    public int pop();

  /**
    * This method copies and reutrns the interger ontop of the stack, but does not get removed from the stack.
    * The method is public so that it can accessed by Main.java, where the function is being put to use.
    * This method is called when used in the terminal.
    *
    * @return  int  :The interger from top of the stack
    */
    public int peek();

  /**
    * This method sorts a list to an ascending order.
    * THe list (stack) is not sorted unless this method is put to use.
    * The BubbleSort Algorithm is used in this method.
    * The method is public so that it can accessed by Main.java, where the function is being put to use.
    * The "sort()" method in the main function changes the data of the list.
    * This method is called when used in the terminal.
    *
    */
    public void sort();
}
