package com.towerdefense.game.Unit;

/**
 * Created by Félix on 10/03/2016.
 * basic class for the basicUnit
 */

import com.badlogic.gdx.graphics.Texture;


import java.awt.*;
import java.util.ArrayList;

public class BasicUnit extends Units {


    public BasicUnit(Point coordonees, int life, ArrayList<Point> wayPoints,int nbWayPoints){
        super();
        this.setLastWayPoint(0);
        this.setLife(life);
        this.setCurrentLife(life);
        this.setCoordonees(coordonees);
        this.setTexture(new Texture("monster.jpg"));
        this.setNbWayPoints(nbWayPoints);
        this.setWayPoints(wayPoints);

    }
}