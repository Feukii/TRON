package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import model.OrangeRect;
import model.Player2;


          public class KeyPlayer2 implements KeyListener
  {

	
	static  ArrayList<OrangeRect> orangewall = new ArrayList<OrangeRect>();
	static Player2 joueur2 = new Player2();
	Collision col = new Collision();
	static boolean up = false;
	static boolean down = false;
	static boolean right= false;
	static boolean left = false;

	
	
	

	public void keyPressed(KeyEvent e) {
		col.Edge();
		
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_Z) {
		  
			
			 up = true;
			 down = false;
			right= false;
			 left = false;

			orangewall.add(new OrangeRect(joueur2.getPosX()+2, joueur2.getPosY()+2));
			joueur2.setPosY(joueur2.getPosY()-1);
			System.out.println(joueur2.getPosY());
			//for(int i=0; i< bluewall.size(); i++)				
		   //    System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		
		else if (e.getKeyCode()==KeyEvent.VK_S) {
			up = false;
			 down = true;
			right= false;
			 left = false;
			
			orangewall.add(new OrangeRect(joueur2.getPosX()+2, joueur2.getPosY()+2));
			joueur2.setPosY(joueur2.getPosY()+1);
		       System.out.println(joueur2.getPosX() + " " + joueur2.getPosY());

			
		}
		
		else if (e.getKeyCode()==KeyEvent.VK_D) {
			up = false;
			 down = false;
			right= true;
			 left = false;

			 
			orangewall.add(new OrangeRect(joueur2.getPosX()+2, joueur2.getPosY()+2));
			joueur2.setPosX(joueur2.getPosX()+1);
		       System.out.println(joueur2.getPosX() + " " + joueur2.getPosY());

		}
		
		else if (e.getKeyCode()==KeyEvent.VK_Q) {
			up = false;
			 down = false;
			right= false;
			 left = true;

			orangewall.add(new OrangeRect(joueur2.getPosX()+2, joueur2.getPosY()+2));
			joueur2.setPosX(joueur2.getPosX()-1);
		       System.out.println(joueur2.getPosX() + " " + joueur2.getPosY());

		}
		
		/*else 
		{
			up = true;
			 down = false;
			right= true;
			 left = true;
		}*/
		}
		
	

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}





	
	
	
	
  }
