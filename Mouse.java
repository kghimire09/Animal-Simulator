package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;

public class Mouse extends Animal {
    private int iterator = 0;

    @Override
    public String toString() {
        return "M";
    }

    @Override
    protected Position getMove() {
        if (iterator == 0) {
            iterator++;
            return new Position(-1, 0);
        } else
            iterator--;
        return new Position(0, -1);
    }
}
