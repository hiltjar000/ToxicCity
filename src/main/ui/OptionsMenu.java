package main.ui;

import main.Game;
import main.Listener;
import main.STATS;

import java.awt.*;

/**
 * Created by Jared H on 3/18/2017.
 */
public class OptionsMenu extends UI{
    int x, y, width, height;
    private enum PAGE{
        GENERAL,
        AUDIO,
        GRAPHICS
    }
    PAGE state = PAGE.GENERAL;

    public OptionsMenu(Listener mL, Game game) {
        super(mL, game, STATS.OPTIONS);
        x = game.getWidth()/12;
        y = game.getHeight()/12;
        width = game.getWidth()*5/6;
        height = game.getHeight()*5/6;

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRoundRect(x, y, width, height, 40, 40);
        g.setColor(Color.YELLOW);
        for(int i = 0; i < 2; i++) {
            g.drawRoundRect(x+i, y+i, width-i*2, height-i*2, 40, 40);
        }
        g.drawRoundRect(x,y,width/3, height/10, 40, 40);

    }

    public void checks() {

    }
}
