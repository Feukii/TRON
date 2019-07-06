package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import model.BlueRect;
import model.Player1;


public class KeyPlayer1 implements KeyListener
  {

	
	static  ArrayList<BlueRect> bluewall = new ArrayList<BlueRect>();
	static Player1 joueur1 = new Player1();
	Collision col = new Collision();
	 
	         
	 
	public void keyPressed(KeyEvent e) {
		col.Edge();
		
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_UP ) {
			bluewall.add(new BlueRect(joueur1.getPosX(), joueur1.getPosY()));
			joueur1.setPosY(joueur1.getPosY()-1);
			System.out.println(joueur1.getPosY());
			//for(int i=0; i< bluewall.size(); i++)				
		   //    System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			bluewall.add(new BlueRect(joueur1.getPosX(), joueur1.getPosY()));
			joueur1.setPosY(joueur1.getPosY()+1);
		       System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

			
		}
		
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			bluewall.add(new BlueRect(joueur1.getPosX(), joueur1.getPosY()));
			joueur1.setPosX(joueur1.getPosX()+1);
		       System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			bluewall.add(new BlueRect(joueur1.getPosX(), joueur1.getPosY()));
			joueur1.setPosX(joueur1.getPosX()-1);
		       System.out.println(joueur1.getPosX() + " " + joueur1.getPosY());

		}
		}
		
		
		
	

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    
	
	
	
  }
