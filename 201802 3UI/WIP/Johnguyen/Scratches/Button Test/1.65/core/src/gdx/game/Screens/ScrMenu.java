package gdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import gdx.game.Menu.GamMenu;
import gdx.game.Objects.Button;
import gdx.game.Objects.Title;

public class ScrMenu implements Screen {
    SpriteBatch batch;
    Texture tMenuBg;
    Sprite sprMenuBg;
    GamMenu gammenu;
    Button btnStart, btnBg;
    Title ttlStart;

    public ScrMenu(GamMenu _gammenu){ gammenu = _gammenu;}

    @Override
    public void show() {
        batch = new SpriteBatch();
        tMenuBg = new Texture ("startmenu2.jpg");
        sprMenuBg = new Sprite(tMenuBg);
        btnStart = new Button(300, 250, Gdx.graphics.getWidth()/2-148, Gdx.graphics.getHeight()/2-100, "startbutton4.png");
        ttlStart = new Title(400, 400, Gdx.graphics.getWidth()/2-188, Gdx.graphics.getHeight()/2-50, "title.png");
        btnBg = new Button(300, 250, Gdx.graphics.getWidth()/2-148, Gdx.graphics.getHeight()/2-188, "bgbutton.png");
    }

    @Override
    public void render(float delta) {
        isClicked();
        batch.begin();
        sprMenuBg.draw(batch);
        btnStart.draw(batch);
        btnBg.draw(batch);
        ttlStart.draw(batch);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

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

    public void isClicked(){
        if(Gdx.input.isButtonPressed(Input.Keys.LEFT)){
            if(btnStart.isClicked(btnStart.getX(), btnStart.getY(), btnStart.getWidth(), btnStart.getHeight())){
                System.out.println("Hit start");
              //  gammenu.updateScreen(0);
            }
            if(btnBg.isClicked(btnBg.getX(),btnBg.getY(), btnBg.getWidth(), btnBg.getHeight())){
                System.out.println("Hit Bg");
                gammenu.updateScreen(1);
            }
        }
    }
    public void dispose() {
        batch.dispose();
        tMenuBg.dispose();
    }
}

