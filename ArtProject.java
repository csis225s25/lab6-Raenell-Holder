import java.awt.*;
import javax.swing.*;

/**
 * Lab 6 starter example
 * 
 * @author Jim Teresco
 * @author Ira Goldstein
 * @version Spring 2025
 */

// a class that extends JPanel to override the paintComponent method,
// allowing us to interact with Java's graphics system
class GraphicsPanel extends JPanel {


    @Override
    public void paintComponent(Graphics g) {

        // first, we should call the paintComponent method we are
        // overriding in JPanel
        super.paintComponent(g);
        int x= (getWidth());
        int y= (getHeight());
        g.setColor(Color.PINK);
        g.fillRect(0,0,x,y);
        g.setColor(Color.BLUE);
        g.fillArc(0,0,1000,1000,-225,-90);
        g.setColor(Color.MAGENTA);
        g.fillArc(250,200,500,500,-225,-90);
        //home plate
        g.setColor(Color.WHITE);
        g.fillRect(500,410,20,20);
        g.setColor(Color.WHITE);
        g.fillRect(500,225,20,20);
        g.setColor(Color.WHITE);
        g.fillRect(350,265,20,20);
        g.setColor(Color.WHITE);
        g.fillRect(625,270,20,20);
        g.setColor(Color.WHITE);
        g.fillRect(500,320,20,10);
        g.drawOval(490,305,40,40);
        g.drawLine(500,425,780,150);
        g.drawLine(500,425,250,150);
        g.fillOval(100,400,200,200);
        

         


        
       
    }
}

public class ArtProject implements Runnable {

    /**
     * The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        // the usual JFrame setup steps
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("HelloGraphics");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel with a custom paintComponent method
        JPanel panel = new GraphicsPanel();
        frame.add(panel);

        // display the window we've created
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new ArtProject());
    }
}
