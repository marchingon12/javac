package de.uni_hannover.hci.aufgabe3;

public class Animal {       // class Animal made public
  public String name_;      // String name_ made public
  public int legs_;         // integer legs_ made public
  public int arms_;         // integer arms_ made public


  Animal(String name, int legs, int arms) {
    this.name_ = name;
    this.legs_ = legs;
    this.arms_ = arms;
  }

  public Animal(String name) {
    this(name, 0, 0);
  }


  public String getName() {
    return this.name_;
  }

  public int getArms() {
    return this.arms_;
  }

  public int getLegs() {
    return this.legs_;
  }

  @Override
  public String toString() {
    return String.format("%s is an animal with %d legs and %d arms.", this.getName(), this.getLegs(), this.getArms());
  }
}

/*

Zeile 3: Die class Animal wurde nicht public gemacht; kann nicht von Debug.java datei zugegriffen werden.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/Dog.java:3:
error: Animal is not public in de.uni_hannover.hci.aufgabe3; cannot be accessed from outside package

*************
Die gesamte class wurde nicht üublic gemacht, somit konnte die Datei Debug.java die Inhalt der Animal.java Datei
nicht zugreifen. Damit der Kompiler wissen kann, was Animals ist und wo es gefunden werden soll sowie wann die Program ausgeführt werden sollte,
muss die class Animals zuerst public gemacht werden und dann kompilt werden.



Zeile 4, 5, 6: Die gegebene Variablen wurden private gemacht; kann nicht von Debug.java datei zugegriffen werden.
Fehlermeldung:
*************
./de/uni_hannover/hci/aufgabe3/model/Dog.java:12: error: name_ has private access in Animal
    return super.name_;
           ^
*************
Wenn globale Variablen private gemacht werden, können die Methode nur in diejenige Datei zugegriffen werden und in der Kompiler ausgeführt werden.
Somit müssen die gegebene Variablen public gemacht werden, damit der Kompiler kann wissen, wann und wo es in anderen Dateien ausgeführt werden sollte.




*/
