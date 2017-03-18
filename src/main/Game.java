package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.ui.*;


/**
 * Created by Jared H on 3/15/2017.
 */
public class Game extends JPanel implements ActionListener{
    Timer run;
    Listener mL = new Listener(this);
    main.ui.ui ui;

    public static STATS state = STATS.MENU;

    public static void main(String[] args){
        Game game = new Game();
        game.run();
    }

    public Game(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000,1000));
        setBackground(Color.DARK_GRAY);
        frame.add(this);
        frame.pack();

        frame.setVisible(true);
        setVisible(true);
        frame.setLocationRelativeTo(null);

        addMouseListener(mL);
        addMouseMotionListener(mL);

    }

    public void run(){
        ui = new MainMenu(mL, this);
        run = new Timer(1000/60, this);
        run.start();

    }

    public void actionPerformed(ActionEvent e){
        ui.checks();
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        ui.paint(g);

    }

    public void printSimpleString(String s, int XPos, int YPos, Graphics g2d){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = -stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
    }




}
