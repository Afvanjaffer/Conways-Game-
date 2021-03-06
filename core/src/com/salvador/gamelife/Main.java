package   .gamelife;

import com.badlogic.gdx.Game;
import   .gamelife.Screen.GameLife;

public class Main extends Game {

    public Assets assets;
    public GameLife screen;

    @Override
    public void create() {
        assets = new Assets();
        assets.loadGame();
        screen = new GameLife(this);
        setScreen(screen);
    }

}
