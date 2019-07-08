package view;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import model.OrangeRect;
import model.Player2;


          public class KeyPlayer2 implements KeyListener
  {

        	  /**
        		 * @author FEUKENG
        		 */  
       
        	   
	
	static  ArrayList<OrangeRect> orangewall = new ArrayList<OrangeRect>();
	static Player2 joueur2 = new Player2();
	Collision col = new Collision();
	static boolean up = false;
	static boolean down = false;
	static boolean right= false;
	static boolean left = false;
	protected static boolean play2 = true;
	

	
	
	

	public void keyPressed(KeyEvent e) {
		col.Edge1();
		col.Crash();
		col.crashPlayer1();
		col.Edge2();
		col.owncrashPlayer1();
		col.owncrashPlayer2();
		// TODO Auto-generated method stub
		if(play2 == true) {
		if (e.getKeyCode()==KeyEvent.VK_Z) {
			 up = true;
			 down = false;
			right= false;
			 left = false;
			orangewall.add(new OrangeRect(joueur2.getPosX()+10, joueur2.getPosY()+10));
			joueur2.setPosY(joueur2.getPosY()-1);
			System.out.println(joueur2.getPosY());
		}

		}
		
		if(play2 == true) {		
         if (e.getKeyCode()==KeyEvent.VK_S) {
			up = false;
			 down = true;
			right= false;
			 left = false;
			
			orangewall.add(new OrangeRect(joueur2.getPosX()-10, joueur2.getPosY()-10));
			joueur2.setPosY(joueur2.getPosY()+1);
         }	
		}
		
		if(play2 == true) {
		 if (e.getKeyCode()==KeyEvent.VK_D) {
			up = false;
			 down = false;
			right= true;
			 left = false;
			orangewall.add(new OrangeRect(joueur2.getPosX()-10, joueur2.getPosY()-10));
			joueur2.setPosX(joueur2.getPosX()+1);
		       System.out.println(joueur2.getPosX() + " " + joueur2.getPosY());

		}
		}
		if(play2 == true) {
		 if (e.getKeyCode()==KeyEvent.VK_Q) {
			up = false;
			 down = false;
			right= false;
			 left = true;

			orangewall.add(new OrangeRect(joueur2.getPosX()+10, joueur2.getPosY()+10));
			joueur2.setPosX(joueur2.getPosX()-1);
		       System.out.println(joueur2.getPosX() + " " + joueur2.getPosY());

		}
		}
		
		else 
		{
			up = false;
			 down = false;
			right= false;
			 left = false;
			orangewall.add(new OrangeRect(joueur2.getPosX()+5, joueur2.getPosY()+5));
		}
		}
		
	

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}





	
	
	
	
  }
