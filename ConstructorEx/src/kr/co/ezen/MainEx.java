package kr.co.ezen;

public class MainEx {
// ��ü ���� �ż��� ȣ���ϱ� 
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		// �����ڴ� Ŭ���� �ܺο��� ȣ�� �ɶ����� ���ο� ��ü�� �������
		Test1 t2 = new Test1();
		
		t1 = new Test1();
		
		Test1 t3 = new Test1(34L);
		
		Test1 t4 = new Test1(4, 5);
		
		Person kim0 = new Person();
		
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getAdderss());
		System.out.println(kim0.getJob());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getCar());
		
		System.out.println();
		
		kim0.setSsn("s01");
		kim0.setName("kim");
		kim0.setAge(44);
		kim0.setAdderss("seoul");
		kim0.setJob("lec");
		kim0.setDog(new Dog());
		kim0.setCar(new Car());
		
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getAdderss());
		System.out.println(kim0.getJob());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getCar());
		
		
		
		Person kim1 = new Person("s01", "kim", 44, "seoul", "lec", new Dog(), null);
		
		System.out.println(kim1.getSsn());
		System.out.println(kim1.getName());
		System.out.println(kim1.getAge());
		System.out.println(kim1.getAdderss());
		System.out.println(kim1.getJob());
		System.out.println(kim1.getDog());
		System.out.println(kim1.getCar());
		
	}
	
	

}
