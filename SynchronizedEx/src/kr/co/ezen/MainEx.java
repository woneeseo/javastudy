package kr.co.ezen;

import com.naver.Sum;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		System.out.println("main start");
		Sum sum = new Sum();
		// ������ ����Ʈ���� 0�̱⶧���� ����Ʈ������ �ᵵ �� : ����Ʈ�� 0
		
		// Test t1 = new Test(sum, 1, 10000);
		Test t1 = new Test(sum, 1, 5000);
		Test t2 = new Test(sum, 5001, 10000);
		// sum�̶�� �����͸� �����ϰ� �ֱ� ������ 
		// ����ȭ ������ �߻��Ѵ�
		// ������ �߻��ϴ� class���� synchronized �� ����ȭ �� ������ �ذ����ش�.
		
		t1.start();
		t2.start();
		// 1���� 10000������ ���� ��
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum.getNum());
		System.out.println(sum.getTes());
		

	}

}
