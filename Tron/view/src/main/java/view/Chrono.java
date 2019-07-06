package view;

import java.util.ArrayList;

import model.BlueRect;
import model.Player1;

public class Chrono implements Runnable {
	static boolean up = false;
	static boolean down = false;
	static boolean right= false;
	static boolean left = false;
	static  ArrayList<BlueRect> bluewall = new ArrayList<BlueRect>();
	static Player1 joueur1 = new Player1();
	
	int y;
	int x;
	
	private final int PAUSE = 1;
	
	public void run() {
		
do {
	
	/* y = KeyPlayer1.joueur1.getPosY();
	y++;



	
	KeyPlayer1.joueur1.setPosY(y);*/
	bluewall.add(new BlueRect(joueur1.getPosX()+2, joueur1.getPosY()+2));
	
	if(KeyPlayer1.down== false )
	{
	    up = false;
		 down = true;
		 right = false;
		 left = false;

			/*KeyPlayer1.LEFT=false;
			KeyPlayer1.RIGHT=false;
			KeyPlayer1.UP=false;*/
			int y = KeyPlayer1.joueur1.getPosY();
			y--;
			
			KeyPlayer1.joueur1.setPosY(y);
			
	}

	if(KeyPlayer1.up== false)
	{
		 up = true;
		 down = false;
		 left = false;
		 right = false;

		/*KeyPlayer1.LEFT=false;
		KeyPlayer1.RIGHT=false;
		KeyPlayer1.DOWN= false;*/
			 y = KeyPlayer1.joueur1.getPosY();
			y++;
			
			KeyPlayer1.joueur1.setPosY(y);
			
	}
	if(KeyPlayer1.left==false)
	{
		 up= false;
		 down= false;
		 left = true;
		 right = false;

		/*KeyPlayer1.LEFT=false;
		KeyPlayer1.UP= false;
		KeyPlayer1.DOWN= false;*/
			 x = KeyPlayer1.joueur1.getPosX();
			x++;
			
			KeyPlayer1.joueur1.setPosX(x);
			
	}
	

	if(KeyPlayer1.right== false)
	{
		 up= false;
		 down= false;
		 left = false;
		 right = true;
		/*KeyPlayer1.RIGHT=false;
		KeyPlayer1.UP= false;
		KeyPlayer1.DOWN= false;*/
			 x = KeyPlayer1.joueur1.getPosX();
			x--;
			
			KeyPlayer1.joueur1.setPosX(x);
			
	}

	
			
			//.decor.repaint();
			
			try {
			      Thread.sleep(200);
			    } catch (InterruptedException exc) {
			      exc .printStackTrace();
			    }
			
		/*	if(x== Main.decor.getWidth()) {
				
				Main.decor.missile1.setX(220);
			}*/
			
	}	while(true);	

}
}
