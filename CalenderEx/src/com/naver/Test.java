package com.naver;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public void name1() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.roll(Calendar.MONTH, 10);
		System.out.println(c.getTime());
		
		
	}
	
	public void name() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.add(Calendar.MONTH, 22);
		System.out.println(c.getTime());
	}
	
	
	public void me9() {
		
		// ���ڿ� ���� ����
		System.out.println(String.format("%4d,%3s", 33, "hel"));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		// String format�� ���� �����̶�� ���� �ȴ�.
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� mm�� ss��");
		c.set(1990, Calendar.DECEMBER, 15);
		String msg = sdf.format(c.getTime());
		System.out.println(msg);
		
	}
	
	public void me8() {
		
		Calendar c = Calendar.getInstance();
		Date d2 = c.getTime();
		// �ڹٿ����� Ķ���� Ŭ������ ����.
		// �׷��� DB������ Ķ����Ŭ�������ٴ� Date Ŭ������ ���� ����Ѵ�.
		// ���� �ݵ�� �� Ÿ���� ��ȯ�� �� �־�� �Ѵ�. 
		
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
		// �̷��� ��ȯ�ϸ� date��ü�� calendar Ŭ�������� ���� �� ����
		
		Date d3 = new Date(1);
		System.out.println(d3.toString());
		
		System.out.println(System.currentTimeMillis());
		// => long ������ ��µǴ� ��¥������ �˰������� 
		// ������ ��¥�� �������� Ȯ���� �� ����
	}
	
	
	public void me7() {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.roll(Calendar.DATE, 20);
		System.out.println(c.getTime());
		// roll�� ����ϸ� ������ ����Ǿ��ִ� ������ ������ �ʰ� 
		// �˰���� ���� Ȯ���� �� �ִ�. 
		// �ش� �ʵ��� ���� ������ �ǰ�, �ٸ� �ʵ��� ���� ������ �ȵ�
		// ��, date-day�� ������!
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	
	
	public void me61() {
		
		Calendar c = Calendar.getInstance();
		// ������ ������ ��� ���� �� ��, 
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.DATE, 20);
		// c�� ������ �Ȱ��� ���� c2�� ����� add�� �ϰų�.
		
		Calendar c3 = (Calendar) c.clone();
		// = Calendar c3 = Calendar.getInstance(); �� ���̴�. 
		c3.add(Calendar.DATE, 20);
		// c.clone();�� �̿��ؼ� ��ü�� �ϳ� �� ������
		// add�ϰų�
		
		
		
	}
	
	
	
	
	public void me6() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		// 2020�� 11�� 12���Դϴ�.
		// 20�� �Ŀ��� ��ĥ�ϱ��?
		
		c.add(Calendar.DATE, 20);
		// add() �� calendar��ü�� ������ �����մϴ�.
		// Ư�� �ʵ��� ���� �־��� ���� ���ؼ� �����մϴ�. 
		System.out.println(c.getTime());
	}
	
	
	
	public void me5() {/* �� �߿��� ����, ���� ���ص� �Ǵ� ���� */
		// �޷����
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("������ �Է��ϼ���.");
			int year = sc.nextInt();
			sc.nextLine();
			
			System.out.println("���� �Է��ϼ���.");
			int month = sc.nextInt();
			sc.nextLine();
			
			
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			// �ش� ���� 1��° ������ �˰��־�� �޷��� ����� �� �� ����
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year+"�� "+month+"��");
			System.out.println(" SU MO TU WE TH FI SA ");
			for(int i=1; i<firstDateDay; i++) {
				System.out.print("   ");
			}
			
			for(int i=1; i<lastDate+1; i++) {
				String naljja =i<10 ? "  "+i : " "+i;
				// ���ǿ����ڷ� �����ϰ� ���ǽ��� �������
				System.out.print(naljja);
				if((i+firstDateDay-1) % Calendar.SATURDAY==0) {
					System.out.println();
				}
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	
	public void me41() {
		// 1950�� 2���� ������ ���� ��ĥ���� �־�����?
		// �׸��� �� ���� ������ �����ϱ��? �� �� ���� ���
		
		Calendar c = Calendar.getInstance();
		
		
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		// = c.set(1950, Calendar.FEBRUARY, 1);
		
		// ���� �˰���� �⵵�� ���� set����
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// set���� ���� ���������� ��ĥ���� �ִ��� Ȯ���ϰ� ���� ��
		// c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		c.set(Calendar.DATE, maxDate);
		// 2�� ���������� ������ ��¥�� set���ְ�
		int day = c.get(Calendar.DAY_OF_WEEK);
		// ������ ������
		System.out.println(maxDate);
		System.out.println(day);
		
		
	}
	
	public void me4() {
		
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
	}
	
	public void me32() {
		// 1 1950�� 6�� 25���� ���� �����ϱ��?
		Calendar c = Calendar.getInstance();
		c.set(1950, Calendar.JUNE, 25);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		// �迭�� �ٽ� Ǯ��� 
		switch (day) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
		default:
			break;
		}
	}
	
	
	public void me31() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(c);
	}
	
	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		// Ķ���� ��ü�� ��������� ������ ������ ������ ����.
		c1.set(1950, 6-1, 25);
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public void me2() {
		// calendarŬ������ �̿��ؼ� ��ü c�� �����Ͻÿ�
		
		Calendar c = Calendar.getInstance();
		
		// c�� �̿��ؼ� �������� �����ϱ�.
		int year = c.get(Calendar.YEAR);
		// get(calendar.())�� �̿��ϸ� �� �� �� ������ ��� ������ �� �ִ�.
		// calandar class�� static������ �̿��ϱ� ���ؼ���
		// calendar.__(static������)�� �Է����ָ� �ȴ�.
		
		// ������  int month
		// ��¥���� int date
		// �������� int day
		
		int month = c.get(Calendar.MONTH)+1;
		// Ķ���� Ŭ������ month�� 0��~11������ �Ǿ��ִ�
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		
		
		
	
		
	}
	
	public void me1() {
		// 1. calendar Ŭ���� ��ü ���� ���
		Calendar c = Calendar.getInstance();
		// calendar class�� �߻�Ŭ�����̱� ������ ��ü�� ���� �� ����
		// Ķ���� Ŭ������ ������ �ִ� getInstance (static)�޼��带 ���ؼ� 
		// �ڿ��� ����� �� �ְ� �ȴ�.
		
				
	}

}
