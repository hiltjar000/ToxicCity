package main.ui.Buttons;

import main.Game;
import main.STATS;

import java.awt.*;

/**
 * Created by Jared H on 3/18/2017.
 */
public class LoadButton extends Button {

    public LoadButton(int x, int y, Color color){
        super(x, y, "Load", color);

    }
    @Override
    public void action() {
        Game.state = STATS.LOAD;
    }
}
