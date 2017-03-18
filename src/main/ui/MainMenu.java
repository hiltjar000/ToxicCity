package main.ui;


import main.ui.Buttons.*;
import main.Game;
import main.MListener;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Jared H on 3/16/2017.
 */
public class MainMenu implements ui{
    final int TITLE_SIZE = 128, TEXT_SIZE = 58;
    MListener mL;
    Game game;
    ArrayList<main.ui.Buttons.Button> buttons;

    public MainMenu(MListener mL, Game game){
        this.mL = mL;
        this.game = game;

        buttons = new ArrayList<>();
        String[] s = new String[4];
        s[1] = "Load";
        s[2] = "Options";
        s[3] = "Exit";

        buttons.add(new PlayButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size()));
        buttons.add(new LoadButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size()));
        buttons.add(new OptionsButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size()));
        buttons.add(new ExitButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size()));

    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Times New Roman", Font.BOLD, TITLE_SIZE));
        game.printSimpleString("Toxicity", game.getWidth()/3, game.getHeight()/6, g);

        g.setFont(new Font("Times New Roman", Font.PLAIN, TEXT_SIZE));
        for(main.ui.Buttons.Button button: buttons){
            button.paint(g);
        }
    }

    public void checks(){

        for(int i = 0; i < buttons.size(); i++){
            main.ui.Buttons.Button button = buttons.get(i);

            if(button.getBounds().contains(mL.getMousePos())){
                button.setHover(true);
            }
            else{button.setHover(false);}

            if (mL.isLeftClick()){
                if (button.getBounds().contains(mL.getMousePos())){
                    button.action();
                }
            }
        }
    }

}
