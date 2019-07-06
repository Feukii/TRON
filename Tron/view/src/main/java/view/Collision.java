package view;

public class Collision {
	
	
	
	
	
	
	
	public void Edge()
	{
	
		//Player1
		
		if (KeyPlayer1.joueur1.getPosX() == 1) {
			KeyPlayer1.joueur1.setPosX(1500);
			KeyPlayer1.joueur1.setPosX(KeyPlayer1.joueur1.getPosY());
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
	}

	}
