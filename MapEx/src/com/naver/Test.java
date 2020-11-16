package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map interface
public class Test {

	
	public void me6() {
		
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		// map�� ���� �ΰ����� ���´�.
		// index������ �� key�� ���� ��Ÿ���� value
		// key�� value���� � �ڷ����̵� �� �� �ִ�
		// List<dog> �����ڷ����� �� map������ �ڹ� �÷��� �����ӿ�ũ
		
		List<Dog> list1 = new ArrayList<Dog>();
		// ������ list�� �־���� ������ list�� ������ְ�
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));
		// dogŬ������ �����ڸ� �̿��ؼ� ��ü�� ���� �����
		// list�� add�����.
		
		List<Dog> list2 = new ArrayList<Dog>();
		// value�� list������ �ޱ� ������ �������� list�� ���� ������
		
		list2.add(new Dog("d003", "happy", "������1", 3));
		list2.add(new Dog("d004", "Ÿũ", "������2", 2));
		
		// ������ list�� ������ ��ü���� map�� �ϳ��� Ű����� ��������
		map.put("������", list1);
		map.put("���۵�", list2);
		
		System.out.println(map.get("������"));
		// [Dog [id=d001, name=������], Dog [id=d002, name=�鱸]]
		System.out.println(map.get("���۵�"));
		// [Dog [id=d003, name=happy], Dog [id=d004, name=Ÿũ]]
		
		// list�� ���� ��ü�� �ϳ� �ϳ��� ���� ������ �˰���� ��,
		// �ݺ����� ����ؼ� �ϳ��� Ǯ���.
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
			//Dog [id=d001, name=������]
			//Dog [id=d002, name=�鱸]
			System.out.println(list1.get(i).getName());
			// ������ �鱸
		}
		
		// ���ϴ� ������ ����� �� �ִ�.
		
		
	}
	
	
	
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
	
		// �ܺο��� ���� �Է����ָ� ���� Ȯ���ڸ� ������ �����з��� ����
		// �� �ܿ��� �ý��������Դϴ�. �� ��µǵ��� ��.
		
		// String class ����*
		
		int idx = filename.lastIndexOf(".");
		// �� ������ . �� ã�Ƽ� �� �ڸ� �߶󳻱� ���ؼ� ������ .�� �ε����� ����
		// lastindexof. .�� �������� �������� Ȯ���ڱ� ����
		String key = filename.substring(idx+1);
		// .�ε��� �������� �߶󳻾� �ϴϱ� �ε������� +1
		String msg = map.get(key.toLowerCase());
		// Ȥ�ö� �빮�ڷ� �Ǿ��ִ� ���ϸ��� �Ͻ������� �ҹ��ڷ� �ٲ㼭
		// �Էµ� �� �ֵ��� toLowerCase() ���
		
		if(msg==null) {
			// map�� ���� key�� �Է��ϸ� value�� null�� ��ȯ�ϱ� ������
			// msg�� null�̸� �ý������� �� ����ϵ��� ��.
			System.out.println("�ý�������");
		}else {
			System.out.println(msg);
		}
	
	}
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		
		List<Dog> list1 = new ArrayList<Dog>();
		
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		
		list2.add(new Dog("d003", "happy", "������1", 3));
		list2.add(new Dog("d004", "Ÿũ", "������2", 2));
		
		map.put("������", list1);
		map.put("���۵�", list2);
		
		List<Dog> jindo = map.get("������");
		System.out.println(jindo);
		for(int i=0; i<jindo.size(); i++) {
			Dog dog = jindo.get(i);
			System.out.println(dog.getId());
		}
		
		
		
		List<Dog> spt = map.get("���۵�");
		System.out.println(spt);
		
		
		
	}
	
	public void me3() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exell");
		list1.add("genesis");
		list1.add("grandure");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("zeep");
		
		
		map.put("������", list1);
		map.put("�����", list2);
		
		
		// list<>�� ������ ���� ���, 
		// key�� ���� ȣ���ϸ� list������ ���� ��µȴ�
		// [sonata, exell, genesis, grandure]
		
		// ������ ��ü�� �����ϰ� ���� ���,
		// for���� �̿��� list���� �ϳ��ϳ� ��ü�� ������ ��
		// ���ϴ� ��ü�� �����ϸ� ��
		//		sonata
		//		exell
		//		genesis
		//		grandure
		
		List<String> hyundai = map.get("������");
		System.out.println(hyundai);
		for(int i =0; i<hyundai.size(); i++) {
			System.out.println(hyundai.get(i));
		}
		
		List<String> kia = map.get("�����");
		System.out.println(kia);
		for(int i =0; i<kia.size(); i++) {
			System.out.println(kia.get(i));
		}
		
	}
	
	public void me2() {
		//1. map ��ü�� ������
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2,"park");
		map.put(1, "kang");
		// key�� �ߺ��Ǵ� ���,
		// key�� 1�� �� kim->kang���� �ٲ�
		
		String a = map.get(0);
		System.out.println(a);
		String b = map.get(1);
		System.out.println(b);
		String c = map.get(2);
		System.out.println(c);
				
		
	}
	
	public void me1() {
		// 1. map , hashmap
		// 2. map ��ü�� ������
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map�� ���׸�Ÿ���� 2������ ���.
		// ���ؽ� (key)�� ������ ����� �� �� �ֵ��� ����
		// � �ڷ����̵��� �ε����� ����� ����� �� ����(key)
		
		// map�� ������ �Է��ϱ�
		// �����͸� 2�� �־���ϴ� ��� -> put
		map.put("�߷°��ӵ�", 9);
		map.put("�츮�� ��й�ȣ", 12345);
		map.put("����� �λ갣�� �Ÿ�", 300);
		// key�� �ߺ��Ǿ�� �ȵ�����, value�� �ߺ��Ǿ �������
		
		int g = map.get("�߷°��ӵ�");
		System.out.println(g);
		
		int password = map.get("�츮�� ��й�ȣ");
		System.out.println(password);
		
		int leng = map.get("����� �λ갣�� �Ÿ�");
		System.out.println(leng);
		
		System.out.println(map);
		
	}

}
