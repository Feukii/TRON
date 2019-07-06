package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


import model.OrangeRect;

import model.Player2;

public class KeyPlayer2 implements KeyListener
  {
    
	 static ArrayList<OrangeRect> orangewall = new ArrayList<OrangeRect>();
	 static Player2 joueur2 = new Player2();
	
	 
	 
	 
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_Z) {
			orangewall.add(new OrangeRect(joueur2.getPosX(), joueur2.getPosY()));
			joueur2.setPosY(joueur2.getPosY()-1);
			
		}
		
		if (e.getKeyCode()==KeyEvent.VK_S) {
			orangewall.add(new OrangeRect(joueur2.getPosX(), joueur2.getPosY()));
			joueur2.setPosY(joueur2.getPosY()+1);
			
		}
		
		
		if (e.getKeyCode()==KeyEvent.VK_D) {
			orangewall.add(new OrangeRect(joueur2.getPosX(), joueur2.getPosY()));
			joueur2.setPosX(joueur2.getPosX()+1);
			
		}
		if (e.getKeyCode()==KeyEvent.VK_Q) {
			orangewall.add(new OrangeRect(joueur2.getPosX(), joueur2.getPosY()));
			joueur2.setPosX(joueur2.getPosX()-1);
			
		}
		}
		
		
	

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    
	
	
	
  }
