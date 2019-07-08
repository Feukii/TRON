package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import model.BlueRect;
import model.Player1;

/*
 * 
 */

          public class KeyPlayer1 implements KeyListener
  {

	
	static  ArrayList<BlueRect> bluewall = new ArrayList<BlueRect>();
	static Player1 joueur1 = new Player1();
	Collision col = new Collision();
	static boolean up = false;
	static boolean down = false;
	static boolean right= false;
	static boolean left = false;
	protected static boolean play = true;
	
	
	

	public void keyPressed(KeyEvent e) {
		col.Edge1();
		col.Crash();
		col.crashPlayer1();
		col.Edge2();
		col.owncrashPlayer1();
		col.owncrashPlayer2();
		
		// TODO Auto-generated method stub
		if(play == true) {
		if (e.getKeyCode()==KeyEvent.VK_UP ) {
		  
			 up = true;
			 down = false;
			right= false;
			 left = false;

			bluewall.add(new BlueRect(joueur1.getPosX()+10, joueur1.getPosY()+10));
			joueur1.setPosY(joueur1.getPosY()-1);
			System.out.println(joueur1.getPosY());
			//for(int i=0; i< bluewall.size(); i++)				
		   //    System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		}
		if(play == true) {
		 if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			up = false;
			 down = true;
			right= false;
			 left = false;
			bluewall.add(new BlueRect(joueur1.getPosX()-10, joueur1.getPosY()-10));
			joueur1.setPosY(joueur1.getPosY()+1);
		       System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		 }
		}
		 
		if(play == true) {
	         if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			up = false;
			 down = false;
			right= true;
			 left = false;

			 
			bluewall.add(new BlueRect(joueur1.getPosX()-10, joueur1.getPosY()-10));
			joueur1.setPosX(joueur1.getPosX()+1);
		       System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		}
		
		if(play == true) {
		 if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			up = false;
			 down = false;
			right= false;
			 left = true;

			bluewall.add(new BlueRect(joueur1.getPosX()+10, joueur1.getPosY()+10));
			joueur1.setPosX(joueur1.getPosX()-1);
		       System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		}
	
		else 
		{
			up = false;
			 down = false;
			right= false;
			 left = false;
			bluewall.add(new BlueRect(joueur1.getPosX()+5, joueur1.getPosY()+5));
		}
		}
		
	

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	
	
	
	
  }
