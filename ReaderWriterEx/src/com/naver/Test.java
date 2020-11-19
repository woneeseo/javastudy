package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public void me9() {
		
		Writer out = null;
		PrintWriter pw = null;
		Reader in = null;
		BufferedReader br = null;
		
		try {
			
			out = new FileWriter("test.txt");
			pw = new PrintWriter(out);
			
			pw.write("���ض�");
			pw.write(System.getProperty("line.separator"));
			pw.write("�ںҼ�");
			pw.write(System.getProperty("line.separator"));
			pw.write("���찭");
			pw.write(System.getProperty("line.separator"));
			pw.write("���ڻ�");
			pw.flush();
			
			in = new FileReader("test.txt");
			br = new BufferedReader(in);
			
			
			
			while (true) {
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println(msg);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) {
					pw.close();
				}
				if(out != null) {
					out.close();
				}
				if(br != null) {
					br.close();
				}
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me888() {
		
		Reader in = null;
		
		try {
			
			in = new FileReader("test.txt");
			char[] arr = new char[1024];
			int length = -1;
			
			while(true) {
				length = in.read(arr, 0, arr.length);
				
				if(length == -1) {
					break;
				}
				
				for(int i=0; i<length; i++) {
					System.out.print(arr[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me88() {
		
		Reader in = null;
		
		try {
			
			in = new FileReader("test.txt");
			char[] arr = new char[1024];
			
			int length = -1;
			
			while(true) {
				length = in.read(arr, 0, arr.length);
				
				if(length == -1) {
					break;
				}
				
				for(int i =0; i<length; i++) {
					System.out.print(arr[i]);
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me8() {
		
		Writer out = null;
		
		try {
			out = new FileWriter("test.txt");
			
			out.write("���ض�");
			out.write(System.getProperty("line.separator"));
			out.write("�ںҼ�");
			out.write(System.getProperty("line.separator"));
			out.write("���찭");
			out.write(System.getProperty("line.separator"));
			
			out.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me7777() {
		
		Writer out = null;
		PrintWriter pw = null;
		
		try {
			
			out = new FileWriter("aaaz.txt");
			pw = new PrintWriter(out);
			
			pw.print("�ȳ��ϼ���");
			pw.print(System.getProperty("line.separator"));
			pw.print("�ݰ����ϴ�");
			pw.print(System.getProperty("line.separator"));
			pw.print("�ٺ�");
			pw.print(System.getProperty("line.separator"));
			
			pw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) {
					pw.close();
				}
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void me7() {
		
		// printWrite -- BufferedReader�� pair�� �̷�� ����
		Writer out = null;
		PrintWriter pw = null;
		
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			
			pw.print(false);
			pw.println(false);
			pw.println(false);
			
			pw.flush();
			// PrintWriter �� ���� �� flush() ȣ���� ��
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) {
					pw.close();
				}
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me6() {
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"abc.txt");
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			while(true) {
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(isr != null) {
					isr.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	public void me555() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���� �ϳ� �Է�");
		
		String sNum = br.readLine();
		int num = Integer.parseInt(sNum);
		
		System.out.println(num);
		
	}
	
	public void me444() {
		
		Reader in = null;
		BufferedReader br = null;
		
		try {
			in = new FileReader("C:"+File.separator+"abc.txt");
			br = new BufferedReader(in);
			
			while(true) {
				String msg= br.readLine();
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me5() throws Exception {
		
		// �ܼ�â���� ������� �Է��� Scanner�� �̿��ؼ� ȹ���ߴµ�
		// ������, �Ǵ� � ȸ����� ������ BufferedReader�� �̿���.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����� ���� �����ϴ� ���� �ϳ��� �Է��Ͻÿ�.");
		
		String sNum= br.readLine();
		int num = Integer.parseInt(sNum);
		
		System.out.println("����� ���� �Ⱦ��ϴ� ���� �ϳ��� �Է��Ͻÿ�.");
		
		String sNum2 = br.readLine();
		int num2 = Integer.valueOf(sNum2);
		
		System.out.println("�� ���� ���� "+(num+num2));
		
		if(br != null) {
			br.close();
		}
		
	}
	
	public void me4() {
		// input/outputó�� pair�� �̷�� Stream�� ������
		// ���� ���� ���� pair�� ������ �ʰ� ����
		// BufferedReader (pair�� �̷�� BufferedWriter�� �� ��)
		// ��彺Ʈ����!! 
		
		Reader in = null;
		BufferedReader br = null;
		
		try {
			
			in = new FileReader("C:"+File.separator+"abc.txt");
			br = new BufferedReader(in);
			
			while (true) {
				String msg = br.readLine();
				// buffered reader�� read()��� readLine()�� ����Ѵ�.
				// ���Ͱ� ���� �������� �ϳ��� �������� �ν���(���� ����)
				// readLine()�� �ҷ��� �����͸� ������ ���ڿ��� �ν���
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
				// line.separator �� �Է����༭ �ٹٲ޵Ǵ� ����
				// BufferedReader�� �о�� ����
				// br�� ������ �ǰ� �������. 
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me3() {
		
		Reader in = null;
		Writer out = null;
		
		try {
			out = new FileWriter("C:"+File.separator+"abc.txt");

			out.write("1");
			out.write(System.getProperty("line.separator"));
			out.write("2");
			out.write(System.getProperty("line.separator"));
			out.write("3");
			out.write(System.getProperty("line.separator"));
			out.write("4");
			out.write(System.getProperty("line.separator"));
			out.write("�����");
			out.write(System.getProperty("line.separator"));
			out.write("5");
			out.write(System.getProperty("line.separator"));
			
			out.flush();
			// ������ �Է��� �� �ϸ� flush()�� �Է���
			// ����� Ư�� ����� ���� �� ������
			// ������ �Է��� ������ �ݵ�� flush()�� �����ش�
		
			in = new FileReader("C:"+File.separator+"abc.txt");
			
			char[] arr = new char[1024];
			
			int length = -1;
			
			while(true) {
				
				length = in.read(arr, 0, arr.length);
				if(length == -1) {
					break;
				}
				
				for(int i=0; i<length; i++) {
					System.out.print(arr[i]);
				}
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
				if(out != null) {
					out.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void ame22() {
		
		Reader in = null;
		
		try {
			in = new FileReader("C:"+File.separator+"SS.txt");
			char[] arr = new char[1024];
			// er��Ʈ���� ���ڿ���Ʈ���̱� ������ char�� �⺻�ڷ������� �Ѵ�.
			int length = -1;
			while(true) {
				length = in.read(arr, 0, arr.length);
				// char�� �迭 arr�� �о���µ�, 0���� �迭�� ũ�⸸ŭ �о�� ����
				// length�� �ش� => �迭 ��ü�� �ƴ϶�
				// ���� �ִ� �迭�� �ε��� ��ŭ�� lenght�� �����
				if(length == -1) {
					break;
				}
				
				for(int i=0; i<length; i++) {
					// length�� ���� = �������� �ε����� �� ������ ������ ����Ǿ��־
					// arr.length�� �ع����� �Ǹ�, 1024��ŭ �����͸� �ҷ����� ������
					// length�� ������ �ʰ���, ��ġ �ʴ� �����͸� �ҷ��� �� ����
					System.out.print(arr[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me222() {
		
		Reader in = null;
		
		try {
			
			in = new FileReader("C:"+File.separator+"SS.txt");
			
			int what = -1;
			while(true) {
				what = in.read();
				if(what == -1){
					break;
				}
				
				System.out.print((char)what);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me2222() {
		
		Reader in = null;
		
		try {
			in = new FileReader("C:"+File.separator+"SS.txt");
			char[] arr = new char[1024];
			
			int length = -1;
			
			while(true) {
				length = in.read(arr, 0, arr.length);
				if(length == -1) {
					break;
				}
				
				for(int i=0; i<length; i++) {
					System.out.println(arr[i]);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me2() {
		
		Reader in = null;
		
		try {
			in = new FileReader("C:"+File.separator+"SS.txt");
			
			char[] arr = new char[1024];
			
			int length = -1;
			
			while (true) {
				length = in.read(arr, 0, arr.length);
				if(length == -1) {
					break;
				}
				
				for(int i=0; i<length; i++) {
					// �迭�� ���̸�ŭ�� �ƴ϶�, �о�� �������� �ε���������!
					System.out.print(arr[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me1111() {
		
		Writer out = null;
		
//		String[] arr = {"hello", "world", "good"};
		List<String> list = new ArrayList<String>();
		
		list.add("kim");
		list.add("hello");
		list.add("world");
		list.add("good");
		
		
		try {
			out = new FileWriter("C:"+File.separator+"text.txt");
			
//			for(int i=0; i<arr.length; i++) {
//				out.write(arr[i]);
//				out.write(System.getProperty("line separator"));
//			}
			
			for(int j=0; j<list.size(); j++) {
				out.write(list.get(j));
				out.write(System.getProperty("line.separator"));
			}
			
			out.flush();
			System.out.println("���� �Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me1() {
		
		Writer out = null;
		
		String[] arr = {"hello", "World", "good"};
		try {
			
			out = new FileWriter("C:"+File.separator+"SS.txt");
			out.write("kim");
			out.write(System.getProperty("line.separator"));
			// �ٹٲ� => System.getProperty("line.seperator")
			
			for(int i=0; i<arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			
			out.flush();
			// ������� ���ÿ� �����Ǿ����� ��� �ݵ�� flush()�� ����ؾ� ��
			System.out.println("end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
					// ���ڽ�Ʈ�������� close()
					// �޸�����
					// ��Ʈ�� �ȿ� �����Ͱ� �������� ��찡 �־ close��
					// ���� �����Ͱ� ������ ������ �����͸� ��������
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
