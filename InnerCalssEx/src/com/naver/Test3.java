package com.naver;

public class Test3 {
	
	private String msg;
	
	public static class StaticInnerClass{
		// static 메서드 => class명.
		private int age;
		public static String name;
		
		
		public void sic() {
			System.out.println("sic");
//			System.out.println(msg);
//			me1();
			
			
			
			
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
	
	public void me1() {
		
	}

}
