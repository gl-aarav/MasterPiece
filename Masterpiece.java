/*
 * 2-14-2025
 * Aarav Goyal
 * Masterpiece.java
 * 
 * This program will draw a Flower and print "Flower" on the bottom.
 */ 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Masterpiece
{
    public static void main(String[] args) 
    {
        Masterpiece mp = new Masterpiece();
        mp.runIt();
    }
    
    public void runIt()
    {
        JFrame frame = new JFrame("Flower Masterpiece");
        frame.setSize(600, 500);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);       
        MasterpiecePanel mpPanel = new MasterpiecePanel();
        frame.getContentPane().add(mpPanel);
        frame.setVisible(true);
    }
}   

class MasterpiecePanel extends JPanel
{
    public MasterpiecePanel()
    {
        setBackground(new Color(0, 166, 255));
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawGrid(g);
        drawFlower(g);
    }
    
    public void drawFlower(Graphics g)
    {	
        g.setColor(new Color(34, 139, 34)); 
        g.fillRect(290, 200, 20, 150);
        
        g.setColor(new Color(151, 113, 16));
      //  g.fillRect(
        
        g.setColor(new Color(0, 128, 0)); 
        int[] leafX1 = {280, 250, 290};
        int[] leafY1 = {250, 280, 270};
        g.fillPolygon(leafX1, leafY1, 3);
        
        int[] leafX2 = {310, 350, 320};
        int[] leafY2 = {270, 280, 250};
        g.fillPolygon(leafX2, leafY2, 3);
        
        g.setColor(Color.PINK);
        g.fillOval(250, 130, 50, 50); 
        g.fillOval(300, 130, 50, 50); 
        g.fillOval(250, 180, 50, 50);
        g.fillOval(300, 180, 50, 50); 
        g.fillArc(275, 130, 50, 50, 0, 180);
        
        g.setColor(Color.YELLOW);
        g.fillOval(275, 155, 50, 50);
       
        g.setColor(Color.BLACK);
        g.drawLine(310, 203, 290, 157);
        g.drawLine(290, 203, 310, 157);
        g.drawLine(275, 180, 325, 180);
        g.fillOval(295, 175, 10, 10); 
        
        g.drawString("Flower", 280, 400);
        
       
    }
    
    public void drawGrid(Graphics g)
    {
        int size = 10;
        g.setFont(new Font("serif", Font.PLAIN, 15));
        for(int x = 0; x <= 600; x += size)
        {
            g.setColor(new Color(200, 200, 200));
            g.drawLine(x, 0, x, 460);
            if(x % 100 == 0)
            {
                g.setColor(Color.BLACK);
                g.drawString(x + "", x - 12, 12);
            }
        }

        for(int y = 0; y <= 460; y += size)
        {
            g.setColor(new Color(200, 200, 200));
            g.drawLine(0, y, 600, y);
            if(y % 100 == 0)
            {
                g.setColor(Color.BLACK);
                g.drawString(y + "", 0, y + 3);
            }
        }
    }
}
