// Failas Prima.java
// Pirmoji programa su vartotojo sąsaja
import javax.swing.*;
import java.awt.*;

public class Prima extends JFrame {

   public static void main(String args[]) {
      final int FRAME_WIDTH = 800;
      final int FRAME_HEIGHT = 600;
      Font headlineFont = new Font("Arial", Font.BOLD, 24);
      JFrame aFrame = new JFrame("Programa su grafine vartotojo sąsaja");
      aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      aFrame.setVisible(true);
      aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel greeting = new JLabel("Hi!");
      greeting.setFont(headlineFont);
      greeting.setForeground (Color.green);
      aFrame.setLayout(new GridBagLayout());
      aFrame.add(greeting);
   }
}
