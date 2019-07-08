package view;

import javax.swing.JOptionPane;

import model.Database;
import model.Gestion;

public class Manage {
	
	static boolean jouer = true;
	static String win;
	static long temps_début= System.currentTimeMillis();
	static long temps_jeu;
	// TODO Auto-generated constructor stub
	
	/**
	 * @return the tab
	 */
	@SuppressWarnings("unused")
	public static Gestion manage() {
		Gestion tab = new Gestion();
		if (jouer == true) {	
			if(KeyPlayer1.play == true && KeyPlayer2.play2== false) {
				jouer = false;
				win = "joueur1";
				temps_jeu = Collision.temps - temps_début;
				JOptionPane.showMessageDialog(null, Manage.win,"Resultat", JOptionPane.PLAIN_MESSAGE);

				Database envoi = new Database();
				System.out.println(temps_jeu + " " + win);
				Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				
			}
			if(KeyPlayer1.play == false && KeyPlayer2.play2== true) {
				jouer = false;
				win ="joueur2";
				temps_jeu = Collision.temps - temps_début;
				JOptionPane.showMessageDialog(null, Manage.win,"Resultat", JOptionPane.PLAIN_MESSAGE);
				Database envoi = new Database();
				System.out.println(temps_jeu + " " + win);
				Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}
			if( KeyPlayer1.play == false && KeyPlayer2.play2== false) {
				jouer = false;
				win = "Personne";
				temps_jeu = Collision.temps - temps_début;
				JOptionPane.showMessageDialog(null, Manage.win,"Resultat", JOptionPane.PLAIN_MESSAGE);
				Database envoi = new Database();
				System.out.println(temps_jeu + " " + win);
				Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				
			}
			else {
				jouer = true;
			}	
		
			for(int i = 0; i < KeyPlayer1.bluewall.size(); i++) {
			//QUAND IL RENCONTRE SON PROPRE MUR	JOUEUR 1
				if(KeyPlayer1.bluewall.get(i).getX() == KeyPlayer1.joueur1.getPosX() && KeyPlayer1.bluewall.get(i).getY() == KeyPlayer1.joueur1.getPosY()){
					jouer = false;
					win = "joueur2";
					temps_jeu = Collision.temps - temps_début;
					JOptionPane.showMessageDialog(null, Manage.win,"Resultat", JOptionPane.PLAIN_MESSAGE);

					Database envoi = new Database();
					System.out.println(temps_jeu + " " + win);
					Thread.currentThread();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);
				}
				else
					jouer = true;
			}
			
			for(int j=0; j <KeyPlayer2.orangewall.size(); j++) {
			//QUAND IL RENCONTRE SON PROPRE MUR JOUEUR 2
				if(KeyPlayer2.orangewall.get(j).getX() == KeyPlayer2.joueur2.getPosX()  && KeyPlayer2.orangewall.get(j).getY() ==KeyPlayer2.joueur2.getPosY()) {
					jouer = false;
					win = "joueur1";
					temps_jeu = Collision.temps - temps_début;
					JOptionPane.showMessageDialog(null, Manage.win,"Resultat", JOptionPane.PLAIN_MESSAGE);

					Database envoi = new Database();
					System.out.println(temps_jeu + " " + win);
					Thread.currentThread();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);	
					
				}
				else
					jouer = true;
				
			}
		
		}
		
		//JOptionPane.showMessageDialog(this, win,"Resultat", JOptionPane.PLAIN_MESSAGE);
		
		tab.setWinner(win);
		tab.setValeur(jouer);
		tab.setTime((int) temps_jeu);
		return tab;
	}
}
