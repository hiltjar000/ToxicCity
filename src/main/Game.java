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

    public UI ui;

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
        if (ui.state() != state){
            if (state == STATS.MENU){
                ui = new MainMenu(mL, this);
            }
            else if(state == STATS.LOAD){
                ui = new LoadScreen(mL, this);
            }
            else if(state == STATS.OPTIONS){
                ui = new OptionsMenu(mL, this);
            }
            else if(state == STATS.PLAY){
                ui = new PlayScreen(mL, this);
            }
        }
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        ui.paint(g);

    }






}
