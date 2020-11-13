package com.naver;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
	
	public void me8() {
		
		List<MemberDTO2> list = new ArrayList<MemberDTO2>();
		
		list.add(new MemberDTO2("a001", "�뱸", "���1", 1500));
		list.add(new MemberDTO2("a002", "����", "���2", 2000));
		list.add(new MemberDTO2("a003", "����", "���3", 3000));
		list.add(new MemberDTO2("a004", "�λ�", "���4", 2500));
		list.add(new MemberDTO2("a005", "û��", "���5", 1000));
		
		for(int i=0; i<list.size(); i++) {
			
			MemberDTO2 apple = list.get(i);
			
			if(i == 0) {
				continue;
			}else {
				System.out.println(apple);
			}
			
			
			// toString ���� ���� : �̸� ���� overiding ����⶧����
			// �׳� sysout�ϸ� �� ����
		}
		
		list.remove(new MemberDTO2("a004", null, null, 0));
		list.remove(new MemberDTO2("a003", null, null, 0));
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		// clear => ����Ʈ�� ������ ���� ���������, ���ڴ� ��������
	}
	
	
	public List<MemberDTO> me7() {
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001", "kim", 5));
		list.add(new MemberDTO("m002", "lee", 12));
		list.add(new MemberDTO("m003", "park", 53));
		list.add(new MemberDTO("m004", "kang", 55));
		list.add(new MemberDTO("m005", "choi", 11));
		
		int idx = list.indexOf(new MemberDTO("m003", null, 0));
		System.out.println(idx);
		
		return list;
		
	}

	
	public void me6() {
		// list��ü�� ����ÿ�. ��, Map<String, object>�� ���� �� ����.
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		list.add(new HashMap<String, Object>());
		
		// map�� �������̽��� map���δ� ��ü�� ���� �� ����
		// map�� �����ϰ� �ִ� hashmapŬ������ �̿��Ѵ�.
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list.clear();
	}
	
	public void me5() {
		// list ��ü�� ���弼��. ��, Thread�� ���� �� �ֽ��ϴ�.
		List<Thread> list = new ArrayList<Thread>();
		
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		}));
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}	
	
	public void me4() {
		// list ��ü�� ���弼��. ��, new StringBuffer()�� ���� �� ����
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		// list�� ����ִ� ��� �����͸� ����Ͻÿ�
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(int i =list.size()-1; i>=0; i--) {
			list.remove(i);
		}System.out.println(list);
		
	}
	
	public void me3() {
		// list ��ü�� ���弼��. �� 3.5, 4.1, 9.8�� �Է��� �� �ִ� ��ü�Դϴ�.
		List<Double> list = new ArrayList<Double>();
		
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		
		int idx = list.indexOf(4.1);
		double d = list.get(idx);
		System.out.println(d);
		double d2 = list.get(1);
		System.out.println(d2);
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list�� ����ִ� ������ ��Ұ��� 1.1��
		list.set(list.size()-1, 1.1);
		System.out.println(list.get(list.size()-1));
		
		// list�� �ִ� �����͸� �ݺ����� �̿��ؼ� ���� �����ϼ���.
		System.out.println(":::::::::::");
		
		int i = list.size()-1;
		while(i>=0) {
			list.remove(i);
			i--;
		}
		System.out.println(list);
	}
	
	public void me2() {
		// List ��ü�� ������ּ���. ��, ���׸�Ÿ���� 3,4,5,6�� �Է��� �� �ֵ���.
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(4);
		list.add(5);
		list.add(6);
		// wrapper class�� 
		// auto boxing - auto unboxing�� �Ǳ� ������
		// �����ڷ���ó�� ���� �Է����൵ �ǰ�, ���ڸ����� �ٷ� ���� �Է��ص� ��.
		
		int idx = list.get(2);
		System.out.println(idx);
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}System.out.println();
		
		list.set(list.indexOf(4), 100);
		System.out.println(list);
		
		// list.remove(new Integer(100));
		// int �ڷ������� �Էµ� ���� �����ϰ� ���� ��
		// new Integer(�ε����� ����� ��) �� �Է����ָ� ��
		// int�� �ڷᰪ�� �ε����� ���������� �浹�ϸ� �ε����� �ν��Ѵ�.
		
		System.out.println(list);
		
//		list.remove(1);
//		list.remove(2);
//		System.out.println(list);
		// list������ �ϳ��� �����Ǹ� ������ �ڸ��� �ڷᰡ �����
		// [3, 100, 5, 6] ���� �ε��� 1���� �����
		// list�� �迭�� [3, 5, 6] ���� �ٲ�鼭, �ٽ� �ε�����ȣ�� �ο��ȴ�.
		// 100�� �����Ǿ �ε��� 1���� 5�� ����Ǿ���.
		// �ε��� 2���� �����ϸ� 6�� �����Ǹ�
		// ���������� �ֿܼ� ��µǴ� ���� [3, 5] �� ���´�.
		
		list.remove(2);
		list.remove(1);
		System.out.println(list);
		// list������ �������� �����͸� �����ϰ� �ʹٸ� �ڿ������� �����Ѵ�.
		// �̷��� Ư�������� �����۾��� ����� �������� arraylist�� ���� �ʴ´�.
		// linked list�� ��
		
		
		
	
	}
	
	public void me1() {
		// ArrayList
		List<Apple> list = new ArrayList<Apple>();
		// �迭ó�� ���� list
		// �迭�� ó���� ũ�⸦ �����ָ� ũ�Ⱑ ������ ������,
		// arraylist�� ũ�⸦ �����Ű�� ���� �����ϴ�.
		// ����� ��� :
		// �ڹ��÷��������ӿ�ũ <���빰�� �����ڷ���>
		
		list.add(new Apple());
		// list.add("�ȳ�"); => �����߻�
		// Apple Ŭ������ ��ü'��' ���빰�� �� �� ����
		
		Apple iphone12 = list.get(0);
		// list�� ����ִ� ��� ��Ұ��� ����Ͻÿ�
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
