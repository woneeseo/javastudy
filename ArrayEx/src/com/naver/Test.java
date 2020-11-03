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
		// 1. dogs의 배열 크기를 출력하시오
		// 2. main()에서 me32메서드를 호출하시오
		//  단, 데이터가 필요하면 new Dog(),new Dog(),new Dog(),new Dog() 를 모두 이용
		int size = dogs.length;
		System.out.println(size);
		
	}
	
	public void me31() {
		// 1. 배열생성 세번째 방법으로 arrFloat 객체를 만듦
		// 2. 배열에 들어가는 값은 3.14, 4.2, 9.8
		// 3. arrFloat의 배열 크기를 출력하시오
		
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
		// 1. arrStr의 크기를 출력하시오.
		// 2. main( )에서 me22( )를 호출하시오.
		
		System.out.println(arrStr.length);
		System.out.println("**************");
		// arrStr의 인덱스가 1인 곳의 값을 "12"로 변경하시오
		arrStr[1]="12";
		// arrStr의 인덱스가 1인 곳의 값을 출력하시오.
		
		String s1 = arrStr[1];
		System.out.println(s1);
		System.out.println(arrStr[1]);
		
		int[][] arr2Int = {
				{1, 3, 5, 7},
				// 인덱스가 0인 배열상자
				{0, 2, 3, 6}
				// 인덱스가 1인 배열상자 
		};
		
		
		
		// 2차원 배열에서 하나의 요소값을 구하고 싶을 때,
		// 우선 2차원 배열을 하나 하나씩 풀어낸다
		int[] arr0Int = arr2Int[0];
		// 2차원 배열을 풀어서 인덱스가 0인 배열상자를 1차원으로 만들어줬고
		System.out.println(arr0Int[1]);
		// 1차원으로 만들어준 arr0Int 배열에서 인덱스가 1인 3을 출력했다
		// 또는
		// [배열상자가 가진 인텍스][배열상자의 값이 가지고 있는 인덱스]를
		// 직접 입력하여 출력하는 방법도 있다. 
		System.out.println(arr2Int[0][1]);
		
	}
	
	public void me21() {
		// 1. 자료형이 Dog인 1차원 배열 arrDog를 배열생성 두번째 방법으로 생성하고,
		// 그 크기를 2로 설정하시오.
		// 2. arrDog의 배열 크기를 출력하시오 
		
		Dog[] arrDog = {new Dog(), new Dog()};

//		Dog a = new Dog();
//		Dog b = new Dog();
//		Dog[] arrDog = {a, b};
		
		System.out.println(arrDog.length);
		System.out.println("::::::::::::::::");
		// arrDog 의 가장 큰 인덱스의 요소값을 null로 수정하시오
		arrDog[arrDog.length-1] = null;
		
		System.out.println(":::::::::::::::::");
		
		// 1. arrDog의 모든 요소값을 출력하시오.
		for(int i =0; i<arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		// 2. arrDog의 인덱스가 1인 요소값의 name을 출력하시오.
		// 단, 해당 요소값이 null이 아닌 경우에만
		
		if(arrDog[1] != null) {
			System.out.println(arrDog[1].getName());
		}
		
	}
	
	public void me2() {
		int[] arrInt = {1, 4, 6};
		// 배열 만드는 방법 1 = 자료형[] 변수명 = {자료형에 맞는 값1, 값2, 값3};
		System.out.println(arrInt.length);
		// arrInt 배열의 2번째 요소값을 출력하시오
	
		System.out.println(arrInt[1]);
		// arrInt 배열의 인덱스가 1인 요소값을 333으로 수정하라
		arrInt[1]=333;
		System.out.println(":::::::::::::::::");
		// arrInt가 가지고 있는 모든 요소값 출력하기
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
	
	// 배열명.length -> 반복문을 만들 때 사용
	// 배열의 크기만큼 반복해서 데이터를 가져올 수 있게 함 
	
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");
		System.out.println(arrData.length);
		
		// arrData의 가장 큰 index의 요소값을 100으로 설정하시오
		arrData[arrData.length-1] = "100";
		// arrData의 가장 작은 index의 요소값을 ezen으로 설정하시오
		arrData[0] = "ezen";
		
		// split -> 구분자를 기준으로 데이터를 나누어 반환해줌
		// split의 반환형은 String[] (String형 1차원 배열)
		
		// arrData 의 모든 요소값을 출력하시오
		
		for(int i=0; i<arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		
		// arrData 의 모든 요소값의 첫글자를 출력하시오
		for(int i=0; i<arrData.length; i++) {
			System.out.println(arrData[i].charAt(0));
		}
	}
	
	public void me12(Dog[] dogs) {
		// 1. Test 클래스의 me12( )에서 파라미터로 넘어온
		// 배열 데이터의 크기를 출력하시오
		// 2. main( )에 가서 me12( )를 호출하시오.
		
		System.out.println(dogs.length);
		
		System.out.println("******************");
		//dogs의 가장큰 인덱스의 요소값을 null로 설정하시오.
//		int largestIdx = dogs.length-1;
//		dogs[largestIdx] = null;
	
		dogs[dogs.length-1] = null;
		// 배열에서 가장 큰 인덱스를 구할 때 -> lenght-1
		
		// 1. dogs 배열에 있는 모든 요소값(=모든 dog 객체)를 출력하시오
		// 2. 출력하고 이름을 출력하시오.
		
		for(int i = 0; i<dogs.length; i++) {
			System.out.println(dogs[i]);
			if (dogs[i] != null) {
				System.out.println(dogs[i].getName());
			}
		}
	}
	
	public void me11() {
		// 배열의 크기가 100인 StringBuffer형의 1차원 배열
		// arrSb를 생성하고 arrSb의 배열 크기를 출력하시오
		// 대괄호의 숫자로 n차원 배열이 결정됨
		
		StringBuffer[] arrSb = new StringBuffer[100];
		
		System.out.println("*****************");
		// arrSb의 51번째 요소값을 출력하시오
		System.out.println(arrSb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		// arrSb의 인덱스 1번 자리에 sb1의 객체를 대입하시오
		arrSb[1] = sb1;
		
		System.out.println("*****************");
		
		System.out.println(arrSb.length);
		// .length 로 배열의 크기를 확인할 수 있음
		
		System.out.println(" %%%%%%%%%%%%% ");
		// arrSb가 갖고있는 모든 요소값을 출력한다. 단 출력 순서는 인덱스가 큰 값부터
		for(int i=arrSb.length-1; i>=0; i--) {
			System.out.println(arrSb[i]);
		}
	}
	
	public void me1() {
		int[] arrInt = new int[4];
		
		//arrInt에 0, 1, 2, 3 을 입력하시오
		for(int i =0; i<arrInt.length; i++) {
			arrInt[i] = i;
		}
		
		// arrInt에 0, 2, 4, 6을 입력하시오
		for(int i =0; i<arrInt.length; i++) {
			arrInt[i] = i*2;
		}
		
		// arrInt에 1, 3, 5, 7을 입력하세요
		for(int i = 0; i<arrInt.length; i++) {
			arrInt[i] = i*2+1;
		}

		
		// int[] -> 대괄호와 함께 쓰는 int는 참조자료형
		// 배열은 데이터가 묶인 하나의 방
		// [대괄호 안의 숫자가 배열의 크기를 결정]
		// 데이터를 최대 4개 넣을 수 있는 배열
		
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
		
		// arrInt가 갖고있는 모든 요소값을 for문을 이용해서 전부 출력하기
		
		for(int i = 0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
	
		// 반복문을 돌릴릴 때 반드시 써야함 -> arrInt.length;
		// 배열의 크기가 4라고 해서 4를 입력해버리면
		// 유지 보수가 힘들어지기 때문에
		// 반드시 배열이 가지고 있는 arrInt.length;이라는 속성을 사용할 것
		// 변수는 제각각 떨어져 저장되지만
		// 배열을 이용하면 테이터가 연속적으로 저장되기 때문에
		// 반복문을 돌리기 유용하게 함
	}
	
	public void me01() {
		int[] arr = {3,6,3,7};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

}
	

}
