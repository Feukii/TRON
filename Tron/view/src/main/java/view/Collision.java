package view;

public class Collision {
	
	
	
	
	
	long temps;
	Panel panel = new Panel();
	
	public void Edge()
	{
	
		//Player1
		
		if (KeyPlayer1.joueur1.getPosX() <= 1) {
			KeyPlayer1.joueur1.setPosX(Frame.width-20);
			KeyPlayer1.joueur1.setPosY(KeyPlayer1.joueur1.getPosY());
		}
	
		if (KeyPlayer1.joueur1.getPosX() == (Frame.width)-19) {
			KeyPlayer1.joueur1.setPosX(1);
			KeyPlayer1.joueur1.setPosY(KeyPlayer1.joueur1.getPosY());
		}
	
	
		if (KeyPlayer1.joueur1.getPosY() == 0) {
			KeyPlayer1.joueur1.setPosX(KeyPlayer1.joueur1.getPosX());
			KeyPlayer1.joueur1.setPosY(Frame.height-40);
		}
	
		if 	(KeyPlayer1.joueur1.getPosY() == (Frame.height)-39) {
			KeyPlayer1.joueur1.setPosY(1);
			KeyPlayer1.joueur1.setPosX(KeyPlayer1.joueur1.getPosX());
		}
		
		//Player2
		

		if (KeyPlayer2.joueur2.getPosX() <= 1) {
			KeyPlayer2.joueur2.setPosX(Frame.width-20);
			KeyPlayer2.joueur2.setPosY(KeyPlayer2.joueur2.getPosY());
		}
	
		if (KeyPlayer2.joueur2.getPosX() == (Frame.width)-19) {
			KeyPlayer2.joueur2.setPosX(1);
			KeyPlayer2.joueur2.setPosY(KeyPlayer2.joueur2.getPosY());
		}
	
	
		if (KeyPlayer2.joueur2.getPosY() == 0) {
			KeyPlayer2.joueur2.setPosX(KeyPlayer2.joueur2.getPosX());
			KeyPlayer2.joueur2.setPosY(Frame.height-40);
		}
	
		if 	(KeyPlayer2.joueur2.getPosY() == (Frame.height)-39) {
			KeyPlayer2.joueur2.setPosY(1);
			KeyPlayer2.joueur2.setPosX(KeyPlayer2.joueur2.getPosX());
		}
	}
	
	
	 public void Crash()
	{
		 
				
					if(KeyPlayer1.joueur1.getPosX() == KeyPlayer2.joueur2.getPosX() && KeyPlayer1.joueur1.getPosY() == KeyPlayer2.joueur2.getPosY() ) 
					{
						panel.chrono. stop();
						panel.chrono2. stop();
						temps = System.currentTimeMillis();
					}
				}	


	}

	
