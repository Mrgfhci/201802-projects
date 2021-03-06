package com.gdx.scratches;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.gdx.hamsters.GamHamsters;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class ScrMain implements Screen, InputProcessor {

    SpriteBatch batch;
    int nGhostX, nGhostY, nGhostDirOld, nGhostDirNew, nGhostdX, nGhostdY, nHamDir, nHamVorH, nHamdX, nHamdY, nRanGhostMove;
    boolean bMovement, bGhostOOB, bHamsterOOB, bGhostRanMove, bIsHit;
    OrthographicCamera ocCam;
    SprGhost sprGhost;
    SprHamster sprHamster;
    GamHamsters gamHamsters;

    public ScrMain(GamHamsters _gamhamsters) {
        batch = new SpriteBatch();
        sprGhost = new SprGhost(275, 200, 30, 30);
        sprHamster = new SprHamster(100, 100, 30, 30);
        nGhostdX = 0;
        nGhostdY = 0;
        bMovement = false;
        Gdx.input.setInputProcessor(this);
        ocCam = new OrthographicCamera();
        gamHamsters = _gamhamsters;
    }

    @Override
    public void show() {
        ocCam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        ocCam.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        ocCam.update();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(255, 255, 255, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        nRanGhostMove = (int) (Math.random() * 50 + 1);
        if (nRanGhostMove == 1) {
            sprGhost.Movement(sprGhost, nGhostDirOld, nGhostDirNew);
        }
        sprGhost.setX(sprGhost.getX() + sprGhost.nDx);
        sprGhost.setY(sprGhost.getY() + sprGhost.nDy);
        if (bMovement = true) {
            sprHamster.Movement(sprHamster, nHamDir);
        }
        bGhostOOB = isOutOfBounds(sprGhost);
        if (bGhostOOB == true) {
            sprGhost.OOB(sprGhost);
            sprGhost.Movement(sprGhost, nGhostDirOld, nGhostDirNew);
            sprGhost.setX(sprGhost.getX() + sprGhost.nDx);
            sprGhost.setY(sprGhost.getY() + sprGhost.nDy);
        }
        bHamsterOOB = isOutOfBounds(sprHamster);
        if (bHamsterOOB == true) {
            sprHamster.OOB(sprHamster);
        }
        bIsHit = isHit(sprGhost, sprHamster);
        if (bIsHit == true) {
            gamHamsters.updateState(3);
        }
        batch.begin();
        sprGhost.draw(batch);
        sprHamster.draw(batch);
        batch.end();
    }

    public boolean isHit(Sprite sprGhost, Sprite spr2) {
        return sprGhost.getBoundingRectangle().overlaps(spr2.getBoundingRectangle());
    }

    public static boolean isOutOfBounds(Sprite sprGhost) {
        if (0 < sprGhost.getX() && sprGhost.getX() + sprGhost.getWidth() < Gdx.graphics.getWidth() && 0 < sprGhost.getY() && sprGhost.getY() + sprGhost.getHeight() < Gdx.graphics.getHeight()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void resize(int i, int i1) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean keyDown(int keycode) {
        bMovement = true;
        if (keycode == Input.Keys.W) {
            nHamDir = 1;
        } else if (keycode == Input.Keys.D) {
            nHamDir = 2;
        } else if (keycode == Input.Keys.S) {
            nHamDir = 3;
        } else if (keycode == Input.Keys.A) {
            nHamDir = 4;
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        nHamDir = 0;
        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        return false;

    }

    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {
        return false;

    }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        return false;

    }

    @Override
    public boolean mouseMoved(int i, int i1) {
        return false;

    }

    @Override
    public boolean scrolled(int i) {
        return false;

    }
}
