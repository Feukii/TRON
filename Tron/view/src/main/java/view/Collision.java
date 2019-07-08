package view;

import contract.ObjetJeu;

public class Collision implements ObjetJeu{
	
	
	/**
	 * @author FEUKENG
	 */
	/*public boolean crash= false;
	public boolean crashPlayer1=false;
	public boolean crashPlayer2=false;
	public boolean owncrashp1= false;
	public boolean owncrashp2=false;*/
	
	static long temps;
	
	static boolean up = false;
	static boolean down = false;
	static boolean right= false;
	static boolean left = false;
	
	public void Edge1()
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
	}
		
		public void Edge2()
		{
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
		 if(Manage.manage().isValeur() == true) {
				if(KeyPlayer1.joueur1.getPosX() == KeyPlayer2.joueur2.getPosX() && KeyPlayer1.joueur1.getPosY() == KeyPlayer2.joueur2.getPosY() ) {
					KeyPlayer2.play2 = false;
					KeyPlayer1.play = false;
					temps = System.currentTimeMillis();
				}
			}		
	}	

// Player1 itself
	 
	 
	 public void crashPlayer1()
	 {
		 if(Manage.manage().isValeur() == true) {
				
				for(int i = 0; i < KeyPlayer1.bluewall.size(); i++) {
					for(int j=0; j < KeyPlayer2.orangewall.size(); j++) {
					//QUAND IL RENCONTRE LE MUR ADVERSE joueur2 vs mur1
						if(KeyPlayer1.bluewall.get(i).getX() == KeyPlayer2.joueur2.getPosX() && KeyPlayer1.bluewall.get(i).getY() == KeyPlayer2.joueur2.getPosY()){
							KeyPlayer2.play2 = false;
							temps = System.currentTimeMillis();
						}
					// QUAND IL RENCONTRE LE MUR ADVERSE joueur1 vs mur2
						if(KeyPlayer2.orangewall.get(j).getX() == KeyPlayer1.joueur1.getPosX() && KeyPlayer2.orangewall.get(j).getY() == KeyPlayer1.joueur1.getPosY()) {
							KeyPlayer1.play = false;
							temps = System.currentTimeMillis();
							
						}
					}	
				}
			}
	 }
	 
	 public void owncrashPlayer1()
	 {
		 if(Manage.manage().isValeur() == true) {
				for(int i = 0; i < KeyPlayer1.bluewall.size(); i++) {
					//QUAND IL RENCONTRE SON PROPRE MUR	JOUEUR 1
					if(KeyPlayer1.bluewall.get(i).getX() == KeyPlayer1.joueur1.getPosX()  && KeyPlayer1.bluewall.get(i).getY() == KeyPlayer1.joueur1.getPosY() ){
						KeyPlayer1.play = false;
						temps = System.currentTimeMillis();
					}
					
				}
			}
		}

	
		
		 
	
	 public void  owncrashPlayer2()
	 {
		 if(Manage.manage().isValeur() == true) {
				for(int j=0; j < KeyPlayer2.orangewall.size(); j++) {
					//QUAND IL RENCONTRE SON PROPRE MUR JOUEUR 2
					if(KeyPlayer2.orangewall.get(j).getX() ==KeyPlayer2.joueur2.getPosX()  && KeyPlayer2.orangewall.get(j).getY() == KeyPlayer2.joueur2.getPosY()) {
						KeyPlayer2.play2 = false;
						temps = System.currentTimeMillis();
						
					}
				}
			}
}
	 }	
	
