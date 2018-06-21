package gdx.game.Menu;


import com.badlogic.gdx.Game;
import gdx.game.Screens.ScrBckgd;
import gdx.game.Screens.ScrMenu;




	public class GamMenu extends Game {
		ScrMenu scrmenu;
		ScrBckgd scrbckgd;
		int nScreen;

		//0 for ScrMenu, 1 for ScrBckgd
		public void updateScreen(int _nScreen) {
			nScreen = _nScreen;
			if (nScreen == 0) {
				setScreen(scrmenu);
			}
			else if(nScreen == 1){
				setScreen(scrbckgd);
			}
		}

		@Override
		public void create() {
			nScreen = 0;
			scrmenu = new ScrMenu(this);
			scrbckgd = new ScrBckgd(this);
			updateScreen(0);
		}

		@Override
		public void render() {
			super.render();

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