package de.uni_hannover.hci.aufgabe3.model;

public class Monkey extends de.uni_hannover.hci.aufgabe3.Animal {

  public Monkey(String name) {
    super(name);
  }


  @Override
  public String getName() {
    return super.name_;
  }

  @Override
  public int getArms() {
    return 2;              // replaced 0 with 2; a monkey has two arms
  }

  @Override
  public int getLegs() {   // getLegs method made public
    return 2;              // replaced 0 with 2; a monkey has two legs
  }

  @Override
  public String toString() {
    return String.format("%s is a monkey with %d legs and %d arms.", this.getName(), this.getLegs(), this.getArms());
  }
}
// replaced "dog" wording to "monkey" as it is the most appropriate answer

/*

Zeile 21: getLegs wurde private gemacht; kann nicht von Debug.java datei zugegriffen werden.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/Monkey.java:21: error: getLegs() in Monkey cannot override getLegs() in Animal
  private int getLegs() {
              ^
  attempting to assign weaker access privileges; was public
*************
Wenn eine Methode private gemacht wird, kann dieser Methode nur in derjenige Datei zugegriffen werden und in der Kompiler ausgeführt werden.
Somit muss getLegs() public gemacht werden, damit der Kompiler wissen kann, wann und wo es in anderen Dateien ausgeführt werden sollte.

*/
