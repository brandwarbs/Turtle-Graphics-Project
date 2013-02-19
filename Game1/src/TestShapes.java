
import TurtleGraphics.*;

import java.awt.Color;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestShapes extends JPanel implements ActionListener{
	Timer time;
	protected Pen p = new StandardPen();
	protected Shape s4 = new Rect(-40, 40, 40, 40);
	public TestShapes(){
		addKeyListener(new AL ());
		time = new Timer(5, this);
		time.start();
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
	
	public void paint(Graphics g){
		s4.draw(p);
	}
	
	private class AL extends KeyAdapter{
		/*public void keyReleased(KeyEvent e){
			p.keyReleased(e);
		}
		public void keyPressed(KeyEvent e){
			p.keyPressed(e);
		}*/
	}

	
	
   public static void main (String[] args)
   {
	  
      
      
      // Pause until the user is ready to continue
      System.out.print("Press <Enter> to continue: ");
      Scanner reader = new Scanner(System.in);
      reader.nextLine();
      
   }

}

