package main.ui;


import main.STATS;
import main.ui.Buttons.*;
import main.Game;
import main.Listener;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Jared H on 3/16/2017.
 */
public class MainMenu extends UI {
    final int TITLE_SIZE = 128, TEXT_SIZE = 58;

    ArrayList<Button> buttons;

    public MainMenu(Listener mL, Game game){
        super(mL, game, STATS.MENU);


        buttons = new ArrayList<>();
        String[] s = new String[4];
        s[1] = "Load";
        s[2] = "Options";
        s[3] = "Exit";

        buttons.add(new PlayButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size(), Color.BLUE));
        buttons.add(new LoadButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size(), Color.BLUE));
        buttons.add(new OptionsButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size(), Color.BLUE));
        buttons.add(new ExitButton(game.getWidth()*3/4, (game.getHeight()/4) + game.getHeight()/10* buttons.size(), Color.BLUE));

    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Times New Roman", Font.BOLD, TITLE_SIZE));
        printSimpleString("Toxicity", game.getWidth()/3, game.getHeight()/6, g);

        g.setFont(new Font("Times New Roman", Font.PLAIN, TEXT_SIZE));
        if (buttons != null) {
            for (Button button : buttons) {
                button.paint(g);
            }
        }
    }

    public void checks(){
        if (buttons != null){
            for (int i = 0; i < buttons.size(); i++) {
                Button button = buttons.get(i);

                if (button.getBounds().contains(mL.getMousePos())) {
                    button.setHover(true);
                } else {
                    button.setHover(false);
                }

                if (mL.isLeftClick()) {
                    if (button.getBounds().contains(mL.getMousePos())) {
                        button.action();
                    }
                }
            }
        }
    }

}
