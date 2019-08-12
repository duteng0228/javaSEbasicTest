package com.neuedu.test;
import java.util.*;

public class game {
	// 创建一个数组存放游戏角色信息
	static Rpg_hero[] players = {};
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
		System.out.println("4.查看所有角色信息");
		System.out.println("5.按条件查询角色信息");
		System.out.println("6.修改角色信息");
		System.out.println("7.删除角色信息");
		System.out.println("请输入您想进行的操作(1-7):");
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
		case 4:
			// 查询所有角色信息
			printAllCharacters();
			break;
		case 5:
			// 按姓名查询角色信息
			queryCharacterByName();
			break;
		case 6:
			// 修改角色信息
			updateCharacterInfoByName();
			break;
		case 7:
			// 删除角色
			deleteCharacterInfoByName();
			break;
		default:
			System.out.println("输入有误，重新输入");
			Welcome();
		}
	}
	public static void creatNewPlayer() {
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
		players= Arrays.copyOf(players,players.length+1);
		players[players.length-1] = hero;
		if(players != null) {
			System.out.println("创建成功！！！");
			System.out.println("创建的角色的名字："+hero.name);
			System.out.println("创建的角色的种族："+hero.race);
			int power = hero.getPower();
			System.out.println("该角色的力量："+power);
		}
		Welcome();
	}
	private static void gameRules() {
		System.out.println("游戏规则：哈哈哈，没有规则");
		Welcome();
	} 
	private static void gameOver() {
		System.exit(0);
	}
	// 查询所有角色信息
	private static void printAllCharacters() {
		for(int i=0;i<players.length;i++) {
			System.out.println(players[i]);
		}
		Welcome();
	}
	// 按条件查询角色信息
	private static void queryCharacterByName() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入你要查询角色的名字：");
		String name = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)  ) {
				System.out.println(players[i]);
			}
		}
		Welcome();
	}
	// 修改角色信息
	private static void updateCharacterInfoByName() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入你要修改角色的名字：");
		String name = scanner.next();
		System.out.println("请输入你要修改的种族：");
		int race = scanner.nextInt();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)  ) {
				players[i].race = race;
				System.out.println("修改成功");
				System.out.println(players[i]);
			}
		}
		Welcome();
	}
	// 删除角色信息
	private static void deleteCharacterInfoByName() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入你要删除角色的名字：");
		String name = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				players[i] = players[players.length-1];
				players = Arrays.copyOf(players, players.length-1);
				System.out.println(players[i]);
			}
			System.out.println("删除后的信息"+Arrays.toString(players));
		}
		Welcome();
	}

}
