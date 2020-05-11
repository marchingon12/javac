//August Ho
//Aufgabe 1

/*

# = check; - = uncheck
Checklist:
# create Main class.
- Main class should be within model package


*/

package aufgabe1;

import aufgabe1.model.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("### Aufgabe 1 ###");
        //aufgabe a
        System.out.println("//Aufgabe a");
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(1, 4);
        System.out.println(f1.str());
        System.out.println(f2.str());
        System.out.println(" ");

        //aufgabe b
        System.out.println("//Aufgabe b");
        Fraction f = new Fraction(3, 6);
        System.out.println(f.str());
        f.setNumerator(4);
        System.out.println(f.str());
        f.setValues(3, 9);
        System.out.println(f.str());
        System.out.println(" ");

        //aufgabe c
        System.out.println("//Aufgabe c");
        f1 = new Fraction(2, 4);
        f2 = new Fraction(1, 2);
        Fraction f3 = f1.add(f2);
        System.out.println(f3.str());
        System.out.println(" ");

        //aufgabe d
        System.out.println("//Aufgabe d");
        f1 = new Fraction(1, 2);
        f2 = new Fraction(2, 3);
        f3 = f1.multiply(f2);
        System.out.println(f3.str());
        System.out.println(" ");
    }
}
