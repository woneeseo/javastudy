package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Weapon[] weapon = new Weapon[] {new Bow("Ȱ", 1), 
				new Sword("��", 5), new Gun("��", 10)};
		Weapon w = weapon[0];
		
		Hero hero = new Hero(weapon, w);
		Monster mon = new Monster(100);
		
		boolean isTrue = true;
		int menu = 0;
		int weapIdx = 0;
		
		while(isTrue) {
			System.out.println("������ �ϳ��� �����ϼ���.");
			System.out.println("0: ����, 1: ���⺯��, 2: ����");
			
			menu = sc.nextInt();
			if(menu==2) {
				break;
				
			}
			
			if(menu==0) {
				
				hero.attack(mon);
			}else if(menu==1) {
				System.out.println("���⸦ �����ϼ���.");
				for(int i =0; i<weapon.length; i++) {
					System.out.print(i);
					System.out.print(" : "+weapon[i]+", ");
				}
				System.out.println();
				weapIdx = sc.nextInt();
				sc.nextLine();
				hero.changeWeapon(weapIdx);
			}
		}
		
		
		
		System.out.println("�����մϴ�.");
		sc.close();
		
	}
}
