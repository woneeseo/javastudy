package com.naver;

public class Test {
	
	public void me1(int a) {
		if(a % 5 == 0) {
			System.out.println(5);
		}
		
	}
	
	public void me2(int a) {
		if(a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}
	}
	
	public void me3(int a) {
		if(a != 4) {
			System.out.println("true");
		}
		
	}
	
	public String me4(int a) {
		if(a <= 10) {
			return "OK";
		}else {
			return "NO";
		}
	}
	// ����if��
	public void me5(int a) {
		if(a % 2 == 0) {
			System.out.println(2);
		}else if(a % 3 == 0) {
			System.out.println(3);
		}else if(a % 5 == 0) {
			System.out.println(5);
		}else {
			System.out.println(0);
		}
	}
	
	public void printScore(int score) {
		if(score>=90) {
			System.out.println("��");
		}else if(score>=80) {
			System.out.println("��");	
			}else if(score>=70) {
				System.out.println("��");
			}else if(score>=60) {
				System.out.println("��");
			}else {
				System.out.println("��");
			}

	}
	// switch ~ case��
	
	public void printScore1(int score) {
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;

		default:
			System.out.println("��");
			break;
		}
		
	}
	
	public void printMonth(int month) {
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�� ���� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("28�� ���� �ֽ��ϴ�.");

		default:
			System.out.println("31�� ���� �ֽ��ϴ�.");
			break;
		}
		// break ���� case�κ� �������ϱ�
		// ���� �� ó�� ������ ����� ���� ������ ����? => break ���� �Ẹ��!
		
	}
	
	

}
