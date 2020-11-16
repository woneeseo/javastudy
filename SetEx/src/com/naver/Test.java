package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
	public void me5() {
		
		Set<MemberDTO2> set = new HashSet<MemberDTO2>();
		
		set.add(new MemberDTO2("a001", "�뱸", "���1", 1500));
		set.add(new MemberDTO2("a002", "����", "���2", 2000));
		set.add(new MemberDTO2("a003", "����", "���3", 3000));
		set.add(new MemberDTO2("a002", "�λ�", "���44", 500));
		set.add(new MemberDTO2("a005", "û��", "���5", 1000));
		
		System.out.println(set.size());
		// 4 => �ߺ��� ���� �������� ����
		set.add(new MemberDTO2("a006", "����", "���6", 1500));
		// set�� �ڷḦ �߰��ϰ� ���� �� = add
		Iterator<MemberDTO2> it = set.iterator();
		// set���� �ڷḦ �������� ���� �� - list + iterator + while��
		List<MemberDTO2> list = new ArrayList<MemberDTO2>();
		// set ���� �ڷᰡ �������� ���� �ε����� �ο����� �� �ֵ���
		// list�� ������ش�
		while (it.hasNext()) {
			// set �ȿ� ������ �ڷᰡ �ֳ� 
			MemberDTO2 memberDTO2 = it.next();
			// ������ �ڷᰡ ������ memberDTO2�� �����ض�
			list.add(memberDTO2);
			// ������ memberDTO2���� list�� ����	
		}
		
		System.out.println(list);
		// ����ϸ� ����� ���� �������� ��µȴ�.
		// [a001 : ���1, a006 : ���6, a002 : ���2, a003 : ���3, a005 : ���5]
		
		// �̰��� ������� �����Ϸ��� collection.sort()�� ���
		// memberDTO2�� �з����ڷ� id�� ���������� �����Ƿ�
		// sort�� id�� �������� ������ ����.
		
		Collections.sort(list);
		System.out.println(list);
		// [a001 : ���1, a002 : ���2, a003 : ���3, a005 : ���5, a006 : ���6]
		
		set.remove(new MemberDTO2("a002", null, null, 0));
		// set���� ���� ����� ���� ���� remove�� ����
		System.out.println(set);
		// [a001 : ���1, a006 : ���6, a003 : ���3, a005 : ���5]
		
	}
	
	
	
	
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
//		set.add(new MemberDTO("m002", "kang", 43));
//		set.add(new MemberDTO("m005", "choi", 2));
// id�� �������� �������̶�� �ν��ϰ� hashcord()and equals()ó���� �� �ּ�
// id�� �ߺ��Ǵ� �� �߿� �ڿ� ���� �Է��ص� set������ �ν����� ���Ѵ�.
		
		int size = set.size();
		System.out.println(size);
		// �迭 arr�� set�� �������ִ� �����͸� �����ϰ�,
		// �� �� id�� m005�� memberDTO��ü�� �̿��ؼ�
		// �� ��ü�� age���� ����Ͻÿ�
		
		
		Iterator<MemberDTO> it = set.iterator();	
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		// list = new ArrayList<MemberDTO>(set); �� ����.
		
		while (it.hasNext()) {
			MemberDTO memberDTO = it.next();
			list.add(memberDTO);
		}
		
		int idx = list.indexOf(new MemberDTO("m005", null, 0));
		System.out.println(list.get(idx).getAge());
		
		
//		Iterator<MemberDTO> it = set.iterator();
//		
//		MemberDTO[] arr = new MemberDTO[set.size()];
//		
//		while (it.hasNext()) {
//			MemberDTO memberDTO = it.next();
//			int idx = 0;
//			arr[idx] = memberDTO;
//			idx++;
//		}
//		
//		for(int i =0; i<arr.length; i++) {
//			MemberDTO dto = arr[i];
//			if(dto.getId().equals("m005")) {
//				System.out.println(dto.getAge());
//			}
//		}
//		
//		set.remove(new MemberDTO("m001", null, 0));
//		System.out.println(set);

		
		
	}
	
	public void me3() {
		Set<MemberDTO2> set = new HashSet<MemberDTO2>();
		
		set.add(new MemberDTO2("a001", "�뱸", "���1", 1500));
		set.add(new MemberDTO2("a002", "����", "���2", 2000));
		set.add(new MemberDTO2("a003", "����", "���3", 3000));
		set.add(new MemberDTO2("a002", "�λ�", "���44", 500));
		set.add(new MemberDTO2("a005", "û��", "���5", 1000));
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<MemberDTO2> it = set.iterator();
		
		List<MemberDTO2> list = new ArrayList<MemberDTO2>();
		System.out.println(it.next());
		System.out.println("::::::::");
		while (it.hasNext()) {
			MemberDTO2 memberDTO2 = it.next();
			System.out.println(memberDTO2);
			list.add(memberDTO2);
			
		}
		System.out.println(":::::::::::::::::");
		int idx = list.indexOf(new MemberDTO2("a003", null, null, 0));
		System.out.println(list.get(idx));
		
		
		
		set.remove(new MemberDTO2("a002", null, null, 0));
		System.out.println(set);
		
		set.clear();
	}
	
	
	public void me2() {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));
		set.add("hello");
		set.add("Hello");
		set.add(new String("Hello"));
		set.add("HELLO");
		set.add(new String("HELLO"));
		// �ڷᰪ�� ����񱳸� �ϱ� ������ Set�� ����ִ� �ڷ�� 3��
		
		
		int size = set.size();
		System.out.println(size);
		
		List<String> list = new ArrayList<String>();
		
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.print(string+" ");	
			list.add(string);
		}System.out.println();
		
		int idx = list.indexOf("hello");
		System.out.println(list.get(idx));
		
		
		
		set.remove(new String("HELLO"));
		System.out.println(set);

	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<Integer> it = set.iterator();
		
		// index�� ���� set���� ���ϴ� ���� ������ ���ؼ� ���
		// while���� ������ �ϴ� set�ȿ� �ִ� ���� ���� ��������
		// list�� �̿��ؼ� ������ ���� �ϳ��ϳ� ������ �ε����� �ο�����
		// set�� listó�� ���� �������� ���� ����������. 
		
		List<Integer> list = new ArrayList<Integer>();
		
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.print(integer+" ");
			list.add(integer);
		}System.out.println();
		
		int idx = list.indexOf(3);
		System.out.println(list.get(idx));
		
		
		set.remove(4);
		// set.remove(new Integer(4));
		System.out.println(set);
		
		set.clear();
	}
	
	
	

}
