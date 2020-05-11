package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;

public class Turtle extends Animal {
    private int iterator = 1;
    @Override
    public String toString(){
        return "T";
    }
//Moves south 5 steps, west 5 steps, north 5 steps, east 5 steps(clockwise box)
    @Override
    protected Position getMove(){
        if(iterator <=5){
            iterator++;
            return new Position(0,1); //south
        }else if (iterator <= 10){
            iterator ++;
            return new Position(-1, 0);//west
        }
        else if (iterator <= 15){
            iterator++;
            return new Position(0,-1);//north
        }
        else iterator ++;
        if (iterator>20){
            iterator = 0;
        }
        return new Position(1, 0);//east
    }
}
