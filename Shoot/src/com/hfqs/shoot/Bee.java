package com.hfqs.shoot;

import java.util.Random;

/**
 * �۷�
 * @author hanfuqingshi
 *
 */
public class Bee extends FlyingObject implements Enemy {
	private int xSpeed = 1;//x�����ƶ�������ٶ�
	private int ySpeed = 1;//y���귽����ƶ��ٶ�
	private int awardType;//��������
	
	public Bee() {
		this.image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		y-=height;
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH-width);
		awardType = rand.nextInt(2);
				
	}
	public int getScore() {
		return 0;
	}
}
