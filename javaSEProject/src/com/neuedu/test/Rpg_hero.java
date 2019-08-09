package com.neuedu.test;
import java.util.*;

public class Rpg_hero {
	// 声明变量
	// 姓名
	String name;
	// 性别
	char sex;
	// 种族
	int race;
	// 职业
	String vocation;
	int power;
	// 敏捷
	int agile;
	// 体力
	int strength;
	// 智力
	int intellect;
	// 智慧
	int wisdom;
	// 生命值
	int hp;
	// 魔法值
	int mp;
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	public int getagile() {
		Random random = new Random();
		int nextInt = random.nextInt();
		return nextInt;
	}
	public int getstrength() {
		Random random = new Random();
		int nextInt = random.nextInt();
		return nextInt;
	}
	public int getintellect() {
		Random random = new Random();
		int nextInt = random.nextInt();
		return nextInt;
	}
	
}
