package com.neuedu.test;

import java.util.Random;

/**
 * @author neuedu_yhl
 * @version 1.0
 * @since 08.07
 * */
public class GamePlayer {

	// ����
	public String name;
	
	// �Ա�
	public char sex;
	
	// ����
	public int race;
	
	// ְҵ
	public String professional;
	
	
	// ����
	public int power;
	
	
	// ����
	public int agile;
	
	// ����
	public int physicalPower;
	
	// �ǻ�
	public int wisdom;
	
	// ����
	public int intelligence;
	
	// ����ֵ
	public int hp;
	
	// ħ��ֵ
	public int mp;
	
	
	// ������������ķ���
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	
	// �������ɵķ���������
	
}