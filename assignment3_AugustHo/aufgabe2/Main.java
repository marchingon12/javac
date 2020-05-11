public static void main(String[] args) {


    // Aufgabe a
    PlayingFieldTile[][] newgame = new PlayingFieldTile[5][2];
    PlayingField p1 = new PlayingField(arr, 2, 3, Direction.NORTH);
    System.out.println(p1.str());

    p1.setField(1, 0, PlayingFieldTile.TREE);
    p1.setField(2, 3, PlayingFieldTile.TREE);
    p1.setField(5, 7, PlayingFieldTile.TREE);
    p1.setField(8, 8, PlayingFieldTile.TREE);
    p1.setField(9, 0, PlayingFieldTile.TREE);
    System.out.println(p1.str());

    // Aufgabe b
    p1.setBlick(Direction.EAST);
    p1.setPosI(4);
    p1.setPosJ(5);

    p1.playerWalk();
    System.out.println(p1.str());
    p1.playerTurnRight();
    System.out.println(p1.str());
    p1.playerTurnLeft();
    System.out.println(p1.str());

}
