package com.naver;

public class MainEx {
	public static void main(String[] args) {
		
		Member m1 = new Member("�ڲ˲�", "����", new Hobby("����", "1��", "��"), "�Ű�");
		System.out.println(m1.getHobby());
		
		String sh = m1.getSchool();
		System.out.println(sh);
		System.out.println(m1.getHobby());
		System.out.println(m1.getName());
		
		Member m2 = new Member("������", "ȣ��", new Hobby("����", "2��", "�п�"), "�Ϲ���");
		
		System.out.println(m2.getAddress());
		System.out.println(m2.getHobby().getFrequncy());
		System.out.println(m2.getHobby().getWhere());
		
		System.out.println(m2.getHobby().getCar());
		
		
	
	}
	

}
