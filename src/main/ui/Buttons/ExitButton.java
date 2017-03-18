package main.ui.Buttons;

import main.Game;

import java.awt.*;

/**
 * Created by Jared H on 3/18/2017.
 */
public class ExitButton extends Button {

    public ExitButton(int x, int y, Color color){
        super(x, y, "Exit", color);

    }
    @Override
    public void action() {
        System.exit(0);
    }
}
