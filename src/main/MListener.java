package main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Jared H on 3/15/2017.
 */
public class MListener implements MouseListener, MouseMotionListener{

    private static boolean leftClick = false, rightClick = false;
    private int xPos, yPos;
    private static final Image cursorImage = Toolkit.getDefaultToolkit().getImage("src/res/Cursor/Evolution Cursor.png");
    private static final Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0,0), "Cursor");
    Game game;

    public MListener(Game game){
        this.game = game;
    }
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){leftClick = true;}
        if (e.getButton() == MouseEvent.BUTTON2){rightClick = true;}
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){leftClick = false;}
        if (e.getButton() == MouseEvent.BUTTON2){rightClick = false;}
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        game.setCursor(cursor);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        game.setCursor(Cursor.getDefaultCursor());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xPos = e.getX();
        yPos = e.getY();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        xPos = e.getX();
        yPos = e.getY();
    }

    public static boolean isLeftClick() {return leftClick;}
    public static boolean isRightClick() {return rightClick;}

    public int getxPos() {return xPos;}
    public int getyPos() {return yPos;}
    public Point getMousePos(){return new Point(xPos,yPos);}
}
