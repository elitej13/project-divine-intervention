package com.somethingspecific.framework;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class ScreenManager {

    SpriteBatch sb;
    OrthographicCamera oc;



    public ScreenManager() {
        float width = Gdx.graphics.getWidth();
        float height = Gdx.graphics.getHeight();
        oc = new OrthographicCamera(800, 800 * (height / width));

        sb = new SpriteBatch();
    }

    public void start() {
        oc.update();

        sb.setProjectionMatrix(oc.combined);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        sb.begin();


    }
    public void stop() {
        sb.end();
    }


    public void setPosition(Vector2 position) {
        oc.position.set(position, 1.0f)
    }

}
