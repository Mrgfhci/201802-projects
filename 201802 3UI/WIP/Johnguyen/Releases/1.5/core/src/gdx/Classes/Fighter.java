package gdx.Classes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Fighter extends Sprite {
    int nPlayer;
    public PVector vLocation, vVelocity, vAcceleration;
    double dMaxFall;
    double dCeiling = 230; //Maximum Jump Height
    double dDelay;

    public Fighter(String sFile, int nX, int nY, int nW, int nH, int _nPlayer) {
        super(new Texture(sFile));
        vLocation = new PVector(nX, nY);
        vVelocity = new PVector(0, 0);
        vAcceleration = new PVector(0, 0);

        dMaxFall = 5;
        setSize(nW, nH);
        setPosition(nX, nY);
        nPlayer = _nPlayer;
        if (nPlayer == 1) {
            setFlip(false, false);
        } else {
            setFlip(true, false);
        }
    }

    public void move() {
        vVelocity.add(vAcceleration);
        vLocation.add(vVelocity);
        vAcceleration.mult(0);

        if (nPlayer == 1) {
            dDelay += 0.1;
            if (Gdx.input.isKeyPressed(Input.Keys.A))
                vLocation.x -= 4f;

            if (Gdx.input.isKeyPressed(Input.Keys.D))
                vLocation.x += 5f;

            if (vLocation.y < dCeiling && dDelay > 3) {
                if (Gdx.input.isKeyPressed(Input.Keys.W)) {
                    dDelay = 0;
                    vVelocity.y = 10f;
                }
            }
        }

        if (nPlayer == 2) {
            dDelay += 0.1;
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
                vLocation.x -= 5f;

            if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
                vLocation.x += 4f;

            if (vLocation.y < dCeiling && dDelay > 3) {
                if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
                    vVelocity.y = 10f;
                    dDelay = 0;
                }
            }
        }
    }

    public void applyForce(PVector vForce) {
        PVector f = vForce.get();
        vAcceleration.add(f);

    }
}