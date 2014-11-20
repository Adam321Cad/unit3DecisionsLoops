import java.awt.Graphics.*;
import java.awt.Frame.*;
import java.util.*;

public class nerd extends JFrame{
    
    public nerd(){
        super("DWDW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,700);
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
    }
    
}
