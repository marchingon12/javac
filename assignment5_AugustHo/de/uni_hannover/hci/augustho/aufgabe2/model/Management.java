// August Ho
// Aufgabe 2

package de.uni_hannover.hci.augustho.aufgabe2.model;
/**
  * This class contians methods to create a database for employees that have the rank 'Guard'.
  * Employee.java is extended to this file, Guard.java has access to data in Employee.java.
  *
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 12
  */
public class Management extends Employee {
  //The private variable represents the worktime of the IT_Personel. Private since it is not called by other files.
  //It is used to store the worktime of the IT_Personel employee.

    private int project;

  //Two constructor methods; the first is to save values into the variables.
  //The second is to initialise the given guard with specific attributes.

  public Management (String firstname, String lastname, String ranking, double salary, double offdays) {
    //super keyword used for the Employee contructor in Employee.java,
    //Rank is not specified until User give input (JuniorDev/SeniorDev).
    super(firstname, lastname, ranking, salary, offdays);
  };

  public Management () {
    //super keyword has access to the variables in Employee (parent) contructor,
    //transfers Employee data to IT_Personel. Initialise random weekhours.
    super();
    this.project = 5; //random
  };

  //Getter and Setter methods for projects done by the employee.

/**
  * Stores value to project.
  * Value contains the amount of projects completed by employee.
  *
  * @param  draft  value of weekhours
  */
  public void setProject(int draft) {
      this.project = draft;
  }
/**
  * Returns the value from project; the number of projects comleted.
  *
  * @return value of project
  */
  public int getProject() {
    return this.project;
  }

/**
  * Gets value from salary_. Ultimately adds amount earned by employee.
  * Value contains the salary earned by the employee according to projects completed.
  *
  * @return Salary end amount after adding.
  */
  public double getSalary() {
    //initialise Salary
    double Salary = 0;
    if (this.getRanking().equals("ceo")) {
      //the CEO earns 10,000 Euros per month
      Salary = 10000;
      //for every project completed, the manager will receive a pay rise of 10%.
      double money = 1 + (0.1*getProject());
      Salary = Salary * money;
    } else {
      //the project manager earns 8000 Euros per month
      Salary = 8000;
      //for every project completed, the manager will receive a pay rise of 10%.
      double money = 1 + (0.1*getProject());
      Salary = Salary * money;
    }
    return Salary;
  }

/**
  * Gets value from offdays_.
  * A project manager starts with 20 offdays and earns 2 offdays per completed project.
  *
  * @return Offdays end amount
  */
  public double getOffdays() {
    return 20 + (2*getProject());
  }


/**
  * This method creates a String designated to show data of the project manager employee / CEO.
  * @return toPrint data of Project manager employee / CEO.
  */
  public String toString(){
    String toPrint = "";
    if (this.getRanking().equals("ceo")) {
      toPrint = String.format("%s, %s (CEO): Projects = %d; Monthly salary = %.2f EUR; %.2f offdays.",this.getSurname(),this.getFirstname(),this.getProject(), this.getSalary(),this.getOffdays() );
    } else if (this.getRanking().equals("manager")) {
      toPrint = String.format("%s, %s (Project Manager): Projects = %d; Monthly salary = %.2f EUR; %.2f offdays.",this.getSurname(),this.getFirstname(),this.getProject(), this.getSalary(),this.getOffdays() );
    } else {
      System.out.println("Err: Wrong input when selecting ceo/manager. Try again.");
    }
    return toPrint;
  }
}
