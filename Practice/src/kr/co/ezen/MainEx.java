package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		Person p1 = new Person("辫动嫰", "辑匡", "切积", new Dog("皋府", 2, "辫动动", "辑匡"), new Car(), "123456", 22);
		
		System.out.println(p1.getAdderss());
		System.out.println(p1.getJob());
		System.out.println(p1.getPhoneNumber());
		
		Person p2 = new Person("冠港港", "版扁", "切积", new Dog("冠具克", 2, "冠港港", "版扁"), new Car(), "123456789", 25);
		
		System.out.println(p2.getName());
		System.out.println(p2.getDog().getDogAdderss());
		System.out.println(p2.getDog().getDogMaster());
		System.out.println(p2.getAge());
		
		System.out.println(p1.getJob());
		

	
	}

}
