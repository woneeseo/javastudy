package com.naver;


public class Test {
	
	public void num() {
		int num[] = new int[100];
		System.out.println(num.length);
		System.out.println(num[45]);
		num[num.length-1] = 458;
		System.out.println(num[99]);
	}
	
	
	
	public void me32(Dog[] dogs) {
		// 1. dogs�� �迭 ũ�⸦ ����Ͻÿ�
		// 2. main()���� me32�޼��带 ȣ���Ͻÿ�
		//  ��, �����Ͱ� �ʿ��ϸ� new Dog(),new Dog(),new Dog(),new Dog() �� ��� �̿�
		int size = dogs.length;
		System.out.println(size);
		
	}
	
	public void me31() {
		// 1. �迭���� ����° ������� arrFloat ��ü�� ����
		// 2. �迭�� ���� ���� 3.14, 4.2, 9.8
		// 3. arrFloat�� �迭 ũ�⸦ ����Ͻÿ�
		
		Float[] arrFloat = new Float[] {3.14F, 4.2F, 9.8F};
		System.out.println(arrFloat.length);
	}
	
	public void me3() {
		int[] arrInt = new int[] {1, 3, 5, 7};
		System.out.println(arrInt.length);
		System.out.println();
		
		System.out.println("************");
		System.out.println(arrInt[2]);
		arrInt[2] = 9;
		System.out.println(arrInt[2]+arrInt[0]);
	}
	
	
	
	
	public void me22(String[] arrStr) {
		// 1. arrStr�� ũ�⸦ ����Ͻÿ�.
		// 2. main( )���� me22( )�� ȣ���Ͻÿ�.
		
		System.out.println(arrStr.length);
		System.out.println("**************");
		// arrStr�� �ε����� 1�� ���� ���� "12"�� �����Ͻÿ�
		arrStr[1]="12";
		// arrStr�� �ε����� 1�� ���� ���� ����Ͻÿ�.
		
		String s1 = arrStr[1];
		System.out.println(s1);
		System.out.println(arrStr[1]);
		
		int[][] arr2Int = {
				{1, 3, 5, 7},
				// �ε����� 0�� �迭����
				{0, 2, 3, 6}
				// �ε����� 1�� �迭���� 
		};
		
		
		
		// 2���� �迭���� �ϳ��� ��Ұ��� ���ϰ� ���� ��,
		// �켱 2���� �迭�� �ϳ� �ϳ��� Ǯ���
		int[] arr0Int = arr2Int[0];
		// 2���� �迭�� Ǯ� �ε����� 0�� �迭���ڸ� 1�������� ��������
		System.out.println(arr0Int[1]);
		// 1�������� ������� arr0Int �迭���� �ε����� 1�� 3�� ����ߴ�
		// �Ǵ�
		// [�迭���ڰ� ���� ���ؽ�][�迭������ ���� ������ �ִ� �ε���]��
		// ���� �Է��Ͽ� ����ϴ� ����� �ִ�. 
		System.out.println(arr2Int[0][1]);
		
	}
	
