package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		Person p1 = new Person("�趯��", "����", "�л�", new Dog("�޸�", 2, "�趯��", "����"), new Car(), "123456", 22);
		
		System.out.println(p1.getAdderss());
		System.out.println(p1.getJob());
		System.out.println(p1.getPhoneNumber());
		
		Person p2 = new Person("�ڸ۸�", "���", "�л�", new Dog("�ھ߿�", 2, "�ڸ۸�", "���"), new Car(), "123456789", 25);
		
		System.out.println(p2.getName());
		System.out.println(p2.getDog().getDogAdderss());
		System.out.println(p2.getDog().getDogMaster());
		System.out.println(p2.getAge());
		
		System.out.println(p1.getJob());
		

	
	}

}
