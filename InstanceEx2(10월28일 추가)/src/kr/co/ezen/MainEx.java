package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Shild;
import com.naver.Spear;
import com.naver.Sword;
import com.naver.exAttack;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hero hero = new Hero();
		Monster mon = new Monster();
		// ����ζ� ���͸� ������ְ�
		
		Bow bow = new Bow();
		Sword sword = new Sword();
		Spear spear = new Spear();
		// ���Ͷ� �ο� ���⸦ �������
		
		hero.setSpear(spear);
		hero.setBow(bow);
		hero.setSword(sword);
		// ��������� ���⸦ ���������ְ�
		// set(����ȯ �ż���)�� �� ������ �׷���
		// ������ �ϰԸ� �ϸ� �Ǵϱ�
		// hero�� ���⸦ �����ϱ⸸ �ϸ� �Ǵϱ� ��ȯ�� �ʿ����
		
		hero.attakcBySpear(mon);
		hero.attack(mon);
		
		System.out.println();
		
		hero.attack(sword, mon);
		// �����϶�� ��Ŵ!
		
		System.out.println();
		
		Shild shild = new Shild();
		// ���Ⱑ �����!
		
		hero.setShild(shild);
		// ��������� �������ְ�
		
		hero.shildFromMon(mon);
		// ���⸦ ����� ��Ű��
		
		exAttack exAttack = new exAttack();
		// ���� ������ְ�
		
		hero.setExAttack(exAttack);
		// ��������� ���� ����ְ�
		System.out.println();
		hero.extreamAttack(mon);
		// ���!
		
		
	}

}
