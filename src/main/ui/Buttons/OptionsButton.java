package main.ui.Buttons;


import main.Game;
import main.STATS;

import java.awt.*;

/**
 * Created by hiltjar000 on 3/17/2017.
 */
public class OptionsButton extends Button {

    public OptionsButton(int x, int y, Color color){
        super(x, y, "Options", color);

    }
    @Override
    public void action() {
        Game.state = STATS.OPTIONS;
    }
}
