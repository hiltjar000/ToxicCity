package main.ui;

import java.awt.*;

/**
 * Created by Jared H on 3/15/2017.
 */
public abstract class Button {
    private String s;
    private int x, y, width, height;
    private final int widthOff = 70, heightOff = 2;
    private boolean hover = false;




    public Button(int x, int y, String s, Color color){
        this.x = x;
        this.y = y;
        this.s = s;
    }


    public void paint(Graphics g){
        int stringLen = (int)g.getFontMetrics().getStringBounds(s, g).getWidth();
        width = stringLen+widthOff;
        height = g.getFontMetrics().getHeight()+heightOff;
        if(!hover){
            g.setColor(Color.BLUE.darker());
        }
        else {g.setColor(Color.BLUE.brighter());}
        g.fillRoundRect(x-width/2,y-heightOff/2, stringLen+widthOff/2, height, 20, 20);
        g.setColor(Color.ORANGE);
        for(int i = 0; i < 2; i++){
            g.drawRoundRect(x-width/2+i,y-heightOff/2+i, stringLen+widthOff/2-2*i, height-2*i, 20-2*i, 20-2*i);
        }
        g.setColor(Color.white);
        printSimpleString(stringLen+widthOff/2, g);
    }

    public Rectangle getBounds(){
        return new Rectangle(x-width/2,y,width-widthOff/2, height);
    }

    public void setHover(boolean hover){this.hover = hover;}

    public void printSimpleString(int stringLen, Graphics g2d){
        g2d.drawString(s, x-stringLen/2, y+(int)(height/1.3));
    }

    public abstract void action();
}
