package kr.co.ezen;

import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;
import com.naver.Test6;


public class MainEx {

	public static void main(String[] args) {
		
		Test2.MemberClass mc = new Test2().new MemberClass();
		// ����Ŭ���� ȣ�� �� �� : 
		// ����Ŭ������ ������ �ִ� Ŭ������ ȣ���ؼ� �忬���ڷ� ����Ŭ������ �ҷ��µ�
		// Ŭ������ ��ü�� �����, �� �����ڷ� ����Ŭ������ �ҷ��� ��ü�� �������
		
		mc.mc1();
		// ��ü�� �̿��ؼ� ����Ŭ������ �ִ� �޼��忡 ������ �� �ִ�. 
		
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();
		// static class �̱� ������, ��ü�� ������ �� ����
		// ��ü�� ������ �� test3�� �Ű�ü�� ����� Static class�� ��ü�� �������
		// Static������ ���θ޼��忡 ȣ��Ǳ� ���ؼ���
		// Ŭ������ �Ű��� ��ü�� ����������.
	
		sic1.sic();
		
		Test5 t5 = new Test5();
		t5.ano.me1();
		// t5�� ����Ʈ�����ڿ� ������ �����ϱ� ����Ʈ�����ڷ� ��ü�� ����
		// ������ ����!
		Test6 t6 = new Test6();
		// �ٵ� t6�� ����Ʈ�����ڿ� me1�� �������̵� �ϰ�
		// me1�޼��带 ��ٷ� ���ÿ��� ����� �� �ֵ��� ó����
		// => ����Ʈ �����ڷ� ��ü�� ����� �� �����ڸ� �Ƚᵵ �ٷ� ���� ����� �� �ִ�.
	
	}	
		
}
