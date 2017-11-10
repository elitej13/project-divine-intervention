package com.somethingspecific.framework;
import com.badlogic.gdx.math.Vector2;
import com.somethingspecific.entities.*;
import com.somethingspecific.graphics.SpriteSheet;

import java.util.ArrayList;

public class EntityManager {

    MapManager map;
    ArrayList<Entity> entities;
    Entity[] players;

    public EntityManager(MapManager map){
        this.map = map;
        entities = new ArrayList<Entity>();
        players = new Entity[2];
<<<<<<< HEAD
        players[0] = new Player(this, -300.0f,0.0f, SpriteSheet.bigHead, 0);
        players[1] = new Player(this, 300.0f,0.0f,SpriteSheet.bigHead, 1);
        gravity = 1.5f;
=======
        players[0] = new Player(-300.0f,0.0f, SpriteSheet.bigHead, 0);
        players[1] = new Player(300.0f,0.0f,SpriteSheet.bigHead, 1);
>>>>>>> origin/master


    }

    public Vector2 findPosition(){
        return new Vector2((players[0].position.x+ players[1].position.x)/2,0);
    }

    public void update(){
        for(int i=0;i<players.length;i++){
            players[i].update();
        }
    }

    public void render(ScreenManager screen){
        screen.setPosition(findPosition());

        for(int i=0;i<players.length;i++){
            players[i].render(screen);
        }
    }

    public boolean checkCollision(Vector2 position, Vector2 size) {
        float x0 = position.x;
        float x1 = position.x + size.x;
        float y0 = position.y;
        float y1 = position.y + size.y;

<<<<<<< HEAD
        for(int y = 0; y < map.height; y++) {
            for(int x = 0; x < map.width; x++) {
                if(map.tiles[x + ( y * map.width)] >= 0) continue;
                if(x0 < (x * MapManager.tilesize) && x1 > (x * MapManager.tilesize) && y0 < (y * MapManager.tilesize) && y1 > (y * MapManager.tilesize))
                    return false;
                if((x * MapManager.tilesize) < x0 && (x * MapManager.tilesize) + MapManager.tilesize > x1 && (y * MapManager.tilesize) < y0 && (y * MapManager.tilesize) + MapManager.tilesize > y1)
                    return false;
            }
        }
        for(Entity e : entities) {
           if(x0 < e.position.x && x1 > e.position.x && y0 < e.position.y && y1 > e.position.y)
               return false;
           if(e.position.x < x0 && e.position.x + e.texture.getWidth() > x1 && e.position.y < y0 && e.position.y + e.texture.getHeight() > y1)
               return false;
        }
        for(Entity e : players) {
            if(x0 < e.position.x && x1 > e.position.x && y0 < e.position.y && y1 > e.position.y)
                return false;
            if(e.position.x < x0 && e.position.x + e.texture.getWidth() > x1 && e.position.y < y0 && e.position.y + e.texture.getHeight() > y1)
                return false;
        }
        return true;
=======

>>>>>>> origin/master
    }
}
