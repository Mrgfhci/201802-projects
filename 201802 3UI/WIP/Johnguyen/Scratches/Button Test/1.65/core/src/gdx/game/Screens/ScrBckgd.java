package gdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import gdx.game.Menu.GamMenu;
import gdx.game.Objects.Title;

public class ScrBckgd implements Screen {
    Texture tBckground;
    Sprite sprBckground;
    SpriteBatch batch;
    GamMenu gammenu;
    Title ttlStart;

    public ScrBckgd(GamMenu _gammenu){ gammenu = _gammenu;}

    @Override
    public void show() {
        batch = new SpriteBatch();
        tBckground = new Texture("backgroundselection.jpg");
        sprBckground = new Sprite(tBckground);
        ttlStart = new Title(200, 200, Gdx.graphics.getWidth()/2-90, Gdx.graphics.getHeight()/2+100, "title.png");

    }

    @Override
    public void render(float delta) {
        batch.begin();
        sprBckground.draw(batch);
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

    @Override
    public void dispose() {
    tBckground.dispose();
    batch.dispose();
    }
}
