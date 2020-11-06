package kr.co.ezen;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monster mon = new Monster(100);
		
		
		Hero hero2 = new Hero();
		
		hero2.attack(mon);
		hero2.changeWeapon(3);
		hero2.attack(mon);
		hero2.changeWeapon(0);
		hero2.attack(mon);
		hero2.attack(mon);
		
	}

}
