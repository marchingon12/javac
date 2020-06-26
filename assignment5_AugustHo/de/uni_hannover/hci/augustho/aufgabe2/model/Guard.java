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
public class Guard extends Employee {
  //Each private variable represents the shifts of the guard. Private since it is not called by other files.
  //It is used to store values .
  //Each shift lasts 8 hours. --> implement max 8 hours worktime?

  private int nightshift;
  private int earlyshift;
  private int lateshift;

  //Two constructor methods; the first is to save values into the variables.
  //The second is to initialise the given guard with specific attributes.

  public Guard(String firstname, String surname, double salary, double offdays) {
    //super keyword used for the Employee contructor in Employee.java,
    //Rank is Guard  since this is the Guard profile.
    super(firstname, surname, "Guard", salary, offdays);
  };

  public Guard() {
    //super keyword has access to the variables in Employee (parent) contructor,
    //transfers Employee data to Guard, Ranking attribute from Employee will be overwritten with Guard
    //setting shifts for the Guards profile.
    super();
    setRanking("Guard");
    setNightshift(2); //random
    setEarlyshift(4); //random
    setLateshift(6);  //random
  };

  //Getter and Setter methods for each shift.

  //Getter & Setter for nightshift.
/**
  * Stores value to nightshift.
  * Value contains the shift hours that have been completed.
  *
  * @param  night  value of nightshift
  */
  public void setNightshift(int night) {
    if (night>8) {
      System.out.println("***WARNING*** Err: Maximum shifts are 8 hours! Please try again.");
      System.exit(2);
    } else {
    this.nightshift = night;
    }
  }
/**
  * Returns the value from nightshift; the shift hours completed.
  *
  * @return value of nightshift
  */
  public int getNightshift() {
    return this.nightshift;
  }


  //Getter & Setter for earlyshift.
/**
  * Stores value to earlyshift.
  * Value contains the shift hours that have been completed.
  *
  * @param  early  value of earlyshift
  */
  public void setEarlyshift(int early) {
    if (early>8) {
      System.out.println("***WARNING*** Err: Maximum shifts are 8 hours! Please try again.");
      System.exit(2);
    } else {
    this.earlyshift = early;
    }
  }
/**
  * Returns the value from earlyshift; the shift hours been completed.
  *
  * @return value of earlyshift
  */
  public int getEarlyshift() {
    return this.earlyshift;
  }


  //Getter & Setter for lateshift.
/**
  * Stores value to lateshift.
  * Value contains the shift hours that have been completed.
  *
  * @param  late  value of lateshift
  */
  public void setLateshift(int late) {
    if (late>8) {
      System.out.println("***WARNING*** Err: Maximum shifts are 8 hours! Please try again.");
      System.exit(2);
    } else {
    this.lateshift = late;
    }
  }
/**
  * Returns the value from lateshift; the shift hours been completed.
  *
  * @return value of lateshift
  */
  public int getLateshift() {
    return this.lateshift;
  }


/**
  * Gets value from salary_. Ultimately adds amount earned by employee.
  * Value contains the salary earned by the employee according to shift hours and shift time (night,early,late)
  *
  * @return Salary end amount after adding.
  */
  public double getSalary() {
    //initialise Salary with no amount (not earning anything yet)
    double Salary = 0;
    //earlyshift guards earns 100 Euros after each day
    Salary = Salary + getEarlyshift()*100;
    //earlyshift guards earns 100 Euros after each day
    Salary = Salary + getLateshift()*100;
    //earlyshift guards earns 160 Euros after each day
    Salary = Salary + getNightshift()*160;
    return Salary;
  }

/**
  * Gets value from offdays_. Ultimately adds amount earned by employee.
  * Value contains the offdays earned by the employee according to shift hours and shift time (night,early,late)
  *
  * @return Offdays end amount after adding.
  */
  public double getOffdays() {
    //each Guard starts with 20 offdays
    double Offdays = 20;
    //earlyshift guards earns 1/4 offdays per day
    Offdays = Offdays + getEarlyshift()*0.25;
    //latshift guards earns 1/4 offdays per day
    Offdays = Offdays + getLateshift()*0.25;
    //nightshift guards earns 1/2 offdays per day
    Offdays = Offdays + getNightshift()*0.5;
    return Offdays;
  }

  /**
  * This method creates a String designated to show data of the Guard employee.
  * @return toPrint data of Guard employee.
  */
  public String toString() {
    //initialise new empty String
    String toPrint = "";
    toPrint = String.format("%s, %s (Guard): Shifts %d/%d/%d; Monthly salary = %.2f EUR; %.0f offdays.", this.getSurname(),this.getFirstname(),this.getNightshift(),this.getEarlyshift(),this.getLateshift(), this.getSalary(),this.getOffdays());
    return toPrint;
    }
  }
