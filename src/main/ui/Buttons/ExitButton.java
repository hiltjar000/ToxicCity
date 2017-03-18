package main.ui.Buttons;

import java.awt.*;

/**
 * Created by Jared H on 3/18/2017.
 */
public class ExitButton extends main.ui.Button {

    public ExitButton(int x, int y, Color color){
        super(x, y, "Exit", color);

    }
    @Override
    public void action() {
        System.exit(0);
    }
}
