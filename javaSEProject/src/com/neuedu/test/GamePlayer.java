package com.neuedu.test;

import java.util.Random;

/**
 * @author neuedu_yhl
 * @version 1.0
 * @since 08.07
 * */
public class GamePlayer {

	// 姓名
	public String name;
	
	// 性别
	public char sex;
	
	// 种族
	public int race;
	
	// 职业
	public String professional;
	
	
	// 力量
	public int power;
	
	
	// 敏捷
	public int agile;
	
	// 体力
	public int physicalPower;
	
	// 智慧
	public int wisdom;
	
	// 智力
	public int intelligence;
	
	// 生命值
	public int hp;
	
	// 魔法值
	public int mp;
	
	
	// 随机生成力量的方法
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	
	// 其它生成的方法。。。
	
}