package com.towerdefense.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.towerdefense.game.tower.TowerBasic;

public class TowerDefenseGame implements ApplicationListener {

    private SpriteBatch batch;
    private Texture texture;
    private Sprite sprite;
    TowerBasic tourTest;

    public void create(){
        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("Tower_defense_map.jpg"));
        sprite = new Sprite(texture);
        tourTest = new TowerBasic(10,10,0,0);
        }

    public void dispose() {
        batch.dispose();
        texture.dispose();
    }

    public void render(){
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        sprite.draw(batch);
        tourTest.display(batch);
        batch.end();
    }

    public void resize(int width, int height) {
    }

    public void pause() {
    }

    public void resume() {
    }

}