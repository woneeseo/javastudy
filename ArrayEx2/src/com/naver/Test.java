package com.naver;
// 11�� 4��
// �������迭
// �������迭
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
		}System.out.println("���� : "+ sum);
		System.out.println("��� : "+ sum/score.length);
	
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
					System.out.println(arr1[i]+"�� ���Ͽ���");
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
		// n-1���� �迭�� ���� �ݵ�� ������� ������
		// n-2���� �迭�� ���� ��� ������ ���� ���� => �������迭
		// ������ �迭�� �ݺ������� ���� �Է��� �� �� ����
		// �迭 ����� 3�� ������� ���� �Է��������
		
		// �ε����� 0���� �� ; 1,2,3,4
		// �ε����� 1�� : 0,2,4
		// �ε����� 2�� : 1 3 5 7 9
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
		// �ε����� 0�� 1~10
		// �ε����� 1�� 0~20���� ¦�� 10��
		// �ε����� 2�� 1~21���� Ȧ�� 10��
		
		
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
				{5, 7, 1}   // 3x3 2�����迭
		};
		
		String[][] arr2 = {
				{"good", "oh", "my"},
				{"god", "thank", "you"} // 2x3 2�����迭
		};
		
		// 5~4�� ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 3���� arr3�� 3x1x4 ũ���̴�
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
		
		// arr3 �� ������ �ε����� ��Ұ��� ù��° ��Ұ��� ����Ͻÿ�
		System.out.println(arr3[arr3.length-1][0]);
		// ��Ұ��� �迭�� ��µǹǷ� ��Ȯ�� ���� �ƴ϶� 
		// [ �� �����ϴ� �ڵ�� ��µ�
		
		
		
		
		
		// 5~4�� ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 2���� �迭 arr4�� 5x3ũ�⸦ ���´�
		int[][] arr4 = {
				
				{5, 6, 7},
				{8, 9, 0},
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// arr4�� [2][1]�� ��Ұ��� 100���� �����Ͽ���
		
		arr4[2][1] = 100;
		
		// arr4�� 3��° ��Ұ��� ���� ��Ұ��� ���϶�
		for(int i =0; i<arr4[2].length; i++) {
			System.out.println(arr4[2][i]);
		}
	}
	
	

	public void me31() {
		String[][] arrStr = new String[7][3];
		// String�� �ڷḦ ���� ũ�Ⱑ 3�� 1���� �迭��
		// 7�� ������ �ִ� 2���� �迭
		// ũ�Ⱑ 3�� 1�����迭 * 7 �� = arrStr[][]
		// arrStr[][]���� ��Ұ��� �̾Ƴ���
		// arrStr[] =>��? arrStr[][]�� �����ϰ� �ִ� ��Ұ�
		// �ϳ��ϳ��� arrStr[] �̴ϱ� ��Ұ��� �̾Ƴ��� arrStr[] �� �̾����°���
		System.out.println(arrStr.length);
		// 2�����迭�� ũ�⸦ ����غ��� -> 7 ��µ�
		System.out.println(arrStr[0].length);
		// 2�����迭�� �������ִ� 0�� �ε����� ũ�⸦ ����غ��� -> 3��µ�
		System.out.println();
		
		arrStr[4][0] = "hello";
		arrStr[6][1] = "new";
		arrStr[1][2] = "world";
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
			// arrStr[][]�� ��Ұ��� ����ϴ� �� 
			for(int j=0; j<arrStr[i].length; j++) {
				System.out.println(arrStr[i][j]);
				// arrStr[] �� �������ִ� ���� ��Ұ��� ��� ����ϴ� ��
				
				// 2�����迭 arrStr�� i��° �ε����� 1�����迭�� ������ �ִ�
				// j��° �ε����� ��Ұ��� ����ϴ� ����
			}
			
		}
		
	}
	
	public void me22() {
		int[][] arr = new int[5][4];
		// 1. arr�� ��� ��Ұ��� ����Ͻÿ�
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			// 2. arr�� ���� ��Ұ��� ��� ����Ͻÿ�
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		// 3. arr�� �ε����� 0�� ��Ұ��� �ε����� 2�� ��Ұ��� ����Ͽ���.
		System.out.println(arr[0][2]);
		// 4. arr�� ���� ū �ε����� ��Ұ��� ���� ���� �ε����� ��Ұ��� 100����
		arr[arr.length-1][0] = 100;
		// 5. arr�� ���� ū �ε����� ��Ұ��� ���� ���� �ε����� ��Ұ��� ���
		System.out.println(arr[arr.length-1][0]);
		
	}
	
	public void me21() {
		// ���� ��Ұ��� �ڷ����� Dog�� 2���� �迭 arr�� ũ��� 10�̰�
		// �� �ȿ� �ִ� �迭�� ũ��� 2�̴�.
		
		Dog[][] arr = new Dog[10][2];
		// arr�� ��� ��Ұ��� ����Ͻÿ�

		for(int i=0; i<arr.length; i++) {
			// Dog[] dogs = arr[i];
			System.out.println(arr[i]);
		
		 
		    // arr�� ���� ��Ұ��� ��� ����Ͻÿ�.
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		
		
	}
	
	public void me2() {
		// ���� ��Ұ��� �ڷ����� StringBuffer�� 2���� �迭 arr���� 
		// 5���� 1���� �迭�� �ִ�
		// �׸��� �� �ȿ� �ִ� 1���� �迭�� ũ��� 3�̴�.
		
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);
		// 2�����迭�� ũ�⿡ �����ϴ� ���
		System.out.println(arr[0].length);
		// 2�����迭 �ȿ� �ִ� 1�����迭�� ũ�⿡ �����ϴ� ���
		
		
		
	}
	
	public void me1() {
		// 2���� �迭
		// 2���� �迭 �ȿ��� 1���� �迭�� ����ִ�.**
		// ���� ��Ұ��� �ڷ����� int�� 2���� �迭�� �����Ͻÿ�
		// �迭�� �迭 �ȿ� �� �������� �ڷ����� ���ƾ��Ѵ�. 
		int[][] arr;
		
	}
	
	

}