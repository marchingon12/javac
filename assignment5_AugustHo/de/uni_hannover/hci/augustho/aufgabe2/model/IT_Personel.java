// August Ho
// Aufgabe 2

package de.uni_hannover.hci.augustho.aufgabe2.model;
/**
  * This class contians methods to create a database for employees that have the rank 'IT_Personel'.
  * Employee.java is extended to this file, IT_Personel.java has access to data in Employee.java.
  *
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 12
  */
public class IT_Personel extends Employee {
  //The private variable represents the worktime of the IT_Personel. Private since it is not called by other files.
  //It is used to store the worktime of the IT_Personel employee.

  private double weekhours;

  //Two constructor methods; the first is to save values into the variables.
  //The second is to initialise the given guard with specific attributes.

  public IT_Personel(String firstname, String surname, String ranking, double salary, double offdays) {
    //super keyword used for the Employee contructor in Employee.java,
    //Rank is not specified until User give input (JuniorDev/SeniorDev).
    super(firstname, surname, ranking, salary, offdays);
  };
  public IT_Personel() {
    //super keyword has access to the variables in Employee (parent) contructor,
    //transfers Employee data to IT_Personel. Initialise random weekhours.
    super();
    this.weekhours = 32;
  };

  //Getter and Setter methods for worktime of the employee.

/**
  * Stores value to weekhours.
  * Value contains the worktime in weekhours completed by employee.
  *
  * @param  worktime  value of weekhours
  */
  public void setWeekhours(double worktime) {
    this.weekhours = worktime;
  }
/**
  * Returns the value from weekhours; the worktime in weekhours completed.
  *
  * @return value of weekhourss
  */
  public double getWeekhours() {
    return this.weekhours;
  }

/**
  * Gets value from salary_. Ultimately adds amount earned by employee.
  * Value contains the salary earned by the employee according to weekhours.
  *
  * @return Salary end amount after adding.
  */
  public double getSalary() {
    double Salary = 0;
    if(this.getRanking().equals("SeniorDev")){
      Salary = Salary + getWeekhours()*4.5*32;
    } else {
      Salary = Salary + getWeekhours()*4.5*25;
    }
    return Salary;
  }

/**
  * Gets value from offdays_.
  * Since all IT_Personel have 24 offdays p.a., the anmount does not change according to weekhours.
  *
  * @return Offdays end amount (24 days)
  */
  public double getOffdays() {
    return 24;
  }

/**
  * This method creates a String designated to show data of the IT_Personel employee.
  * @return toPrint data of IT_Personel employee.
  */
  public String toString() {
    //initialise new empty String
    String toPrint = "";
    if (this.getRanking().equals("JuniorDev")) {
      toPrint = String.format("%s, %s (Junior Developer): Weekhours = %.0f; Monthly salary = %.2f EUR; %.0f offdays.",this.getSurname(),this.getFirstname(),this.getWeekhours(), this.getSalary(),this.getOffdays());
    } else if (this.getRanking().equals("SeniorDev")){
      toPrint = String.format("%s, %s (Senior Developer): Weekhours = %.0f; Monthly salary = %.2f EUR; %.0f offdays.",this.getSurname(),this.getFirstname(),this.getWeekhours(), this.getSalary(),this.getOffdays());
    } else {
      System.out.println("Err: Wrong input when selecting JuniorDev/SeniorDev. Try again.");
    }
    return toPrint;
  }
}
