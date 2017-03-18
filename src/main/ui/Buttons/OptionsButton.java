package main.ui.Buttons;


import main.Game;
import main.STATS;

/**
 * Created by hiltjar000 on 3/17/2017.
 */
public class OptionsButton extends Button {

    public OptionsButton(int x, int y){
        super(x, y, "Options");

    }
    @Override
    public void action() {
        Game.state = STATS.OPTIONS;
    }
}
