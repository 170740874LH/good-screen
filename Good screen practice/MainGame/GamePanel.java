package ;
import javax.swing.JPanel;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import java.awt.Graphics;
public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    GamePanel () {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs());
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect (150, 150, 50, 50);
    }
}
