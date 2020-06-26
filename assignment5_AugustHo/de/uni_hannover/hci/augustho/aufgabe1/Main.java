//August Ho
//Aufgabe 1

package de.uni_hannover.hci.augustho.aufgabe1;

import de.uni_hannover.hci.augustho.aufgabe1.model.*;

import java.util.Scanner;

/**
 * The main class creates an editable list or array stack type.
 *
 * @author         August Ho <august.ho@stud.uni-hannover.de>
 * @version        2020 June 11
 */
public class Main {
  public static void main(String[] args) {

    System.out.println("Which stack type should be used? <list, array>: ");
    Scanner scanner = new Scanner(System.in);
    String inputStackType = scanner.next();
    ISortableIntStack stack;

    if (inputStackType.equals("list")) {
      System.out.println("Selected stack type: [list]");
      stack = new ListHead(null);
    } else
    if (inputStackType.equals("array")) {
      System.out.println("Selected stack type: [array]");
      stack = new ArrayIntStack();
    } else {
      System.out.println("Error: Stack type 'list' and 'array' accepted only.");
      return;
    }

    System.out.println("\nPlease enter your command <push,pop,peek,print>: \nNote:  Use '-' to split. (E.g.: push-1)\npush:  pushes the given interger onto the Stack\npop:   removes the last give interger from Stack (from the top of the Stack)\npeek:  shows the the last given interger from Stack\nprint: prints the Stack");
    while(true) {
      System.out.println("\nPlease enter your command <push,pop,peek,print>: ");
      String start = scanner.next();
      String[] inputCommand = start.split("-");

      if(inputCommand[0].equals("push")) {
        stack.push(Integer.parseInt(inputCommand[1]));
        System.out.println("\nCommand: [push " + inputCommand[1] + "]");
        System.out.println("Pushed " + inputCommand[1]);
      }

      if(inputCommand[0].equals("pop")) {
        System.out.println("\nCommand: [pop]");
        System.out.println("Popped " + stack.pop());
      }

      if(inputCommand[0].equals("peek")) {
        System.out.println("\nCommand: [peek]");
        System.out.println("Peeked " + stack.peek());
      }

      if(inputCommand[0].equals("sort")) {
        stack.sort();
        System.out.println("\nCommand: [sort]");
        System.out.println("Sorted the Stack");
      }

      if(inputCommand[0].equals("print")) {
        System.out.println("\nCommand: [print]");
        System.out.println(stack.toString());
      }
    }
  }
}
