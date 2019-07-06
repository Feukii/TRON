package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener

{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static long temps;
	private Image fond;
	private Image image1;
	private Image image2;
	public   Timer chrono = new Timer(10, this);
	public  Timer chrono2 = new Timer(1,this);
	int dx = 0;
	int dx2 =0;
	
	public Panel()
	{
	
	fond = (new ImageIcon("C:/Users/HP/Downloads/fond.jpg")).getImage();
	image1= (new ImageIcon("C:/Users/HP/Documents/PREMIERE ANNEE CESI/SEMESTRE 2/RATTRAPAGE/POO/moto1.png")).getImage();
	image2= (new ImageIcon("C:/Users/HP/Documents/PREMIERE ANNEE CESI/SEMESTRE 2/RATTRAPAGE/POO/moto2.png")).getImage();
	Thread chronoEcran = new Thread(new Chrono());
	Thread ChronoEcran2 = new Thread( new Chrono2());
	chronoEcran.start();
	ChronoEcran2.start();
	chrono.start();
	chrono2.start();
	
	}

	
	public void paintComponent(Graphics g) {
	    
		super.paintComponent(g);
		
		g.drawImage(fond,0,0,this.getWidth(),this.getHeight(),this);
		g.drawImage(image1, KeyPlayer1.joueur1.getPosX(), KeyPlayer1.joueur1.getPosY(), 20, 20, this);
		g.drawImage(image2, KeyPlayer2.joueur2.getPosX(),KeyPlayer2.joueur2.getPosY(), 20, 20, this);
		/*g.setColor(Color.blue);
		g.fillRect(KeyPlayer1.joueur1.getPosX(), KeyPlayer1.joueur1.getPosY(), 10, 100);
		
		g.setColor(Color.orange);
		g.fillRect(key2.joueur2.getPosX(), key2.joueur2.getPosY(), 7, 7);*/
		
 
		for(int i=0; i< KeyPlayer1.bluewall.size(); i++)
		{
			
	        g.setColor(Color.blue);
			g.fillRect(KeyPlayer1.bluewall.get(i).getX()+dx, KeyPlayer1.bluewall.get(i).getY()+dx , 10, 10);

		}
		
		
		for(int i=0; i< KeyPlayer2.orangewall.size(); i++)
		{			
	        g.setColor(Color.orange);
			g.fillRect(KeyPlayer2.orangewall.get(i).getX()+dx2, KeyPlayer2.orangewall.get(i).getY()+dx2,10,10);//(a.posX,  a.posY,  10, 10);
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


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
