// August Ho
// Aufgabe 2

package de.uni_hannover.hci.augustho.aufgabe2;

import de.uni_hannover.hci.augustho.aufgabe2.model.*;

import java.util.Scanner;

/**
 * The main class creates an editable database for managing up to 15 employees.
 *
 * @author         August Ho <august.ho@stud.uni-hannover.de>
 * @version        2020 June 12
 */
 public class Main {
   public static void main(String args[]) {
     
     System.out.println("\n---------++++++++++++++++++++++++++++++++++++++---------");
     System.out.println("| UwU ~~ WELCOME TO EMPLOYEE MANAGEMENT DATABSE ~~ UwU |");
     System.out.println("---------++++++++++++++++++++++++++++++++++++++---------");
     System.out.println("\nThis is a mini management database programme meant for 15 employees.\nUse the commands below to add your employees! To exit, type 'exit' and Enter.");
     //size 15 for minimal size optimization, unneccesary if larger than 15
     Employee[] Rookies = new Employee[15];
     Scanner scanner = new Scanner(System.in);
     int count = 0;

     if (count > 15) {
       System.out.println("Too many Employees in database! Gonna crash...**boom** (hissing sounds)");
       System.exit(2);
     }

     while(count <= 15) {

      System.out.println("\nEnter command: <new_guard,new_it,new_manager,show_employees>");
      String input = scanner.next();

      if (input.equals("new_guard")) {

        System.out.println("\nCommand: [new_guard]\n");
        System.out.println("Adding new guard:");
        Guard SebasTheUndead = new Guard();

        System.out.println("Firstname:");
        String firstname = scanner.next();
        SebasTheUndead.setFirstname(firstname);

        System.out.println("Surname:");
        String surname = scanner.next();
        SebasTheUndead.setSurname(surname);

        System.out.println("**MAXIMUM SHIFTS is 8 HOURS!** \nNight shifts (per month):");
        int nightshift = scanner.nextInt();
        SebasTheUndead.setNightshift(nightshift);

        System.out.println("Early shifts (per month):");
        int earlyshift = scanner.nextInt();
        SebasTheUndead.setEarlyshift(earlyshift);

        System.out.println("Late shifts (per month):");
        int lateshift = scanner.nextInt();
        SebasTheUndead.setLateshift(lateshift);

        Rookies[count] = SebasTheUndead;
        System.out.println(String.format("Added %s, %s to company.", SebasTheUndead.getSurname(), SebasTheUndead.getFirstname()));
        count++;
      }

        if (input.equals("new_it")) {

          System.out.println("\nCommand: [new_it]\n");
          System.out.println("Adding a new IT-personel:");
          IT_Personel JimmyNeutron = new IT_Personel();

          System.out.println("Firstname:");
          String firstname = scanner.next();
          JimmyNeutron.setFirstname(firstname);

          System.out.println("Surname:");
          String surname = scanner.next();
          JimmyNeutron.setSurname(surname);

          System.out.println("Rank (JuniorDev or SeniorDev):");
          String ranking = scanner.next();
          JimmyNeutron.setRanking(ranking);

          System.out.println("Weekhours:");
          double weekhours = scanner.nextFloat();
          JimmyNeutron.setWeekhours(weekhours);

          Rookies[count] = JimmyNeutron;
          System.out.println(String.format("Added %s, %s to company.", JimmyNeutron.getSurname(), JimmyNeutron.getFirstname()));
          count++;
        }

        if (input.equals("new_manager")) {

          System.out.println("\nCommand: [new_it]\n");
          System.out.println("Adding new Manager:");

          Management LisaTheBoss = new Management();

          System.out.println("Firstname:");
          String firstname = scanner.next();
          LisaTheBoss.setFirstname(firstname);

          System.out.println("Surname:");
          String surname = scanner.next();
          LisaTheBoss.setSurname(surname);

          System.out.println("Rank (manager or ceo):");
          String ranking = scanner.next();
          LisaTheBoss.setRanking(ranking);

          System.out.println("Projects completed:");
          int project = scanner.nextInt();
          LisaTheBoss.setProject(project);

          Rookies[count] = LisaTheBoss;
          System.out.println(String.format("Added %s, %s to company.", LisaTheBoss.getSurname(), LisaTheBoss.getFirstname()));
          count++;
        }

        if (input.equals("show_employees")) {
          System.out.println("\nCommand: [show_employees]\n");
          for(int i = 0; i < count; i++){
            System.out.println(Rookies[i].toString());
          }
        }

        if (input.equals("exit")) {
          System.exit(2);
        }
      }
    }
  }
