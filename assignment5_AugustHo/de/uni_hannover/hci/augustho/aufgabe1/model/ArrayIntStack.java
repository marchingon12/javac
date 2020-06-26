//August Ho
//Aufgabe 1

/*
The stack has no size limit, but arrays have a fixed size in Java.
To counter this, the focus point is to keep the length of the array in check.
*/

package de.uni_hannover.hci.augustho.aufgabe1.model;

/**
  * This public class contians methods for the Interger array stack in form of a single-linked list.
  *
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 11
  */
public class ArrayIntStack implements ISortableIntStack {
  // integer array
  private int[] array;
  // pointer for the stack
  private int pointer;

/**
  * The contructor method creates an array stack from the given array (data).
  * The pointer is set to the first element of the array.
  * @param  data  Integer arrays to put in stack.
  */
  public ArrayIntStack(int[] data) {
    this.array = data;
    this.pointer = this.array.length-1;
  }

  public ArrayIntStack() {
    this.array = new int[0]; //initialise  a new interger array, size does not matter
    this.pointer = 0;
  }

/**
  * This method inserts the given number ontop of the stack.
  * @param   int  i: input number
  */
  public void push(int i) {
    int[] top = new int[this.array.length+1];
    for (int count = 1; count < this.array.length+1; count++) {
      top[count] = this.array[count-1];
    }

    top[0] = i;
    this.array = top;
    this.pointer = top.length-1;
  }

/**
  * This method removes the number ontop of the stack.
  * It is called in the main-fuction and usefull to the User to edit her/his list. Therefore it is public.
  * @return int on Top of the stack
  */
  public int pop() {
    int[] top = new int[this.array.length-1];

    for (int count = 0; count < this.array.length-1; count++) {
      top[count] = this.array[count+1];
    }

    int selected = this.array[0];
    this.array = top;
    this.pointer = top.length-1;
    return selected;
  }

/**
  * This method copies and reutrns the interger ontop of the stack, but does not get removed from the stack.
  * The method is public so that it can accessed by Main.java, where the function is being put to use.
  * @return int on Top of the stack
  */
  public int peek() {
    int selected = this.array[this.pointer];
    return selected;
  }

/**
  * This method is an altered  version of the Bubblesort method used in Assignment 3.
  * The method is public so that it can accessed by Main.java, where the function is being put to use.
  */
  public void sort() {
    boolean done = false;
    while (done == false) {
    done = true;
    //node sorts
      for(int count = 0; count < this.array.length -1; count++) {
        if(this.array[count] > this.array[count+1]){

          int digit1 = this.array[count];
          int digit2 = this.array[count+1];

          this.array[count+1] = digit1;
          this.array[count] = digit2;

          done = false;
        }
      }
    }
  }

/**
  * This method converts the array Stack into String format.
  * The toString() method is called in the main fuction, thus made public so that it can accessed by Main.java.
  */
  public String toString() {
    String toPrint = "<TopOfStack>\n";
    for (int count = 0; count < this.array.length; count++) {
      toPrint = toPrint + String.format("%d\n", this.array[count]);
    }
    toPrint += "<BottomOfStack>";
    return toPrint;
  }
}
