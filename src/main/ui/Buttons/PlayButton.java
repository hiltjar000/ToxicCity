package main.ui.Buttons;
import main.Game;
import main.STATS;

/**
 * Created by hiltjar000 on 3/17/2017.
 */
public class PlayButton extends Button {

    public PlayButton(int x, int y) {
        super(x,y,"Play");
    }

    public void action(){
        Game.state = STATS.PLAY;
    }

}
