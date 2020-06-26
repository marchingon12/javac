// August Ho
// Aufgabe 2

package de.uni_hannover.hci.augustho.aufgabe2.model;
/**
  * This abstract class contians methods to create a database for employees.
  *
  * @author         August Ho <august.ho@stud.uni-hannover.de>
  * @version        2020 June 12
  */
abstract public class Employee {

  //Each private variable is a categorie. Private since it is not called by other files.
  //It is used to store values at each specified attribute (firstname,surname...).

  private String firstname_;    //Firstname of an employee
  private String surname_;      //Surname of an employee
  private String ranking_;      //Rank of an employee
  private double salary_;       //Monthly salary of an employee
  private double offdays_;      //Accumulative annual leave of an employee (days per year)

  //Two constructor methods; the first is to save values into the variables.
  //The second is to initialise a random employee with specific attributes.

  public Employee(String firstname, String surname, String ranking, double salary, double offdays) {
    this.firstname_ = firstname;
    this.surname_ = surname;
    this.ranking_ = ranking;
    this.salary_ = salary;
    this.offdays_ = offdays;
  };

  public Employee() {
    this.firstname_="Max";
    this.surname_ = "Mustermann";
    this.ranking_ = "Guard";
    this.salary_ = 2.8;
    this.offdays_ = 0.5;
  };

  //Getter and Setter methods for each atttribute.


  //Getter & Setter for firstname_.
/**
  * Stores value to firstname_.
  * Value is a String containing the first name of the employee.
  *
  * @param  f_name  value of firstname_
  */
  public void setFirstname(String f_name) {
    this.firstname_ = f_name;
  }
/**
  * Returns the value from firstname_; the firstname of the employee.
  *
  * @return value of firstname_
  */
  public String getFirstname() {
    return this.firstname_;
  }


  //Getter & Setter for surname_.
/**
  * Stores value to surname_.
  * Value is a String containing the surname of the employee.
  *
  * @param s_name value of surname
  */
  public void setSurname(String s_name) {
    this.surname_ = s_name;
  }
/**
  * Returns the value from surname_; the surname of the employee.
  *
  * @return value of surname
  */
  public String getSurname() {
    return this.surname_;
  }


  //Getter & Setter for ranking_
/**
  * Stores value to ranking_.
  * Value is a String containing the surname of the employee.
  *
  * @param  rank  the new value of ranking
  */
  public void setRanking(String rank) {
    this.ranking_ = rank;
  }
/**
  * Returns the value from ranking_; the rank of the employee.
  *
  * @return value of ranking_
  */
  public String getRanking() {
    return this.ranking_;
  }


  //Getter & Setter for salary_.
/**
  * Stores value to salary_.
  * Value is a double datatype containing the salary amount of the employee.
  *
  * @param  sal  value of salary
  */
  public void setSalary(double sal) {
    this.salary_ = sal;
  }
/**
  * Returns the value from salary_; the salary amount of the employee.
  *
  * @return value of salary_
  */
  public abstract double getSalary();


  //Getter & Setter for offdays_.
/**
  * Stores value to offdays_.
  * Value is a double datatype containing the amount of offdays of the employee.
  *
  * @param  offday  value of offdays
  */
  public void setOffdays(double offday){
    this.offdays_ = offday;
  }
/**
  * Returns the value from offdays_; the amount of offdays of the employee.
  *
  * @return the value of offdays
  */
  public abstract double getOffdays();


/**
  *This method provides a String which represents an Employee
  * @return String of employee
  */
  public abstract String toString();
}
