package de.uni_hannover.hci.aufgabe3.model;

public class Dog extends de.uni_hannover.hci.aufgabe3.Animal {

  public Dog(String name) {
    super(name);
  }


  @Override
  public String getName() {
    return super.name_;
  }

  @Override
  public int getArms() {
    return 0;
  }

  @Override
  public int getLegs() {  // getLegs method made public
    return 4;
  }

  @Override
  public String toString() {
    return String.format("%s is a dog with %d legs and %d arms.", this.getName(), this.getLegs(), this.getArms());
  }  //  switched places between this.getArms() with this.getLegs() so that String makes sense
}

/*

Zeile 21: getLegs wurde private gemacht; kann nicht von Debug.java datei zugegriffen werden.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/Dog.java:21: error: getLegs() in Dog cannot override getLegs() in Animal
  private int getLegs() {
              ^
  attempting to assign weaker access privileges; was public
*************
Wenn eine Methode private gemacht wird, kann dieser Methode nur in derjenige Datei zugegriffen werden und in der Kompiler ausgeführt werden.
Somit muss getLegs() public gemacht werden, damit der Kompiler wissen kann, wann und wo es in anderen Dateien ausgeführt werden sollte.

*/
