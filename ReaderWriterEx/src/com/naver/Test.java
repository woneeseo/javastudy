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
			
			pw.write("조극락");
			pw.write(System.getProperty("line.separator"));
			pw.write("박불소");
			pw.write(System.getProperty("line.separator"));
			pw.write("서우강");
			pw.write(System.getProperty("line.separator"));
			pw.write("김자빱");
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
			
			out.write("조극락");
			out.write(System.getProperty("line.separator"));
			out.write("박불소");
			out.write(System.getProperty("line.separator"));
			out.write("서우강");
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
			
			pw.print("안녕하세요");
			pw.print(System.getProperty("line.separator"));
			pw.print("반갑습니다");
			pw.print(System.getProperty("line.separator"));
			pw.print("바보");
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
		
		// printWrite -- BufferedReader와 pair를 이루며 쓰임
		Writer out = null;
		PrintWriter pw = null;
		
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			
			pw.print(false);
			pw.println(false);
			pw.println(false);
			
			pw.flush();
			// PrintWriter 는 끝에 꼭 flush() 호출할 것
			
			
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
		
		System.out.println("숫자 하나 입력");
		
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
		
		// 콘솔창에서 사용자의 입력을 Scanner를 이용해서 획득했는데
		// 예전에, 또는 어떤 회사들은 아직도 BufferedReader를 이용함.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("당신이 가장 좋아하는 숫자 하나를 입력하시오.");
		
		String sNum= br.readLine();
		int num = Integer.parseInt(sNum);
		
		System.out.println("당신이 가장 싫어하는 숫자 하나를 입력하시오.");
		
		String sNum2 = br.readLine();
		int num2 = Integer.valueOf(sNum2);
		
		System.out.println("두 수의 합은 "+(num+num2));
		
		if(br != null) {
			br.close();
		}
		
	}
	
	public void me4() {
		// input/output처럼 pair를 이루는 Stream이 많지만
		// 지금 배우는 것은 pair를 맞추지 않고 배운다
		// BufferedReader (pair를 이루는 BufferedWriter는 안 씀)
		// 노드스트림임!! 
		
		Reader in = null;
		BufferedReader br = null;
		
		try {
			
			in = new FileReader("C:"+File.separator+"abc.txt");
			br = new BufferedReader(in);
			
			while (true) {
				String msg = br.readLine();
				// buffered reader는 read()대신 readLine()을 사용한다.
				// 엔터가 오기 전까지를 하나의 라인으로 인식함(엔터 기준)
				// readLine()은 불러온 데이터를 무조건 문자열로 인식함
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
				// line.separator 을 입력해줘서 줄바꿈되는 것은
				// BufferedReader로 읽어올 때는
				// br의 기준이 되고 사라진다. 
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
			out.write("목요일");
			out.write(System.getProperty("line.separator"));
			out.write("5");
			out.write(System.getProperty("line.separator"));
			
			out.flush();
			// 데이터 입력을 다 하면 flush()를 입력함
			// 입출력 특히 출력이 선행 할 때에는
			// 데이터 입력이 끝나면 반드시 flush()를 적어준다
		
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
			// er스트림은 문자열스트림이기 때문에 char를 기본자료형으로 한다.
			int length = -1;
			while(true) {
				length = in.read(arr, 0, arr.length);
				// char형 배열 arr을 읽어오는데, 0부터 배열의 크기만큼 읽어온 값을
				// length에 준다 => 배열 전체가 아니라
				// 값이 있는 배열의 인덱스 만큼만 lenght에 저장됨
				if(length == -1) {
					break;
				}
				
				for(int i=0; i<length; i++) {
					// length인 이유 = 값을가진 인덱스의 맨 마지막 정보가 저장되어있어서
					// arr.length로 해버리게 되면, 1024만큼 데이터를 불러오기 때문에
					// length의 범위를 초과해, 원치 않는 데이터를 불러올 수 있음
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
					// 배열의 길이만큼이 아니라, 읽어온 데이터의 인덱스까지만!
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
			System.out.println("복사 완료");
			
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
			// 줄바꿈 => System.getProperty("line.seperator")
			
			for(int i=0; i<arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			
			out.flush();
			// 입출력을 동시에 구현되어있을 경우 반드시 flush()를 출력해야 함
			System.out.println("end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
					// 문자스트림에서의 close()
					// 메모리해제
					// 스트림 안에 데이터가 남아있을 경우가 있어서 close가
					// 남은 데이터가 없도록 완전히 데이터를 전송해줌
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
