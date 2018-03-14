package com.hfqs.shoot;
/**
 * 英雄机：是飞行物
 * @author hanfuqingshi
 *
 */

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	protected BufferedImage[] images = {};//英雄贴图
	protected int index = 0;//贴图交替显示的计数
	
	private int doubleFire;
	private int life;
}
