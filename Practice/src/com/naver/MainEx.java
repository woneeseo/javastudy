package com.naver;

public class MainEx {
	public static void main(String[] args) {
		
		Member m1 = new Member("박꽉꽉", "여주", new Hobby("독서", "1번", "집"), "신곡");
		System.out.println(m1.getHobby());
		
		String sh = m1.getSchool();
		System.out.println(sh);
		System.out.println(m1.getHobby());
		System.out.println(m1.getName());
		
		Member m2 = new Member("아이폰", "호주", new Hobby("수영", "2번", "학원"), "하버드");
		
		System.out.println(m2.getAddress());
		System.out.println(m2.getHobby().getFrequncy());
		System.out.println(m2.getHobby().getWhere());
		
		System.out.println(m2.getHobby().getCar());
		
		
	
	}
	

}
