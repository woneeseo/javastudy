package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
//		set.add(new MemberDTO("m002", "kang", 43));
//		set.add(new MemberDTO("m005", "choi", 2));
// id�� �������� �������̶�� �ν��ϰ� hashcord()and equals()ó���� �� �ּ�
// id�� �ߺ��Ǵ� �� �߿� �ڿ� ���� �Է��ص� set������ �ν����� ���Ѵ�.

		
		
	}
	
	public void me3() {
		Set<MemberDTO2> set = new HashSet<MemberDTO2>();
		
		set.add(new MemberDTO2("a001", "�뱸", "���1", 1500));
		set.add(new MemberDTO2("a002", "����", "���2", 2000));
		set.add(new MemberDTO2("a003", "����", "���3", 3000));
		set.add(new MemberDTO2("a002", "�λ�", "���44", 500));
		set.add(new MemberDTO2("a005", "û��", "���5", 1000));
		
		
		
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

	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
	}

}
