package de.uni_hannover.hci.aufgabe3;

import de.uni_hannover.hci.aufgabe3.model.*;

public class Debug {
  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    animals[0] = new Animal("Kangaroo Bob", 2, 2);
    animals[1] = new Dog("Barks");
    animals[2] = new Monkey("King Kong");
    for (int i = 0; i < animals.length; ++i) {
      System.out.println(animals[i]);
    }
  }
}

/*


##
Zeile 3: Die class Animal wurde nicht public gemacht; kann nicht von Debug.java datei zugegriffen werden.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/Dog.java:3:
error: Animal is not public in de.uni_hannover.hci.aufgabe3; cannot be accessed from outside package

*************
Die gesamte class wurde nicht üublic gemacht, somit konnte die Datei Debug.java die Inhalt der Animal.java Datei
nicht zugreifen. Damit der Kompiler wissen kann, was Animals ist und wo es gefunden werden soll sowie wann die Program ausgeführt werden sollte,
muss die class Animals zuerst public gemacht werden und dann kompilt werden.


##
Zeile 4, 5, 6: Die gegebene Variablen wurden private gemacht; kann nicht von Debug.java datei zugegriffen werden.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/Dog.java:12: error: name_ has private access in Animal
    return super.name_;
           ^
*************
Wenn globale Variablen private gemacht werden, können die Methode nur in diejenige Datei zugegriffen werden und in der Kompiler ausgeführt werden.
Somit müssen die gegebene Variablen public gemacht werden, damit der Kompiler kann wissen, wann und wo es in anderen Dateien ausgeführt werden sollte.


##
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


##
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
