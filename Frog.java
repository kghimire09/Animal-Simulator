package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.RandomGenerator;

import java.io.PipedOutputStream;

public class Frog extends Animal {
    private int iteration = 1;
    boolean firstTime = true;
    int dir = 0;

    @Override
    public String toString() {
        return "F";
    }

    @Override
    protected Position getMove() {

        if (firstTime){
            RandomGenerator rand = new RandomGenerator();
            dir = rand.nextInt(1, 4);
            firstTime = false;
        }
        if (iteration == 4){
            iteration = 1;
            RandomGenerator rand = new RandomGenerator();
            dir= rand.nextInt(4);
        }
        if (dir == 1 && iteration <= 3) {
            iteration++;
            return new Position(0, -1); //north
        } else if (dir == 2 && iteration <=3) {
            iteration++;
            return new Position(0, 1); //south
        } else if (dir == 3 && iteration <= 3) {
            iteration++;
            return new Position(-1, 0); //west
        } else if (dir ==4 && iteration <=3)
           iteration ++;
            return new Position(1, 0); //east
    }
}
