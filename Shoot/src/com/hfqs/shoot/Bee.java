package com.hfqs.shoot;

import java.util.Random;

/**
 * 蜜蜂
 * @author hanfuqingshi
 *
 */
public class Bee extends FlyingObject implements Enemy {
	private int xSpeed = 1;//x坐标移动方向的速度
	private int ySpeed = 1;//y坐标方向的移动速度
	private int awardType;//奖励类型
	
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
