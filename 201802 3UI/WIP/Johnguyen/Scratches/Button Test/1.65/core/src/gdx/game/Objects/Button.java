package gdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Button extends Sprite {

    public Button(int nW, int nH, int nX, int nY, String sFileName) {
        super(new Texture(Gdx.files.internal(sFileName)));
        setPosition(nX, nY);
        setSize(nW, nH);
        System.out.println(nY);
        System.out.println(nY + nH);
    }

    public boolean isClicked(float fX, float fY, float fW, float fH) { // inspired by daph's code https://github.com/DaphneLai/POLYGONE-Final/tree/master/core/src/gdx
        if (Gdx.input.getX() > fX && Gdx.input.getX() < fX + fW) {
            if (Gdx.graphics.getHeight() - Gdx.input.getY() > fY && Gdx.graphics.getHeight() - Gdx.input.getY() < fY + fH) {
                return true;
            }

        }

        return false;
    }
}
