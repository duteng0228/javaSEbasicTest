package com.neuedu.test;
import java.util.*;

public class game {
	public static void main(String[] args) {
		Welcome();
	}
	// дһ�������������ӭ����
	public static void Welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("===����һ��RPG��Ϸ===");
		System.out.println("=================");
		System.out.println("1.��ʼ��Ϸ");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ");
		System.out.println("������������еĲ���(1-3):");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			// ��ʼ��Ϸ
			creatNewPlayer();
			break;
		case 2:
			// ��Ϸ����
			gameRules();
			Welcome();
			break;
		case 3:
			// ������Ϸ
			gameOver();
			break;
		default:
			System.out.println("����������������");
			Welcome();
		}
	}
	public static void creatNewPlayer() {
		// ����һ����������Ϸ��ɫ��Ϣ
		Rpg_hero[] players = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ɫ��������");
		String name = scanner.next();
		System.out.println("��������Ϸ��ɫ������(1.���� 2.���� 3.���� 4.���� 5.Ԫ��):");
		int race = scanner.nextInt();
		// ����һ���µĽ�ɫ
		Rpg_hero hero = new Rpg_hero();
		hero.name = name;
		hero.race = race;
		// �����ĳ��ȼ�1
		Rpg_hero[] copyOf = Arrays.copyOf(players,players.length+1);
		copyOf[copyOf.length-1] = hero;
		if(copyOf != null) {
			System.out.println("�����ɹ�������");
			System.out.println("�����Ľ�ɫ�����֣�"+hero.name);
			System.out.println("�����Ľ�ɫ�����壺"+hero.race);
			int power = hero.getPower();
			System.out.println("�ý�ɫ��������"+power);
		}
	}
	public static void gameRules() {
		System.out.println("��Ϸ����xxxxxxxxx");
	} 
	public static void gameOver() {
		System.exit(0);
	}

}
