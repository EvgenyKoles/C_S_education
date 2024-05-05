 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingArea extends JPanel {
 
     // You only need to edit the method below.
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      // the size of the circle
      int size = 350;
      // the color (this is blue, believe it or not, play around with different values)
      int icol = 5;
      Color c = new Color(icol);
      g.setColor(c);
      
      // You might want to introduce a loop somewhere here.


      for (int i = 1; i<10; i++){

      g.drawOval((200-size/2)+i*10,(200-size/2)+i*10,size-i*20,size-i*20);

      }
      
    }// the end of the method....

    
}

