package view;

import javax.swing.JFrame;


public class Frame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int width=600;
	public static int height=400;
	
	KeyPlayer1 key1 = new KeyPlayer1();
	KeyPlayer2 key2 = new KeyPlayer2();
	Panel panel = new Panel();
	
	public Frame() {
		Panel panel=new Panel();
		this.setTitle("TRON");
		this.setSize(width, height);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		this.addKeyListener(this.key1);
		this.addKeyListener(this.key2);
	}
	
}


