

package movingpixelstest;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author cahin7692
 */
public class MovingPixelsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int right = 500;
        int down = 250;
    JFrame mainFrame = new JFrame();
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyCanvas sadraGraphics = new MyCanvas(right, down);
    sadraGraphics.setPreferredSize((new Dimension(right, down)));
    mainFrame.getContentPane().add(sadraGraphics);
    mainFrame.pack();
    mainFrame.setVisible(true);
  }
}
