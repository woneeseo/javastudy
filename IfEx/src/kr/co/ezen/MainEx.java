package kr.co.ezen;

// 10�� 29�� if�� �н�
import com.naver.Person;
import com.naver.Radio;
import com.naver.TV;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		t1.me1();
		
		t1.me2(60);
		
		t1.me3(5);
		
		String msg = t1.me4(3);
		System.out.println(msg);
		
		t1.me6(6);
		
		char score = t1.me7(70);
		System.out.println(score);
		
		TV tv1 = new TV(10, 15, false);
		
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
		// tv�� ���� volUp �޼��带 �����ص� ���� �ȵ�
		System.out.println();
		
		tv1.powerOn();
		tv1.chUp();
		System.out.println(tv1.getCh());
		tv1.powerOff();
		
		tv1.switchTv();
		tv1.chUp();
		System.out.println(tv1.getCh());
		tv1.switchTv();
		tv1.chDown();
		System.out.println(tv1.getCh());
		tv1.switchTv();
		tv1.chDown();
		System.out.println(tv1.getCh());
		
		
		System.out.println();
		
		
		Person kim = new Person(tv1);
		
		// kim�� tv�� �Ҵ�.
		kim.tvOn();
		// kim�� tv�� ����
		kim.tvOff();
		kim.tvOn();
		System.out.println(kim.getTv1().getCh());
		kim.getTv1().chUp();
		System.out.println(kim.getTv1().getCh());
		
		System.out.println(kim.getTv1().getVol());
		kim.getTv1().volDown();
		System.out.println(kim.getTv1().getVol());
		
		
		kim.getTv1().setVol(50);
		System.out.println(kim.getTv1().getVol());

		
		Radio r1 = new Radio(25, 190, true);
		
		kim.setRadio(r1);
		
		System.out.println(kim.getRadio().getHz());
		kim.getRadio().setPower(true);
		kim.getRadio().hzUp();
		System.out.println(kim.getRadio().getHz());
		
		
		
		
		
		
	}

}
