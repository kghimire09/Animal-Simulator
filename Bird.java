package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.RandomGenerator;

import java.util.Random;

public class Bird extends Animal {

    @Override
    public String toString() {
        return "B";
    }

    @Override
    protected Position getMove() {
        RandomGenerator rand = new RandomGenerator();
        int dir = rand.nextInt(1, 4);
        if (dir == 1) {
            return new Position(0, -1);
        } else if (dir == 2) {
            return new Position(0, 1);
        } else if (dir == 3) {
            return new Position(-1, 0);
        } else
            return new Position(1, 0);

    }
}


