package com.somethingspecific.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.somethingspecific.graphics.SpriteSheet;
import com.somethingspecific.input.GamePadManager;
import com.somethingspecific.input.InputManager;

public class Player extends Mob {
    int playerNum;
    boolean jumping = false;
    boolean dashing = false;

    public Player(Vector2 position, int playerNum){
        super(position);
        texture = SpriteSheet.bigHead;
        this.playerNum =playerNum;
    }
    public Player(float x, float y, int playerNum){
        super(x,y);
        texture = SpriteSheet.bigHead;
        this.playerNum =playerNum;
    }
    public Player(float x, float y, Texture t, int playerNum){
        super(x,y);
        texture = t;
        this.playerNum =playerNum;
    }
    public void jump(){
        velocity.y += 20;
    }

    public void move(){
        if(InputManager.jump[playerNum] && !jumping) {
            jump();
            jumping = true;
        }
        else if(!InputManager.jump[playerNum]){
            jumping = false;
        }
        if(InputManager.dash[playerNum] && !dashing) {
            //jump();
            dashing = true;
        }
        else if(!InputManager.dash[playerNum]){
            dashing = false;
        }

        position.x += InputManager.horizontal[playerNum];
    }

    @Override
    public void update(){
        super.update();
        move();
    }

}