	public void me21() {
		// 1. �ڷ����� Dog�� 1���� �迭 arrDog�� �迭���� �ι�° ������� �����ϰ�,
		// �� ũ�⸦ 2�� �����Ͻÿ�.
		// 2. arrDog�� �迭 ũ�⸦ ����Ͻÿ� 
		
		Dog[] arrDog = {new Dog(), new Dog()};

//		Dog a = new Dog();
//		Dog b = new Dog();
//		Dog[] arrDog = {a, b};
		
		System.out.println(arrDog.length);
		System.out.println("::::::::::::::::");
		// arrDog �� ���� ū �ε����� ��Ұ��� null�� �����Ͻÿ�
		arrDog[arrDog.length-1] = null;
		
		System.out.println(":::::::::::::::::");
		
		// 1. arrDog�� ��� ��Ұ��� ����Ͻÿ�.
		for(int i =0; i<arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		// 2. arrDog�� �ε����� 1�� ��Ұ��� name�� ����Ͻÿ�.
		// ��, �ش� ��Ұ��� null�� �ƴ� ��쿡��
		
		if(arrDog[1] != null) {
			System.out.println(arrDog[1].getName());
		}
		
	}
	
	public void me2() {
		int[] arrInt = {1, 4, 6};
		// �迭 ����� ��� 1 = �ڷ���[] ������ = {�ڷ����� �´� ��1, ��2, ��3};
		System.out.println(arrInt.length);
		// arrInt �迭�� 2��° ��Ұ��� ����Ͻÿ�
	
		System.out.println(arrInt[1]);
		// arrInt �迭�� �ε����� 1�� ��Ұ��� 333���� �����϶�
		arrInt[1]=333;
		System.out.println(":::::::::::::::::");
		// arrInt�� ������ �ִ� ��� ��Ұ� ����ϱ�
		for(int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		System.out.println(":::::::::::::::::");
		for(int i=0; i<arrInt.length; i++) {
			if(i==1) {
				continue;
			}System.out.println(arrInt[i]);
		}
		System.out.println(":::::::::::::::::");
		for(int i=0; i<arrInt.length; i++) {
			if(arrInt[i]==6) {
				continue;
			}System.out.println(arrInt[i]);
		}
	}
	
	// �迭��.length -> �ݺ����� ���� �� ���
	// �迭�� ũ�⸸ŭ �ݺ��ؼ� �����͸� ������ �� �ְ� �� 
	
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");
		System.out.println(arrData.length);
		
		// arrData�� ���� ū index�� ��Ұ��� 100���� �����Ͻÿ�
		arrData[arrData.length-1] = "100";
		// arrData�� ���� ���� index�� ��Ұ��� ezen���� �����Ͻÿ�
		arrData[0] = "ezen";
		
		// split -> �����ڸ� �������� �����͸� ������ ��ȯ����
		// split�� ��ȯ���� String[] (String�� 1���� �迭)
		
		// arrData �� ��� ��Ұ��� ����Ͻÿ�
		
		for(int i=0; i<arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		
		// arrData �� ��� ��Ұ��� ù���ڸ� ����Ͻÿ�
		for(int i=0; i<arrData.length; i++) {
			System.out.println(arrData[i].charAt(0));
		}
	}
	
	public void me12(Dog[] dogs) {
		// 1. Test Ŭ������ me12( )���� �Ķ���ͷ� �Ѿ��
		// �迭 �������� ũ�⸦ ����Ͻÿ�
		// 2. main( )�� ���� me12( )�� ȣ���Ͻÿ�.
		
		System.out.println(dogs.length);
		
		System.out.println("******************");
		//dogs�� ����ū �ε����� ��Ұ��� null�� �����Ͻÿ�.
//		int largestIdx = dogs.length-1;
//		dogs[largestIdx] = null;
	
		dogs[dogs.length-1] = null;
		// �迭���� ���� ū �ε����� ���� �� -> lenght-1
		
		// 1. dogs �迭�� �ִ� ��� ��Ұ�(=��� dog ��ü)�� ����Ͻÿ�
		// 2. ����ϰ� �̸��� ����Ͻÿ�.
		
		for(int i = 0; i<dogs.length; i++) {
			System.out.println(dogs[i]);
			if (dogs[i] != null) {
				System.out.println(dogs[i].getName());
			}
		}
	}
	
	public void me11() {
		// �迭�� ũ�Ⱑ 100�� StringBuffer���� 1���� �迭
		// arrSb�� �����ϰ� arrSb�� �迭 ũ�⸦ ����Ͻÿ�
		// ���ȣ�� ���ڷ� n���� �迭�� ������
		
		StringBuffer[] arrSb = new StringBuffer[100];
		
		System.out.println("*****************");
		// arrSb�� 51��° ��Ұ��� ����Ͻÿ�
		System.out.println(arrSb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		// arrSb�� �ε��� 1�� �ڸ��� sb1�� ��ü�� �����Ͻÿ�
		arrSb[1] = sb1;
		
		System.out.println("*****************");
		
		System.out.println(arrSb.length);
		// .length �� �迭�� ũ�⸦ Ȯ���� �� ����
		
		System.out.println(" %%%%%%%%%%%%% ");
		// arrSb�� �����ִ� ��� ��Ұ��� ����Ѵ�. �� ��� ������ �ε����� ū ������
		for(int i=arrSb.length-1; i>=0; i--) {
			System.out.println(arrSb[i]);
		}
	}
	
	public void me1() {
		int[] arrInt = new int[4];
		
		//arrInt�� 0, 1, 2, 3 �� �Է��Ͻÿ�
		for(int i =0; i<arrInt.length; i++) {
			arrInt[i] = i;
		}
		
		// arrInt�� 0, 2, 4, 6�� �Է��Ͻÿ�
		for(int i =0; i<arrInt.length; i++) {
			arrInt[i] = i*2;
		}
		
		// arrInt�� 1, 3, 5, 7�� �Է��ϼ���
		for(int i = 0; i<arrInt.length; i++) {
			arrInt[i] = i*2+1;
		}

		
		// int[] -> ���ȣ�� �Բ� ���� int�� �����ڷ���
		// �迭�� �����Ͱ� ���� �ϳ��� ��
		// [���ȣ ���� ���ڰ� �迭�� ũ�⸦ ����]
		// �����͸� �ִ� 4�� ���� �� �ִ� �迭
		
		System.out.println(arrInt.length);
		System.out.println(">>>>>>>>>>>>>");
		
		arrInt[0] = 100;
		arrInt[1] = 200;
		arrInt[2] = 300;
		arrInt[3] = 400;
		
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println(">>>>>>>>>>>>>");
		
		// arrInt�� �����ִ� ��� ��Ұ��� for���� �̿��ؼ� ���� ����ϱ�
		
		for(int i = 0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
	
		// �ݺ����� ������ �� �ݵ�� ����� -> arrInt.length;
		// �迭�� ũ�Ⱑ 4��� �ؼ� 4�� �Է��ع�����
		// ���� ������ ��������� ������
		// �ݵ�� �迭�� ������ �ִ� arrInt.length;�̶�� �Ӽ��� ����� ��
		// ������ ������ ������ ���������
		// �迭�� �̿��ϸ� �����Ͱ� ���������� ����Ǳ� ������
		// �ݺ����� ������ �����ϰ� ��
	}
	
	public void me01() {
		int[] arr = {3,6,3,7};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

}
	

}