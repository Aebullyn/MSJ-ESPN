import java.awt.*;

import javax.swing.JPanel;

public class MyPanel extends JPanel
{
    MyPanel()
    {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.yellow);
        g2D.fillOval(100,100,300,300);
        g2D.setPaint(Color.black);
        g2D.drawOval(100,100,300,300);
        g2D.fillOval(150,200,25,25);
        g2D.fillOval(325,200,25,25);
        g2D.drawArc(150,200,200,150, 0,-180);
        // g2D.drawLine(0, 0, 500, 500);

//        g2D.drawRect(0,0,100,200);
//        g2D.setPaint(Color.pink);
//        g2D.fillRect(0,0,100,200);
    }
}
