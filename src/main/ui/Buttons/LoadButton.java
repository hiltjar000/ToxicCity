package main.ui.Buttons;

import main.Game;
import main.STATS;

/**
 * Created by Jared H on 3/18/2017.
 */
public class LoadButton extends Button {

    public LoadButton(int x, int y){
        super(x, y, "Load");

    }
    @Override
    public void action() {
        Game.state = STATS.LOAD;
    }
}
