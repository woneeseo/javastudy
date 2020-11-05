package com.naver;

import java.util.StringTokenizer;

public class Test {
	
	
	
	public void name2() {
		String str = "HELLO#Hello#hello#hI#Hi#HI";
		StringTokenizer st = new StringTokenizer(str,"#");
		String[] arrStr = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			String tok = st.nextToken();
			arrStr[i] = tok;
			
			if(arrStr[i].contains("H")) {
				System.out.println("�빮���Դϴ�.");
			}else {
				System.out.println("hello");
			}
			
			i++;
		}
	}
	
	
	
	public void me15() {
		String msg1 = "hello";
		String msg2 = "Hello";
		String msg3 = "HELLO";
		
		System.out.println(msg2.toUpperCase());
		System.out.println(msg2.toLowerCase());
		System.out.println(":::::::::::");
		String s1 = msg1.toUpperCase();
		// �빮�ڷ� ���
		System.out.println(s1);
		String s2 = msg3.toLowerCase();
		// �ҹ��ڷ� ���
		System.out.println(s2);
	}
	
	public void me14(int age) {
		// ���ڿ��� ���ڸ� + ������ ������� �ʰ� ǥ���ϴ� ���
		String msg = "ȫ�浿�� "+age+"�� �Դϴ�.";
		System.out.println(msg);
		
		String msg2 = "ȫ�浿�� %d�� �Դϴ�.";
		System.out.println(String.format(msg2, age));
		// %d = �������� �������ְڴٴ� �̾߱� 
		
		// 2020��  3�� 20��
		// 2020�� 11��  5��
		// �̷��� ���ڸ� �����ϰ� ���� ���
		int month = 3;
		String msg3 = "������ 2020��%2d��20���Դϴ�.";
		System.out.println(String.format(msg3, month));
		
		int date = 5;
		String msg4 = "������ 2020��11��%-2d���Դϴ�.";
		// %�� d���̿� 2�� ������ = 2���� ������ �ְڴ�.
		// ���� ���ڸ��� �Է��ص� ���ڸ��п� �ش��ϴ� ������ ������ �����
		// %�� 2d���̿� -�� �Է��ϸ� ���������� �Ǿ�
		// ���ڸ��� �Է��ϸ� �����ʿ� ������ �����.
		
		System.out.println(String.format(msg4, date));
		
		int money = 1000;
		String msg5 = "�� ������� %d�� �Դϴ�.";
		System.out.println(String.format(msg5, money));
		
		String msg6 = "�� ������� %,d�� �Դϴ�.";
		// ���� ��Ÿ�� ��, ���ڸ����� �ĸ��� �ٿ����ݾ�
		// �� �� �����ϰ� 1,000���� �ݾ��� ǥ���� �� �ֵ��� ���ִ� �� : %,d
		System.out.println(String.format(msg6, money));
		
		String msg7 = "�� ������� %,15d�� �Դϴ�.";
		// d�տ� ���ڸ� �ٿ������ν� �ڸ����� ��Ÿ�� �� �ִ�.
		System.out.println(String.format(msg7, money));
		
		// �ڸ����� �������ְ�, �̸� �� ��ä���� �� ���� ������ 0���� ä���
		// �ڸ��� : 5. ���ڴ� 11�̸� => 00011
		String msg8 = "�� ���ȣ�� %2d�Դϴ�.";
		System.out.println(String.format(msg8, 7));
		
		String msg9 = "�� ���ȣ�� %08d�Դϴ�.";
		System.out.println(String.format(msg9, 7));
		
		String msg10 = "%d + %d = %d�Դϴ�.";
		System.out.println(String.format(msg10, 3,4,7));
		// �������� �����͸� �ĸ��� ������ �Է��� �� ����
		// (���������δ� �迭ó�� ��������)
		
		String msg11 = "%3.2f%%�Դϴ�.";
		System.out.println(String.format(msg11, 51.627));
		
	
		String name = "�躹��";
		String str = "%s�� %d���Դϴ�.";
		System.out.println(String.format(str, name, age));
		
		float precent = 3.14567F;
		String str1 = "%2.3f�� ������ �Դϴ�";
		System.out.println(String.format(str1, precent));
		
		int score = 9;
		String str2 = "���ȣ�� %05d�Դϴ�.";
		System.out.println(String.format(str2, score));
		
		
		String str3 = "���ȣ�� %-3d�Դϴ�.";
		System.out.println(String.format(str3, score));
		
		
		
		
		
		
	}
	
	public void name() {
		String str = "into the unknown.mp3";
		boolean result = str.endsWith(".mp");
		
		
		if(result) {
			System.out.println(str.substring(str.indexOf('t', 
					str.indexOf('t')+1), str.indexOf('e')+1));
		}else {
			System.out.println("this is not music file.");
		}
	}
	
	public void me224() {
		String str = "into#the#new#world#welcome#elsa#!";
		String[] arrElsa = str.split("#");
		for(int i=0; i<arrElsa.length; i++) {
			if(i/2==0) {
				continue;
			}
				System.out.print(arrElsa[i]+" ");
		}
		System.out.println();
		
	}
	
	public void me223() {
		String str = "into#the#new#world#welcome#elsa#!";
		StringTokenizer st = new StringTokenizer(str, "#");
		String[] arrElsa = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			String tok = st.nextToken();
			arrElsa[i++] = tok;
		}
		System.out.println(arrElsa[arrElsa.length-1]);
		for(String tok : arrElsa)
			System.out.print(tok+" ");
		System.out.println();
	}
	
	public void me2222() {
		String str = "hello everyone";
		int idx = str.indexOf('e');
		idx = str.indexOf('e', idx+1);
		System.out.println(str.substring(idx));
		
		
		System.out.println(str.substring(str.indexOf('e'), 
				str.indexOf('e', idx+1)+1));
		
		System.out.println(str.substring(2, 4));
		
		System.out.println(str.substring(str.indexOf('l'), 
					str.indexOf('l',str.indexOf('l')+1)+1));
	
	}
	
	public void me1111() {
		String msg = "1#3#5#7#9##11#13";
		StringTokenizer in = new StringTokenizer(msg,"#");
		// msg��� ���ڿ����� #��� delim�� �����ڷ� �ؼ�
		// ���ڿ��� ���� ��ū�� ����ڴ� -> StringTokenizer
		
		String[] arrInt = new String[in.countTokens()];
		// split()�� ��쿡�� �޼��带 ����԰� ���ÿ�
		// �˾Ƽ� String�� 1�����迭 String[]�� ����������
		// StringTokenizer�� ��쿡�� ������ �迭������ ������ �����Ƿ�
		// ��ū���� ������ �迭�� �ϳ��� �ڷḦ ����������Ѵ�.
		// ���� ���� ������ �� �ִ� �迭 �ϳ� �����ϱ�
		// �ٵ� ��ū�� ��� ���� �� �� �� �����Ƿ�
		// countTokens()��� �޼��带 ������ش�. 
		// ��ū�� ���ڿ� ���� �˾Ƽ� �迭�� ũ�Ⱑ ��������
		System.out.println(arrInt.length);
		
		// StringTokenizer�� while�ݺ����� �Բ� �����
		
		int i = 0;
		while(in.hasMoreTokens()) {
			// in�� �о� �� ��ū�� �ֳ�?
			// ����� ���������� true / true�� �Ʒ� ����� ����
			String token = in.nextToken();
			// in�� ��ū ���� �о�ͼ� token�� ����
			arrInt[i] = token;
			// �о�� ��ū ���� �迭�� i��° �ε����� �Է����ش�.
			i++;
			// i�� 1 �����ش�.
			
		}System.out.println(arrInt[6]);
	}
	
	public void me133() {
		String msg = "hello#ichiro#ziro#saburo#3#buster#";
		StringTokenizer st = new StringTokenizer(msg,"#");
		String[] arrMsg = new String[st.countTokens()];
		
		int i =0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			arrMsg[i] = token;
			i++;
			
		}System.out.println(arrMsg[arrMsg.length-1]);
		
	}
	
	public void me13() {
		// Ư�� ���� ����(delim)�� �̿��ؼ� ���� �ٸ� �ǹ̸� �����ִ�
		// ���ڿ�(=token) �� �����ϱ�
		String msg = "teacheryo#1234##vip#1000#g#";
		String[] arr = msg.split("#"); 
		// regex = delim (|�� ������ ������ ����ok)
		// ���ڿ��� �����߱� ������ ���ҵ� ���ڵ��� �ϳ��� �迭������ ���´�
		// ��ȯ�Ǵ� �����Ͱ� String���� 1���� �迭 => String[] ��
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("::::::::::::::::::::");
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i=0;
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
			tArr[i] = token;
			i++;
		}System.out.println(tArr[0]);
		
	}
	
	public void me12() {
		// + �����ڴ� ���ڿ����� ����ȴ�.
		// - �����ڴ� ���ڿ��� ������� �ʴ´�.
		// "hello world" ����
		// "hello "�� �߶󳻰� "world"�� ���� �ϰ� �ʹٸ�? substring()
		String msg1 = "hello world";
		String subMsg = msg1.substring(msg1.indexOf("w"));
		System.out.println(subMsg);
		System.out.println(msg1);
		
		int idx = msg1.indexOf('l');
		idx = msg1.indexOf('l',idx+1);
		int idx2 = msg1.indexOf('r');
		System.out.println(msg1.substring(idx, idx2+1));
	}
	
	public void me11() {
		String msg = "          he      llo             ";
		// �߰��� ���� ������ �����ϰ�, ���ڿ� �� �ڷ� �� ������ �������ִ� ���
		// he      llo
		// �� ��µǰ� ���ִ� �޼��� : trim();
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
	}
	
	
	
	public void me10() {
		// ���ڿ����� ������ ���� ������ ���θ� Ȯ���ϰ� ���� ��, equals().
		// ��ҹ��ڸ� �����ϰ� ���� ���� ��, equalsIgnoreCase()
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";
		
		boolean result1 = msg1.equals(msg2);
		boolean result2 = msg1.equals(msg3);
		
		System.out.println(result1);
		System.out.println(result2);
		// case -> ��,�ҹ���
		// equalsIgnoreCase -> ��ҹ��ڸ� �����ϰ� ������ ������ ������ Ȯ�ΰ���
		boolean result3 = msg1.equalsIgnoreCase(msg3);
		System.out.println(result3);
	}
	
	public void me9() {
		// ���ڿ��� Ư�� ���ڿ��� �����ϴ��� �˰����� ��, startWith()
		String msg = "hello";
		boolean result = msg.startsWith("h");
		System.out.println(result);
	}
	
	public void me8() {
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		
		boolean result1 = msg1.endsWith("jpg");
		System.out.println(result1);
		// endsWith => ���̾ Ư�� ���ڿ��� �������� Ȯ���� �� ����
		// boolean������ ��µǱ� ������ ���� true, false�� ��µ�
		// �Ϲ������� Ȯ���ڰ� �������� Ȯ���ϰ� ���� �� ���
		
		
		boolean result2 = msg2.endsWith(".txt");
		System.out.println(result2);
		
	}
	
	public void me7(String msg) {
		
		// msg�� 'z'�� ����ֳ�?
		// msg�� 'w'�� ����ֳ�?
		// msg�� "el"�� ����ֳ�?
		// msg�� "ow"�� ����ֳ�?
		// ���������� ���� ���̸� ���������, �Ķ���ͷ� ������ ���ڿ���
		// ���� Ȯ���� �� ����. �׷� ��,
		// contains() or indexOf() �� ����Ѵ�.
		// cf) lastIndexOf
		// ('z'�� ���ԵǾ��ֳ�?) 	('z'�� �ε����� ����?)
		
		boolean result = msg.contains("z");
		int idx = msg.indexOf('z');
		// �ش� ���ڿ��� ������ ���ڿ��� ���� �ε��� ��ȣ�� �Ѱ���
		// ���ڰ��� ������ -1�� �Ѱ���
		System.out.println(result);
		System.out.println(idx);
		System.out.println(msg.indexOf('l'));
		// ���ڿ����� �˻��� ���� ���� �� ���� ������ ������ �ε�����
		// lastIndexOf(); �� ����Ѵ�. 
		System.out.println(msg.lastIndexOf('l'));
		
		// ���ڿ����� �˻��� ���� ������ �߰��� �ִ¹����� �ε����� ��� ���ұ�?
		idx = msg.indexOf('l');
		System.out.println(idx); // 2�� �ε��� ����
		
		idx = msg.indexOf('l', idx+1);
		System.out.println(idx);// 3�� �ε��� ����
		
		idx = msg.lastIndexOf('l', idx+1);
		System.out.println(idx);
		
	}		
	
	public void me6() {
		String msg = "hello";
		// ���ڿ��� Ư�� �ε����� �ִ� ���ڸ� �˰����� �� : charAt()
		// msg�� ���� ū �ε����� �ش��ϴ� ���ڸ� ����Ͻÿ�
	
		System.out.println(msg.charAt(msg.length()-1));
		System.out.println();
		// msg ���ڿ��� �� ���ڸ� �� ���ھ� ��� ����Ͻÿ�
		for(int i=0; i<msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}
	
	
	public void me5() {
		String str = "hello";
		// 1. �迭�� ũ�⸦ �˰����� �� ȣ��Ǵ� �Ӽ�? length
		// 2. ���ڿ��� ũ�⸦ �˰����� �� ����ϴ� �޼���? length()
		
		System.out.println(str.length());
		// 3. ArrayList<String> list = new ArrayList<String>();
		// => list.size(); �ڹ� �÷��� �����ӿ�ũ�� ����Ʈ �ȿ� ����ִ� ����� ������ �ľ��� �� ��
		
	}
	
	
	
	
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		// String Ŭ������ �Һ�������
		String msg = "hello";
		msg = "good";
		
		msg = "";
		//""�� ��ü�� 1��
		msg += "�ȳ��ϼ���";
		// ""+"�ȳ��ϼ���" �� ���� ��ü�� ���ϳ�
		msg += "���� ȫ�浿�Դϴ�.";
		// ""+"�ȳ��ϼ���"+"���� ȫ�浿�Դϴ�" �� ���� ��ü�� ���ϳ�
		msg += "���� ���� ������� �ô뿡 ����ֽ��ϴ�.";
		// ""+"�ȳ��ϼ���"+"���� ȫ�浿�Դϴ�"+"���� ����~~"�� ���� ��ü�� ���ϳ�
		// �޼��� ������ �� 4���� ��ü�� ����� 
		// -> �ȱ׷��� ���� ������ ��ü�� ���� �� 4���� ���ܼ� �޸� ���� �߻�
		// ���߿� �ӵ� ���ϱ��� �߻��ϰ� �� => StringBuffer�� ����� �޸� ����
		
		sb.append("�ȳ��ϼ���.");
		sb.append("���� ȫ�浿�Դϴ�.");
		sb.append("���� ���� ������� �ô뿡 ����ֽ��ϴ�.");
		// => ���޸𸮿� StringBuffer�� �̿��� �޸𸮸� �Ҵ�ް�
		// �ű⿡ �����͸� ��ô�س��� -> �޸� ������ ȿ����!
		// �׷� ���� StringBuffer�� ����� �����ʹ�
		// �ȳ��ϼ��� ���� ȫ�浿�Դϴ�. ���� ���� ~~ �� �� ����Ǿ�����
		// �ٵ� StringBuffer�� ���� ���̴� class�� �ƴϱ� ������
		// ������ ������ �Ϸ�Ǹ� ���� ���̴� class�� String����
		// �ڷ����� ��������� ��.
		
		msg = sb.toString();
		System.out.println(msg);
		
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg3 == msg4);
		System.out.println(":::::::::::");
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		// equals => ������ ���� ����
		
	}
	
	public void me2() {
		// �Ͻ��� ��ü ������� 
		String msg = "hello";
	}
	
	public void me1() {
		// ������ ��ü ������� 
		String msg = new String("hello");
		
	}

}