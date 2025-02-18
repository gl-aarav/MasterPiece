/*
 * 2-14-2025
 * Aarav Goyal
 * Masterpiece.java
 * 
 * This program will draw three Flowers and print "Flower" on the bottom.
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
        //drawGrid(g);
        drawFlower(g, 290, 200); 
        drawFlower(g, 100, 250); 
        drawFlower(g, 450, 230);
    }
    
    public void drawFlower(Graphics g, int x, int y)
    {   
    	
         
        g.setColor(new Color(34, 139, 34)); 
        g.fillRect(x, y, 20, 150);
        
        g.setColor(new Color(151, 113, 16));
        g.fillRect(0, 350, 600, 150);
        
        g.setColor(new Color(34, 139, 34)); 
        g.fillRect(0, 350, 600, 10);
        
        for (int i = 0; i < 600; i+=5)
        {
        	g.fillRect(i, 342, 2, 8);
        }
        
        g.setColor(new Color(0, 128, 0)); 
        int[] leafX1 = {x - 10, x - 40, x};
        int[] leafY1 = {y + 50, y + 80, y + 70};
        g.fillPolygon(leafX1, leafY1, 3);
        
        int[] leafX2 = {x + 20, x + 60, x + 30};
        int[] leafY2 = {y + 70, y + 80, y + 50};
        g.fillPolygon(leafX2, leafY2, 3);
        g.setColor(Color.RED);
        g.fillArc(x - 20, y - 70, 60, 60, 0, 180); 
        g.fillArc(x - 40, y - 50, 60, 60, 90, 180); 
        g.fillArc(x + 2, y - 50, 60, 60, 270, 180); 
        g.fillArc(x - 18, y - 30, 60, 60, 180, 180); 
        
        g.setColor(Color.PINK);
        g.fillOval(x - 50, y - 80, 60, 60); 
        g.fillOval(x + 10, y - 80, 60, 60); 
        g.fillOval(x - 50, y - 20, 60, 60);
        g.fillOval(x + 10, y - 20, 60, 60); 
        
        g.setColor(Color.YELLOW);
        g.fillOval(x - 15, y - 45, 50, 50);
       
        g.setColor(Color.BLACK);
        g.drawLine(x + 20, y + 3, x, y - 43);
        g.drawLine(x, y + 3, x + 20, y - 43);
        g.drawLine(x - 15, y - 20, x + 35, y - 20);
        g.fillOval(x + 5, y - 25, 10, 10); 
        
        g.setColor(Color.WHITE);
        g.fillRect(45,50,100,50);
        g.fillOval(53,5,90,90);
        g.fillOval(20,50,50,50);
        g.fillOval(125,50,50,50);
        
        g.fillRect(445,50,100,50);
        g.fillOval(453,5,90,90);
        g.fillOval(420,50,50,50);
        g.fillOval(525,50,50,50);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("serif", Font.PLAIN, 40));
        g.drawString("Flower", x-210, 425);
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
