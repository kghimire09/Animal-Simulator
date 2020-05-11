package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;

public class Snake extends Animal {
    private int length = 0;
    private int step = 0;

    @Override
    public String toString() {
        return "S";
    }

    // Moves south 1 step, east 1 step, south 1 step, west 2 steps, south 1 step, east 3 steps, south 1 step, east 3 steps, south 1 step, west 4 steps
    //  .... slithers left and right in increasing length.
    @Override
    protected Position getMove() {
        step++;
        if (step > length) {
            length++;
            step = 0;
            return new Position(0, 1); //gives south
        } else if (length % 2 == 1) {
            return new Position(1, 0);//east
        } else {
            return new Position(-1, 0);//west
        }
    }
}