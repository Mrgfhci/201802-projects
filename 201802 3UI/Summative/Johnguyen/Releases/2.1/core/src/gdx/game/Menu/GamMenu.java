package gdx.game.Menu;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import gdx.game.Screens.*;

public class GamMenu extends Game{
    ScrPlay scrPlay;
    ScrMenu scrMenu;
    ScrBckgd scrBckgd;
    ScrScratch scrScratch;
    ScrInstruc scrInstruc;
    ScrScratchCmbt scrScratchCmbt;
    ScrPlayers scrPlayers;
    int nScreen;
    boolean Menu= false;


    // 0 start menu, 1 play screen, 2 background screen, 3 scratch screen, 4 instruction screen, 5 Player Screen
    //10 animation scratch, 11 Basic Attack scratch, 12 block scratch, 13 health scratch
    public void updateScreen(int _nScreen) {
        nScreen = _nScreen;
        if (nScreen == 0) {
            setScreen(scrMenu);
        } else if (nScreen == 1) {
            setScreen(scrPlay);
        } else if (nScreen == 2) {
            setScreen(scrBckgd);
        } else if (nScreen == 3) {
            setScreen(scrScratch);
        } else if (nScreen == 4) {
            setScreen(scrInstruc);
        } else if (nScreen == 5) {
            setScreen(scrPlayers);

        } else if (nScreen == 12) {
            setScreen(scrScratchCmbt);
        }
    }

    public boolean Menu() {
        if (Gdx.input.isKeyPressed(Input.Keys.M)) {
            System.out.println("MENU");
            updateScreen(0);
        }
        return false;
    }

    public boolean Back(){
        if(Gdx.input.isKeyJustPressed(Input.Keys.B)){
         if(nScreen>0 && nScreen<10){
             nScreen=0;
             updateScreen(nScreen);
         }
        else if(nScreen>=10){
             nScreen =3;
             updateScreen(nScreen);
         }
        }
        return false;
    }

    @Override
    public void create() {
        nScreen = 0;
        scrMenu = new ScrMenu(this);
        scrPlay = new ScrPlay(this);
        scrBckgd = new ScrBckgd(this);
        scrScratch = new ScrScratch(this);
        scrScratchCmbt = new ScrScratchCmbt(this);
        scrInstruc = new ScrInstruc(this);
        scrPlayers = new ScrPlayers(this);
        updateScreen(0);
    }

    @Override
    public void render() {
        super.render();
        Menu();
        Back();

    }

    @Override

    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void dispose() {
        super.dispose();
    }

}
