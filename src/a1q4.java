
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class a1q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Build the things
        //City
        City town = new City();
        //Robots
        Robot jarvis = new Robot(town,0,0,Direction.SOUTH);
        Robot ultron = new Robot(town,0,1,Direction.SOUTH);
        //walls
        new Wall(town,0,1,Direction.WEST);
        new Wall(town,1,1,Direction.WEST);
        new Wall(town,1,1,Direction.SOUTH);
        //move robot
        jarvis.move();
        ultron.move();
        ultron.turnLeft();
        ultron.move();
        ultron.turnLeft();
        ultron.turnLeft();
        ultron.turnLeft();
        jarvis.move();
        ultron.move();
        jarvis.turnLeft();
        ultron.turnLeft();
        ultron.turnLeft();
        ultron.turnLeft();
        jarvis.move();
        ultron.move();
    }
    
}
