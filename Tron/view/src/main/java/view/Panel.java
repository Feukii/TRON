package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel

{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image fond;
	private Image image1;
	private Image image2;
	
	public Panel()
	{
	
	fond = (new ImageIcon("C:/Users/HP/Downloads/fond.jpg")).getImage();
	image1= (new ImageIcon("C:/Users/HP/Documents/PREMIERE ANNEE CESI/SEMESTRE 2/RATTRAPAGE/POO/moto1.png")).getImage();
	image2= (new ImageIcon("C:/Users/HP/Documents/PREMIERE ANNEE CESI/SEMESTRE 2/RATTRAPAGE/POO/moto2.png")).getImage();
	}

	
	public void paintComponent(Graphics g) {
	    
		super.paintComponent(g);
		
		g.drawImage(fond,0,0,this.getWidth(),this.getHeight(),this);
		g.drawImage(image1, KeyPlayer1.joueur1.getPosX(), KeyPlayer1.joueur1.getPosY(), 20, 20, this);
		g.drawImage(image2, KeyPlayer2.joueur2.getPosX(),KeyPlayer2.joueur2.getPosY(), 20, 20, this);
		/*g.setColor(Color.blue);
		g.fillRect(key1.joueur1.getPosX(), key1.joueur1.getPosY(), 10, 10);
		
		g.setColor(Color.orange);
		g.fillRect(key2.joueur2.getPosX(), key2.joueur2.getPosY(), 7, 7);
		*/

		for(int i=0; i< KeyPlayer1.bluewall.size(); i++)
		{
			
	        g.setColor(Color.blue);
			g.fillRect(KeyPlayer1.bluewall.get(i).getX(), KeyPlayer1.bluewall.get(i).getY(), 7, 7);

		}
		
		
		for(int i=0; i< KeyPlayer2.orangewall.size(); i++)
		{			
	        g.setColor(Color.orange);
			g.fillRect(KeyPlayer2.orangewall.get(i).getX(), KeyPlayer2.orangewall.get(i).getY(),7,7);//(a.posX,  a.posY,  10, 10);
			// System.out.println(KeyPlayer1.bluewall.get(i).getX());
			// System.out.println(KeyPlayer1.bluewall.get(i).getY());
		}
		
		
		repaint();
		 
}

	
	public void drawPlayer1()
	{

	}
	
	public void drawPlayer2()
	{

		
	}
}
