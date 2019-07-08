package view;
public class Chrono2 implements Runnable {
	static boolean up = false;
	static boolean down = false;
	static boolean right= false;
	static boolean left = false;

	
	int y;
	int x;
	
	/**
	 * @author FEUKENG
	 */
	
	public void run() {
		
do {
	
	
	
	if(KeyPlayer2.down== false )
	{
	    up = false;
		 down = true;
		 right = false;
		 left = false;

			/*KeyPlayer1.LEFT=false;
			KeyPlayer1.RIGHT=false;
			KeyPlayer1.UP=false;*/
			int y = KeyPlayer2.joueur2.getPosY();
			y--;
			
			KeyPlayer2.joueur2.setPosY(y);
			
	}

	if(KeyPlayer2.up== false)
	{
		 up = true;
		 down = false;
		 left = false;
		 right = false;

		/*KeyPlayer1.LEFT=false;
		KeyPlayer1.RIGHT=false;
		KeyPlayer1.DOWN= false;*/
			 y = KeyPlayer2.joueur2.getPosY();
			y++;
			
			KeyPlayer2.joueur2.setPosY(y);
			
	}
	if(KeyPlayer2.left==false)
	{
		 up= false;
		 down= false;
		 left = true;
		 right = false;

		/*KeyPlayer1.LEFT=false;
		KeyPlayer1.UP= false;
		KeyPlayer1.DOWN= false;*/
			 x = KeyPlayer2.joueur2.getPosX();
			x++;
			
			KeyPlayer2.joueur2.setPosX(x);
			
	}
	

	if(KeyPlayer2.right== false)
	{
		 up= false;
		 down= false;
		 left = false;
		 right = true;
	
			 x = KeyPlayer2.joueur2.getPosX();
			x--;
			
			KeyPlayer2.joueur2.setPosX(x);
			
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
