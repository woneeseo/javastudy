package com.naver;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class IndexEx {
	
	
	
	public void myarr() {
		int myarr[] = {1,3,5,7,9};
		int mycopy[] = new int[myarr.length];
		for(int i=0; i<myarr.length; i++) {
			mycopy[i] = myarr[i];
			
		}System.out.println(mycopy[2]);
		
	}
	
	public void name() {
		int myarr[] = {1, 3, 5, 7, 9};
		int myarr2[] = {3, 7, 2, 6, 1};
		for(int i =0; i<myarr.length; i++) {
			
			for(int j =0; j<myarr2.length; j++){
				
				if(myarr[i]==myarr2[j]) {
					
					System.out.println(i+"��° ���Ͽ��� : "+ myarr[i]);
					
			}
		}
		
		}
	}
	
	public void checkList() {
		boolean checkList[] = {true, false, false, true, false};
		for(int i=0; i<checkList.length; i++) {
			checkList[i] = !checkList[i];
			
			System.out.println(checkList[i]);
		}
		
	}
	
	public void money() {
		
		int workingTime[] = {4, 3, 5, 7, 2, 8, 6};
		
		int sum = 0;
		int sum2 =0;
		
		for(int i =0; i<7; i++) {
			if(i<5) {
				sum += workingTime[i]*5800;
					
				}else {
				
				sum2 += workingTime[i]*7300;
			}

		}
		System.out.print("�����ϰ��� �� �޿� : ");
		System.out.println(sum+sum2+"��");
	}
	
	
	public void shop() {
		int price[] = {38000, 20000, 17900, 17900};
		int qty[] = {6, 4, 3, 5};
		int pay = 0;
		
		for(int i=0; i<price.length; i++) {
			pay += price[i]*qty[i];
		}
		System.out.println(pay+" ��");
	}
	
	public void shopPay() {
		int price[] = {38000, 20000, 17900, 17900};
		int qty[] = {6, 4, 3, 5};
		int max =0;
		
		for(int i=0; i<price.length; i++) {
			int c = price[i]*qty[i];
			if(c>max) {
				max = c;
				System.out.println("���� ��� �ݾ��� "+c+"��");
			}
			
		}
	}
	
	public void freeShip() {
		int price[] = {38000, 20000, 17900, 17900};
		int qty[] = {6, 4, 3, 5};
		int count = 0;
		
		for(int i=0; i<price.length; i++) {
			int c = price[i]*qty[i];
			
			if(c>=80000) {
				count ++;
			}
		}System.out.println(count +" ��");
	}
	
	public void printNum() {
		int[] arrNum = {12, 5, 8, 30, 22, 87, 9, 4, 15, 22};
		int sum =0;
		
		System.out.println(" < ¦�� > ");
		for(int i=0; i<arrNum.length; i++) {
			
			if(arrNum[i]%2==0) {
				System.out.print(arrNum[i]+" ");
				
				sum += arrNum[i];
				
			}
		}
		System.out.println();
		System.out.println("¦���� �� �� : "+sum);
		
		int sum2 = 0;
		
		System.out.println(" < Ȧ�� > ");
		for(int i =0; i<arrNum.length; i++) {
			if(arrNum[i]%2 != 0) {
				System.out.print(arrNum[i]+" ");
				
				sum2 += arrNum[i];
			}
		}
		System.out.println();
		System.out.println("Ȧ���� �� �� :"+sum2);
	}
	
	public void prinPibo(int num) {
		
		int[] pibo = new int[num];
		for(int i=0; i<pibo.length; i++) {
			if(i<2) {
				pibo[i] = 1;
			}else {
				pibo[i] = pibo[i-2]+pibo[i-1];
				
			}System.out.print(pibo[i]+" ");
		}System.out.println();
	}
	
	public void arrSum() {
		int[] arrSum = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i =0; i<arrSum.length; i++) {
			sum += arrSum[i];
		}
		System.out.println(sum);
	}
	
	public void maxNum() {
		
		int[] arrNum = { 94, 85, 95, 88, 90 };
		
		int c =arrNum[0];
		
		for(int i = 1; i<arrNum.length; i++){
			if(arrNum[i]>c) {

				c = arrNum[i];	
			}
			
		}
		System.out.println(c);	
	}
	
	public void minNum() {
		int[] arrNum = { 94, 85, 95, 88, 90 };
		int c;
		
		for(int i=0; i<arrNum.length; i++) {
			for(int j=i+1; j<arrNum.length; j++) {
				if(arrNum[i]>arrNum[j]) {
					c = arrNum[j];
					arrNum[j] = arrNum[i];
					arrNum[i] = c;
				}
			}
		}for(int i : arrNum)
			System.out.print(i+" ");
		
	}
	
	public void me5() {
		int a[] = {56, 2, 34, 13, 17};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int n: a)
			System.out.print(n +" ");
	}

}