package com.naver;
// 11월 4일
// 다차원배열
// 가변형배열
public class Test {
	
	public void me66() {
		int num[]=new int[]{3,2,5,6,1};
		
		for(int i=0; i<num.length; i++) {
			for(int j=1; j<=num[i]; j++) {
				System.out.print('@');
				
			}System.out.println();
			
		
		}

	
	}
	
	public void averageScore() {
		int[] score = {60, 95, 88};
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ sum/score.length);
	
	}
	
	
	public void me2222() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			if(i/4==0) {
				arr[i] = i;
			}
		}
	}
	
	public void me111() {
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	
	
	public void kurabe() {
		String[] arr1 = {"hello", "world", "every", "day"};
		String[] arr2 =	{"bye", "world", "great","day"};
		
		for(int i=0; i<arr1.length; i++) {
				
			if(arr1[i]==arr2[i]) {
					System.out.println(arr1[i]+"는 동일원소");
				}
		}
		
		

	}	
	
	public void printPibo() {
		int[] arrPibo = new int[10];
		
		arrPibo[0] =1;
		arrPibo[1] =1;
		
		for(int i=2; i<arrPibo.length; i++) {
			
			arrPibo[i] = arrPibo[i-2]+arrPibo[i-1];
			
		}
		for(int i : arrPibo)
			System.out.print(i+" ");
	}
	
	
	
	public void switchNum() {
		int[] arrSwitch = new int[7];
		int a = 1;
		for(int i=0; i<arrSwitch.length; i++) {
			
			a = 1-a;
			arrSwitch[i] = a;
			System.out.print(arrSwitch[i]+" ");
		}
	}
	
	public void me5() {
		int[][] arr = new int[3][];
		// n-1차원 배열의 값은 반드시 정해줘야 하지만
		// n-2차원 배열의 값은 없어도 오류가 나지 않음 => 가변형배열
		// 가변형 배열은 반복문으로 값을 입력해 줄 수 없음
		// 배열 만들기 3번 방법으로 값을 입력해줘야함
		
		// 인덱스가 0번인 곳 ; 1,2,3,4
		// 인덱스가 1번 : 0,2,4
		// 인덱스가 2번 : 1 3 5 7 9
		arr[0] = new int[] {1, 2, 3, 4};
		arr[1] = new int[] {0, 2, 4};
		arr[2] = new int[] {1, 3, 5, 7, 9};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}System.out.println();
	}
	
	
	public void me4() {
		int[][] arr = new int[3][10];
		// 인덱스가 0번 1~10
		// 인덱스가 1번 0~20까지 짝수 10개
		// 인덱스가 2번 1~21까지 홀수 10개
		
		
		for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if(i==0) {
						arr[i][j] = i+1;
					}else if(i==1) {
						arr[i][j] = i*2;
					}else {
						arr[i][j] = i*2+1;
					}
			}
		}	
		
	}
	
	
	
	public void me3() {
		int[][] arr1 = {
				{4, 1, 0},
				{4, 1, 8},
				{5, 7, 1}   // 3x3 2차원배열
		};
		
		String[][] arr2 = {
				{"good", "oh", "my"},
				{"god", "thank", "you"} // 2x3 2차원배열
		};
		
		// 5~4로 순환되면서 배열에 들어감
		// int형 3차원 arr3은 3x1x4 크기이다
		int[][][] arr3 = {
				{
					{5, 6, 7, 8}
				},
				{
					{9, 0, 1, 2}
				},
				{
					{3, 4, 5, 6}
				}
		};
		
		// arr3 의 마지막 인덱스의 요소값의 첫번째 요소값을 출력하시오
		System.out.println(arr3[arr3.length-1][0]);
		// 요소값이 배열로 출력되므로 정확한 값이 아니라 
		// [ 로 시작하는 코드로 출력됨
		
		
		
		
		
		// 5~4로 순환되면서 배열에 들어감
		// int형 2차원 배열 arr4는 5x3크기를 갖는다
		int[][] arr4 = {
				
				{5, 6, 7},
				{8, 9, 0},
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// arr4의 [2][1]의 요소값을 100으로 수정하여라
		
		arr4[2][1] = 100;
		
		// arr4의 3번째 요소값의 최종 요소값을 구하라
		for(int i =0; i<arr4[2].length; i++) {
			System.out.println(arr4[2][i]);
		}
	}
	
	

	public void me31() {
		String[][] arrStr = new String[7][3];
		// String형 자료를 갖는 크기가 3인 1차원 배열을
		// 7개 가지고 있는 2차원 배열
		// 크기가 3인 1차원배열 * 7 개 = arrStr[][]
		// arrStr[][]에서 요소값을 뽑아내면
		// arrStr[] =>왜? arrStr[][]을 구성하고 있는 요소가
		// 하나하나의 arrStr[] 이니까 요소값을 뽑아내면 arrStr[] 가 뽑아지는것임
		System.out.println(arrStr.length);
		// 2차원배열의 크기를 출력해보자 -> 7 출력됨
		System.out.println(arrStr[0].length);
		// 2차원배열이 가지고있는 0번 인덱스의 크기를 출력해보자 -> 3출력됨
		System.out.println();
		
		arrStr[4][0] = "hello";
		arrStr[6][1] = "new";
		arrStr[1][2] = "world";
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
			// arrStr[][]의 요소값을 출력하는 식 
			for(int j=0; j<arrStr[i].length; j++) {
				System.out.println(arrStr[i][j]);
				// arrStr[] 이 가지고있는 최종 요소값을 모두 출력하는 식
				
				// 2차원배열 arrStr의 i번째 인덱스의 1차원배열이 가지고 있는
				// j번째 인덱스의 요소값을 출력하는 식임
			}
			
		}
		
	}
	
	public void me22() {
		int[][] arr = new int[5][4];
		// 1. arr의 모든 요소값을 출력하시오
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			// 2. arr의 최종 요소값을 모두 출력하시오
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		// 3. arr의 인덱스가 0인 요소값의 인덱스가 2인 요소값을 출력하여라.
		System.out.println(arr[0][2]);
		// 4. arr의 가장 큰 인덱스의 요소값의 가장 작은 인덱스의 요소값을 100으로
		arr[arr.length-1][0] = 100;
		// 5. arr의 가장 큰 인덱스의 요소값의 가장 작은 인덱스의 요소값을 출력
		System.out.println(arr[arr.length-1][0]);
		
	}
	
	public void me21() {
		// 최종 요소값의 자료형이 Dog인 2차원 배열 arr의 크기는 10이고
		// 그 안에 있는 배열의 크기는 2이다.
		
		Dog[][] arr = new Dog[10][2];
		// arr의 모든 요소값을 출력하시오

		for(int i=0; i<arr.length; i++) {
			// Dog[] dogs = arr[i];
			System.out.println(arr[i]);
		
		 
		    // arr의 최종 요소값을 모두 출력하시오.
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		
		
	}
	
	public void me2() {
		// 최종 요소값의 자료형이 StringBuffer인 2차원 배열 arr에는 
		// 5개의 1차원 배열이 있다
		// 그리고 그 안에 있는 1차원 배열의 크기는 3이다.
		
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);
		// 2차원배열의 크기에 접근하는 방법
		System.out.println(arr[0].length);
		// 2차원배열 안에 있는 1차원배열의 크기에 접근하는 방법
		
		
		
	}
	
	public void me1() {
		// 2차원 배열
		// 2차원 배열 안에는 1차원 배열이 들어있다.**
		// 최종 요소값의 자료형이 int인 2차원 배열을 선언하시오
		// 배열은 배열 안에 들어갈 데이터의 자료형이 같아야한다. 
		int[][] arr;
		
	}
	
	

}
