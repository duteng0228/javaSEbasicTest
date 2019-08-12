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
	@Override
	public String toString() {
		return "Rpg_hero [name=" + name + ", sex=" + sex + ", race=" + race + ", vocation=" + vocation + ", power="
				+ power + ", agile=" + agile + ", strength=" + strength + ", intellect=" + intellect + ", wisdom="
				+ wisdom + ", hp=" + hp + ", mp=" + mp + "]";
	}
	
	
}
