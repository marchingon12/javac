package aufgabe3.data;

import java.lang.Math;

// This class is representing a cartesian coordinate in a 2d space with double coordinates.
public class DebugData {  // K2: public fehlt
    private double x;
    private double y;

    public DebugData(double x, double y) { //3
        this.x = x;
        this.y = y;
    }

    public double distance(DebugData other) {
        // = sqrt((this.x - other.y)^2 + (this.y - other.y)^2)
        return Math.pow(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2), -1); // K4: -1 fehlt
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public String str() {
        return String.format("(%g, %g)", this.x, this.y);
    }
}

//Fehlern
/*
##Zeile 6: public fehlt
Fehlermeldung:
aufgabe3/DebugMain.java:3: error: DebugData is not public in aufgabe3.data; cannot be accessed from outside package
import aufgabe3.data.DebugData;
                    ^
Da public fehlt, kann DebugData nicht von andere java dateien zugegriffen werden. Es ist nur in dem package
aufgabe3.data path.

##Zeile 10:inkompatible datentypen (von double zu int)
Fehlermeldung:
aufgabe3/DebugMain.java:7: error: incompatible types: possible lossy conversion from double to int
        DebugData a = new DebugData(3.4, 5.6);
                                    ^
aufgabe3/DebugMain.java:8: error: incompatible types: possible lossy conversion from double to int
        DebugData b = new DebugData(1.0, 1.0);
                                    ^
reason: actual and formal argument lists differ in length
Es ist nicht möglich den double zu int zu konvertieren, da die länge vom beiden datentypen unterschiedlich sind.
Dezimal zahlen können nicht zu einem int werden.


##Zeile 17: -1 fehlt für sqrt ( a to the power of -1 = squareroot of a)
./aufgabe3/data/DebugData.java:17: error: method pow in class Math cannot be applied to given types;
        return Math.pow(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
                   ^
  required: double,double
  found: double
Ohne -1 kann der Kompiler nicht weitermachen, da es noch ein double fehlt.

*/
