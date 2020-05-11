//August Ho
//Aufgabe 1

/*

# = check
Checklist:
- create Fraction class consisting of 2 int attributes,
numerator and denominator.
-
- denominator != 0





Losungshinweise:
Sie konnen die String.format()
Methode nutzen um den String auszugeben.
Mit dieser Methode konnen
Sie Attribute in Strings einfugen.
Ein Beispiel ware String.format("Your name is %s
and you are %d years old.", name, age).


*/

package aufgabe1.model;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        this.numerator = num;
        if (denom == 0) {
            System.out.println("Error: Not possible to devide by zero dimwit");
        } else {
            this.denominator = denom;
        }
        reduce();
    }


    // addition method
    public Fraction add(Fraction summand) {
        int a = this.getDenominator();
        this.extend(summand.getDenominator());
        summand.extend(a);
        int Zaehler = this.getNumerator() + summand.getNumerator();
        int Nenner = this.getDenominator();
        Fraction Summe = new Fraction(Zaehler, Nenner);
        return Summe;

    }

    // multiplication method
    public Fraction multiply(Fraction multiplicand) {
        Fraction result = new Fraction(1, 1);
        result.setValues(this.numerator * multiplicand.numerator, this.denominator * multiplicand.denominator);
        return result;
    }

    //return fraction in String format
    public String str() {
        return String.format("%d / %d", this.numerator, this.denominator);
    }

    //simplifying fractions using gcd algorithm
    private void reduce() {
        if (this.denominator < 0)
            this.extend(-1); // make stuff positive yo

        int n = this.numerator;
        int d = this.denominator;
        int temp;


        boolean isNegative = n < 0;
        if (isNegative)
            n *= -1;

        if (n > 0) {
            // n is bigger than 0, subtract bigger fram smaller number and repeat until d is zero
            while (d > 0) {
                if (d < n) {
                    n = n - d;
                } else {
                    d = d - n;
                }
            }
            temp = n;
            this.numerator /= n;
            this.denominator /= n;
        } else {
            // n is 0, devide fraction by d and get 0/1
            temp = d;
        }
        // this.numerator = this.getNumerator() / temp;
        // this.denominator = this.getDenominator() / temp;
    }

    //return numerator
    public int getNumerator() {
        return this.numerator;
    }

    //set numerator
    public void setNumerator(int num) {
        this.numerator = num;
        this.reduce();
    }

    //return denominator
    public int getDenominator() {
        return this.denominator;
    }

    //set denominator
    public void setDenominator(int denom) {
        this.denominator = denom;
        this.reduce();
    }

    //set numerator and denominator
    public void setValues(int num, int denom) {
        this.numerator = num;
        this.denominator = denom;
        this.reduce();
    }

    // multiplies both num and denom with amount given
    private void extend(int amount) {
        this.numerator = this.numerator * amount;
        this.denominator = this.denominator * amount;
    }
}
