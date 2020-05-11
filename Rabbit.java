package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;

public class Rabbit extends Animal {
    private int iterator = 0;

    @Override
    public String toString(){
        return "V";
    }
  //  Rabbit V = Move north 2 steps, east 2 steps, south 2 steps("hops to the right")
    @Override
    protected Position getMove(){
        if (iterator == 0 || iterator == 1){
            iterator++;
            return new Position(0, -1);
        }else if (iterator == 2 || iterator == 3){
            iterator++;
            return new Position(1, 0);
        }else if (iterator == 4){
            iterator++;
            return new Position(0,1);
        }
        else
            iterator = 0;
        return new Position(0,1);
    }
}
