package gdx.game.Menu;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import gdx.game.Screens.*;

public class GamMenu extends Game {
    ScrPlay scrPlay;
    ScrMenu scrMenu;
    ScrBckgd scrBckgd;
    ScrScratch scrScratch;
    ScrInstruc scrInstruc;
    ScrScratchAnimation scrScratchAnimation;
    ScrScratchBasicA scrScratchBasicA;
    ScrScratchBlock scrScratchBlock;
    ScrScratchHealth scrScratchHealth;
    ScrPlayers scrPlayers;
    int nScreen, nFormerScreen;
    boolean Menu= false;


    // 0 start menu, 1 play screen, 2 background screen, 3 scratch screen, 4 instruction screen, 5 Player Screen
    //10 animation scratch, 11 Basic Attack scratch, 12 block scratch, 13 health scratch
    public void updateScreen(int _nScreen) {
        nScreen = _nScreen;
        if (nScreen == 0) {
            nFormerScreen=0;
            setScreen(scrMenu);
        } else if (nScreen == 1) {
            nFormerScreen=1;
            setScreen(scrPlay);
        }else if(nScreen ==2){
            nFormerScreen=2;
            setScreen(scrBckgd);
        }else if(nScreen==3){
            nFormerScreen=3;
            setScreen(scrScratch);
        }else if(nScreen==4){
            nFormerScreen=4;
            setScreen(scrInstruc);
        }else if(nScreen==5){
            nFormerScreen=5;
            setScreen(scrPlayers);
        } else if(nScreen ==10){
            nFormerScreen=10;
            setScreen(scrScratchAnimation);

        }else if(nScreen ==11){
            nFormerScreen=11;
            setScreen(scrScratchBasicA);

        }else if(nScreen ==12){
            nFormerScreen=12;
            setScreen(scrScratchBlock);

        }else if(nScreen ==13){
            nFormerScreen=13;
            setScreen(scrScratchHealth);

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
        if(Gdx.input.isKeyPressed(Input.Keys.B)){
            System.out.println("BACK");
            System.out.println(nScreen + " NSCREEN");
            updateScreen(nFormerScreen);
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
        scrScratchAnimation = new ScrScratchAnimation(this);
        scrScratchBasicA = new ScrScratchBasicA(this);
        scrScratchBlock = new ScrScratchBlock(this);
        scrScratchHealth = new ScrScratchHealth(this);
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
