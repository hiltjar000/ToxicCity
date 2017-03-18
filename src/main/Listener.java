package main;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Jared H on 3/15/2017.
 */
public class Listener implements MouseListener, MouseMotionListener, KeyListener{

    private static boolean leftClick = false, rightClick = false;
    private int xPos, yPos;
    private static final Image cursorImage = Toolkit.getDefaultToolkit().getImage("src/res/Cursor/Evolution Cursor.png");
    private static final Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0,0), "Cursor");
    Game game;

    //Constructor
    public Listener(Game game){
        this.game = game;
    }

    //MOUSE STUFF
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {
        game.setCursor(cursor);
    }
    public void mouseExited(MouseEvent e) {
        game.setCursor(Cursor.getDefaultCursor());
    }
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){leftClick = true;}
        if (e.getButton() == MouseEvent.BUTTON2){rightClick = true;}
    }
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){leftClick = false;}
        if (e.getButton() == MouseEvent.BUTTON2){rightClick = false;}
    }
    public void mouseDragged(MouseEvent e) {
        xPos = e.getX();
        yPos = e.getY();
    }
    public void mouseMoved(MouseEvent e) {
        xPos = e.getX();
        yPos = e.getY();
    }

    public static boolean isLeftClick() {return leftClick;}
    public static boolean isRightClick() {return rightClick;}
    public Point getMousePos(){return new Point(xPos,yPos);}


    //KEYBOARD STUFF
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}


}
