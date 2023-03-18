package Sweeper;

import java.awt.*;

public class Game {

    Matrix bombMap;

    public void start() {
        bombMap = new Matrix(Box.ZERO);
        bombMap.set(new Coord(0,0),Box.BOMB);

    }


    public Game(int cols, int rows) {
        Ranges.setSize(new Coord(cols, rows));
    }

    public Box getBox(Coord coord) {
        return bombMap.get(coord);
    }


}