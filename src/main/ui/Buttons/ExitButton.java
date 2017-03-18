package main.ui.Buttons;

import main.Game;

/**
 * Created by Jared H on 3/18/2017.
 */
public class ExitButton extends Button {

    public ExitButton(int x, int y){
        super(x, y, "Exit");

    }
    @Override
    public void action() {
        System.exit(0);
    }
}
