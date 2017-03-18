package main.ui;

import main.Game;
import main.Listener;
import main.STATS;

import java.awt.*;

/**
 * Created by Jared H on 3/18/2017.
 */
public abstract class UI implements Cloneable{

    protected Listener mL;
    protected Game game;
    STATS state;


    public UI(Listener mL, Game game, STATS state){
        this.mL = mL;
        this.game = game;
        this.state = state;

    }

    public abstract void paint(Graphics g);
    public abstract void checks();
    public STATS state(){
        return state;
    }

    public void printSimpleString(String s, int XPos, int YPos, Graphics g2d){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = -stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
    }
}
