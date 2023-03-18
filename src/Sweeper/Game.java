package Sweeper;

import java.awt.*;

public class Game {

    Matrix bombMap;

    public Game(int cols, int rows) {
        Ranges.setSize(new Coord(cols, rows));
    }

    public Box getBox(Coord coord) {
        return Box.BOMB;
    }
}
