/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdx.shooting;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author benny
 */
public class bullets {

    Vector2 vPos;
    ShapeRenderer SR;
    Vector2 dir;
    Vector2 grav;
    int nDirection;
    float fX, fY, fScale = 10, fVelocity = (float) 0.5, fGravity = (float) 0.1, fUpVel = 7;

    bullets(Vector2 vPos, Vector2 _dir, ShapeRenderer Temp, Integer Direction) {
        //bullets(float fTempX, float fTempY, ShapeRenderer Temp) {
        this.vPos = vPos;
        this.nDirection = Direction;
//        this.fX = fTempX;
//        this.fY = fTempY;
        this.SR = Temp;
        dir = _dir;
        grav = new Vector2(0, -0.01f);
    }
    //}

    public void Update() {
        ammo();
        move();
//        dir.add(grav);
//        dir.clamp(-0.01f, 0.01f);
    }

    public void ammo() {
        SR.begin(ShapeType.Filled);
        SR.setColor(Color.CYAN);
        SR.ellipse(vPos.x, vPos.y, 10, 10);
        SR.end();

    }

    public void move() {
        if (nDirection == 1) {
            vPos.x -= 10;
        } else if (nDirection == 2) {
            vPos.x += 10;
        }
        else if(nDirection == 3) {
            vPos.y += fUpVel;
            fUpVel -= fGravity;
        }
        vPos.y += fVelocity;
        if(fVelocity > -0.5) {
        fVelocity -= fGravity;
        }

    }
}
