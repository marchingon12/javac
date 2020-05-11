//August Ho
//Aufgabe 2

/*
** Diese soll ein 10x10 Felder
   großes PlayingFieldTile[][] Array haben,

** Konstruktor schreiben, der keine Eingaben entgegennimmt,
   und ein leeres 10x10 Spielfeld generiert.

**
*/

public class PlayingField {
private int x, y;



  void Ground() {
    int[][] fieldarr = new filedarr[10][10];
  }

  public int[][] getCoordinates(){
    return Coordinates[x][y];
  }

  public void setCoordinates(int x, int y) {
    Coordinates[][] = new Coordinates[x][y];
  }


  PlayingField(PlayingFieldTile[][] field){
    if (PlayingFieldTile[][] != [10][10]) {
      System.exit(1);
    }
  }

  boolean canWalk(int x, int y) {
    if () {
      if (x == this.x && y == this.y) {
        return true;
      } else {
        return false;
      }
    }
  }





  String str() {
    String result = "";
    for (int walk = x; walk != x.length; walk = walk.getNext()) {
        result += String.format("[%d]", walk.getValue());
    }
    result += "null";
    return result;
  }


  boolean playerCanWalk() {
    return true;
  }

  boolean playerWalk() {
    return true;
  }

  boolean playerTurnRight() {
    return true;
  }

  boolean playerTurnLeft() {
    return true;
  }




}
