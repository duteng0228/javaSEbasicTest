package com.neuedu.test;
import java.util.*;

public class game {
	public static void main(String[] args) {
		Welcome();
	}
	// 写一个方法，输出欢迎界面
	public static void Welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("===这是一个RPG游戏===");
		System.out.println("=================");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.结束游戏");
		System.out.println("请输入您想进行的操作(1-3):");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			// 开始游戏
			creatNewPlayer();
			break;
		case 2:
			// 游戏规则
			gameRules();
			Welcome();
			break;
		case 3:
			// 结束游戏
			gameOver();
			break;
		default:
			System.out.println("输入有误，重新输入");
			Welcome();
		}
	}
	public static void creatNewPlayer() {
		// 创建一个数组存放游戏角色信息
		Rpg_hero[] players = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入角色的姓名：");
		String name = scanner.next();
		System.out.println("请输入游戏角色的种族(1.人类 2.精灵 3.兽人 4.矮人 5.元素):");
		int race = scanner.nextInt();
		// 创建一个新的角色
		Rpg_hero hero = new Rpg_hero();
		hero.name = name;
		hero.race = race;
		// 容器的长度加1
		Rpg_hero[] copyOf = Arrays.copyOf(players,players.length+1);
		copyOf[copyOf.length-1] = hero;
		if(copyOf != null) {
			System.out.println("创建成功！！！");
			System.out.println("创建的角色的名字："+hero.name);
			System.out.println("创建的角色的种族："+hero.race);
			int power = hero.getPower();
			System.out.println("该角色的力量："+power);
		}
	}
	public static void gameRules() {
		System.out.println("游戏规则：xxxxxxxxx");
	} 
	public static void gameOver() {
		System.exit(0);
	}

}
