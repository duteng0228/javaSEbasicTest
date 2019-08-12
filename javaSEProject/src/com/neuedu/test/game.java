package com.neuedu.test;
import java.util.*;

public class game {
	// ����һ����������Ϸ��ɫ��Ϣ
	static Rpg_hero[] players = {};
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
		System.out.println("4.�鿴���н�ɫ��Ϣ");
		System.out.println("5.��������ѯ��ɫ��Ϣ");
		System.out.println("6.�޸Ľ�ɫ��Ϣ");
		System.out.println("7.ɾ����ɫ��Ϣ");
		System.out.println("������������еĲ���(1-7):");
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
		case 4:
			// ��ѯ���н�ɫ��Ϣ
			printAllCharacters();
			break;
		case 5:
			// ��������ѯ��ɫ��Ϣ
			queryCharacterByName();
			break;
		case 6:
			// �޸Ľ�ɫ��Ϣ
			updateCharacterInfoByName();
			break;
		case 7:
			// ɾ����ɫ
			deleteCharacterInfoByName();
			break;
		default:
			System.out.println("����������������");
			Welcome();
		}
	}
	public static void creatNewPlayer() {
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
		players= Arrays.copyOf(players,players.length+1);
		players[players.length-1] = hero;
		if(players != null) {
			System.out.println("�����ɹ�������");
			System.out.println("�����Ľ�ɫ�����֣�"+hero.name);
			System.out.println("�����Ľ�ɫ�����壺"+hero.race);
			int power = hero.getPower();
			System.out.println("�ý�ɫ��������"+power);
		}
		Welcome();
	}
	private static void gameRules() {
		System.out.println("��Ϸ���򣺹�������û�й���");
		Welcome();
	} 
	private static void gameOver() {
		System.exit(0);
	}
	// ��ѯ���н�ɫ��Ϣ
	private static void printAllCharacters() {
		for(int i=0;i<players.length;i++) {
			System.out.println(players[i]);
		}
		Welcome();
	}
	// ��������ѯ��ɫ��Ϣ
	private static void queryCharacterByName() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("��������Ҫ��ѯ��ɫ�����֣�");
		String name = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)  ) {
				System.out.println(players[i]);
			}
		}
		Welcome();
	}
	// �޸Ľ�ɫ��Ϣ
	private static void updateCharacterInfoByName() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("��������Ҫ�޸Ľ�ɫ�����֣�");
		String name = scanner.next();
		System.out.println("��������Ҫ�޸ĵ����壺");
		int race = scanner.nextInt();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)  ) {
				players[i].race = race;
				System.out.println("�޸ĳɹ�");
				System.out.println(players[i]);
			}
		}
		Welcome();
	}
	// ɾ����ɫ��Ϣ
	private static void deleteCharacterInfoByName() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("��������Ҫɾ����ɫ�����֣�");
		String name = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				players[i] = players[players.length-1];
				players = Arrays.copyOf(players, players.length-1);
				System.out.println(players[i]);
			}
			System.out.println("ɾ�������Ϣ"+Arrays.toString(players));
		}
		Welcome();
	}

}
