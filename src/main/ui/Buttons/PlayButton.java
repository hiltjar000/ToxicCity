package main.ui.Buttons;
import main.Game;
import main.STATS;

import java.awt.*;

/**
 * Created by hiltjar000 on 3/17/2017.
 */
public class PlayButton extends Button {

    public PlayButton(int x, int y, Color color){
        super(x,y,"Play", color);
    }

    public void action(){
        Game.state = STATS.PLAY;
    }

}
