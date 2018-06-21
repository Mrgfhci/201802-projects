package gdx.shooting;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import java.util.ArrayList;

public class Shooting extends ApplicationAdapter implements InputProcessor {

    SpriteBatch batch;
    Sprite platform;
    Texture img;
    ShapeRenderer SR;
    ArrayList<gdx.shooting.bullets> bullets = new ArrayList<bullets>();
    int nMax = 0, nDir;
    float fPlatX, fPlatY, fPlatWidth, fPlatHeight, fPlayWidth, fPlayHeight, fVelocity, fGravity;
    Vector2 playerPos, mousePos, vDir, bulletPos;
    boolean canJump, isOnGround;

    @Override
    public void create() {
        Gdx.input.setInputProcessor(this);
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        SR = new ShapeRenderer();
        platform = new Sprite(img);
        fPlatX = 0;
        fPlatY = 0;
        fPlatWidth = Gdx.graphics.getWidth();
        fPlatHeight = 100;
        fPlayWidth = 50;
        fPlayHeight = 50;
        fGravity = (float) 0.1;
        playerPos = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        mousePos = new Vector2(0, 0);
        nDir = 1; //direction of the bullets, 1 for left, 2 for right, and 3 for up

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(platform, fPlatX, fPlatY, fPlatWidth, fPlatHeight);
        batch.end();
        player();
        hitDetection();
        playerMove();
        bullet();
        spawn();
        //System.out.println(playerPos.y);
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }

    public void player() {
        SR.begin(ShapeType.Filled);
        SR.setColor(Color.BLACK);
        SR.rect(playerPos.x, playerPos.y, fPlayWidth, fPlayHeight);
        SR.end();
    }

    public void hitDetection() {
        if (playerPos.y <= fPlatY + fPlatHeight) {
             fVelocity = 5;
             isOnGround = true;
             canJump = false;
        //}
        } else {
            playerPos.y += fVelocity;
            fVelocity -= fGravity;
        }
    }
    
    public void playerMove() {
        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            playerPos.x -= 5;
            nDir = 1;
        } else if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            playerPos.x += 5;
            nDir = 2;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            nDir = 3;
            if(isOnGround == true) {
                canJump = true;
            }
        }
        if(canJump == true) {
            playerPos.y += fVelocity;
            fVelocity -= fGravity;
        }
    }

    public void bullet() { //making the bullets
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && nMax < 4) { // max of 4 bullets
            nMax++;
            mousePos.set(Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY());
            vDir = mousePos.sub(playerPos);
            bulletPos = new Vector2(playerPos.x + 20, playerPos.y + 20);
            bullets.add(new bullets(bulletPos, vDir, SR, nDir));
        }
    }

    public void spawn() { //showing the bullets
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).Update();
            if (isOutOfRange(bullets.get(i))){
                bullets.remove(i);
                nMax--; //resets if out of range
            }
        }
    }
    
    private boolean isOutOfRange(bullets bullet) { // if the bullets are hitting the ground or touching the sides of the screens
        return bullet.vPos.x < 0 || bullet.vPos.x > Gdx.graphics.getWidth() ||
                bullet.vPos.y <= fPlatY + fPlatHeight;
    }

    @Override
    public boolean keyDown(int i) {
        return false;
    }

    @Override
    public boolean keyUp(int i) {
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
