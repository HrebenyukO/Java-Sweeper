package Sweeper;

import java.util.ArrayList;

public class Ranges {

    static private ArrayList<Coord> allCoords;
    static private Coord size;

    static void setSize(Coord size) {
        Ranges.size = size;
        allCoords = new ArrayList<>();
        for (int x = 0; x < size.x; x++) {
            for (int y = 0; y < size.y; y++) {
                allCoords.add(new Coord(x, y));
            }
        }
    }

    public static ArrayList<Coord> getAllCoords() {
        return allCoords;
    }


    public static Coord getSize() {
        return size;
    }

    public static boolean isRange(Coord coord) {
        return coord.x >= 0 && coord.x < size.x &&
                coord.y >= 0 && coord.y < size.y;
    }
}
