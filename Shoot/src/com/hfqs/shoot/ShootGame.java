package com.hfqs.shoot;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ShootGame extends JPanel{
	public static final int WIDTH = 400;//Ãæ°å¿í
	public static final int HEIGHT = 645;//Ãæ°å¸ß
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage airplane;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage pause;
	public static BufferedImage gameover;
	
	//¾²Ì¬´úÂë¿é
	static {
		try {
			background = ImageIO.read(ShootGame.class.getResource("background.png"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
