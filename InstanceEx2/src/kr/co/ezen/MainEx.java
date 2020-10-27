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
		// 히어로랑 몬스터를 만들어주고
		
		Bow bow = new Bow();
		Sword sword = new Sword();
		Spear spear = new Spear();
		// 몬스터랑 싸울 무기를 만들어줌
		
		hero.setSpear(spear);
		hero.setBow(bow);
		hero.setSword(sword);
		// 히어로한테 무기를 장착시켜주고
		
		hero.attakcBySpear(mon);
		hero.attack(mon);
		
		System.out.println();
		
		hero.attack(sword, mon);
		// 공격하라고 시킴!
		
		System.out.println();
		
		Shild shild = new Shild();
		// 무기가 생겼다!
		
		hero.setShild(shild);
		// 히어로한테 장착해주고
		
		hero.shildFromMon(mon);
		// 무기를 쓰라고 시키기
		
		exAttack exAttack = new exAttack();
		// 무기 만들어주고
		
		hero.setExAttack(exAttack);
		// 히어로한테 무기 쥐어주고
		System.out.println();
		hero.extreamAttack(mon);
		// 써라!
		
		
	}

}
