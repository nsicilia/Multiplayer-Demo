package com.mygdx.multiplayerdemo.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Nick on 2/24/18.
 */

public class Starship extends Sprite {
    Vector2 previousPosition;


    public Starship(Texture texture){
        super(texture);
        previousPosition = new Vector2(getX(), getY());
    }

    public boolean hasMoved(){
        if (previousPosition.x != getX()|| previousPosition.y != getY()){
            previousPosition.x = getX();
            previousPosition.y = getY();
            return true;
        }
        return false;
    }

}
