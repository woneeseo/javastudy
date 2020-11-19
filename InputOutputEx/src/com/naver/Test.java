package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
	
	public void me77777() {
		
		OutputStream out = null;
		ObjectOutputStream oos = null;
		InputStream in = null;
		ObjectInputStream ois = null;
		
		MemberDTO dto = new MemberDTO("m003", "choi", 22);
		
		try {
			out = new FileOutputStream("aaa.txt");
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(dto);
			
			in = new FileInputStream("aaa.txt");
			ois = new ObjectInputStream(in);
			
			Object obj = ois.readObject();
			if(obj instanceof MemberDTO) {
				MemberDTO mDTO = (MemberDTO)obj;
				System.out.println(mDTO.getId());
				System.out.println(mDTO.getName());
				System.out.println(mDTO.getAge());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
				if(out != null) {
					out.close();
				}
				if(ois != null) {
					ois.close();
				}
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me666() {
		
		MemberDTO dto = new MemberDTO("m002", "lee", 21);
		
		OutputStream out = null;
		ObjectOutputStream oos = null;
		InputStream in = null;
		ObjectInputStream ois = null;
		
		try {
			
			out = new FileOutputStream("aaa.txt");
			oos = new ObjectOutputStream(out);
			// 필터체이닝 끝
			
			oos.writeObject(dto);
			// writeObject를 써야 모든 자료형을 받을 수 있기 때문에
			// 참조자료형인 dto를 출력하기 위해서는 writeObject를 쓴다
			
			in = new FileInputStream("aaa.txt");
			ois = new ObjectInputStream(in);
			// 필터체이닝 끝!
			
			Object obj = ois.readObject();
			if(obj instanceof MemberDTO) {
				 MemberDTO mDTO = (MemberDTO)obj;
				 
				 System.out.println(mDTO.getId());
				 System.out.println(mDTO.getName());
				 System.out.println(mDTO.getAge());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
				if(out != null) {
					out.close();
				}
				if(ois != null) {
					ois.close();
				}
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me6() {
		
		// object i/o 로 쓰고 읽기 
		MemberDTO dto = new MemberDTO("m001", "kim", 10);
		
		OutputStream out = null;
		ObjectOutputStream oos = null;
		InputStream in = null;
		ObjectInputStream ois = null;
		
		try {
			out = new FileOutputStream("obj.txt");
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(dto);
			System.out.println("::::::::::::::::");
			
			in = new FileInputStream("obj.txt");
			ois = new ObjectInputStream(in);
			
			Object obj = ois.readObject();
			if(obj instanceof MemberDTO) {
				MemberDTO mDTO = (MemberDTO)obj;
				System.out.println(mDTO.getId());
				System.out.println(mDTO.getName());
				System.out.println(mDTO.getAge());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
				if(out != null) {
					out.close();
				}
				if(ois != null) {
					ois.close();
				}
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me201() {
		
		InputStream in = null;
		OutputStream out = null;
		// 사용할 In/Out 객체를 선언 => null값으로 초기화
		
		try {
			// try~ catch~ finally문 생성
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"final.jpg");
			
			int what = -1;
			
			while(true) {
				what = in.read();
				if(what == -1) {
					break;
				}
				
				out.write(what);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				// .close()는 try~catch문을 필요로 하기 때문에
				// finally 구분에도 try~catch를 해줌
				// .close()를 하는 이유?
				// .close()하지 않으면 메모를 붙잡고 있기 때문에
				// 다른곳에서 접근하거나 작업할 수 없음 (반드시 닫아줘야 함)
				if(in != null) {
					in.close();
				}
				if(out != null){
					out.close();
				}
			}	
			 catch (Exception e2) {
				 e2.printStackTrace();
			 }
			}
			
	}
	
	public void me101() {
		
		InputStream in =null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"final_test.jpg");
			bos = new BufferedOutputStream(bos);
			
			int what = -1;
			
			while((what = bis.read()) != -1) {
				
				bos.write(what);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
					// 필터스트림 먼저 꺼야지/ 
					// 장치하고 필터스트림이 연결되면 안되니까
				}
				
				if(in != null) {
					in.close();
				}
				
				if(bos != null) {
					bos.close();
				}
				
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void ma100() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy_final.jpg");
			
			byte[] arr = new byte[1024];
			// 왜 byte형 배열? => ~Stream 은 바이트 스트림, 
			// 한번에 전송할 수 있는 양이 1바이트로 고정되어있기 때문에 byte형 배열을 씀
			int length = -1;
			
			while((length = in.read(arr)) != -1) {
				
				out.write(arr, 0, length);
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
	
	public void me999() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream(".."+File.separator+"JoinEx"+File.separator+"test_copy_.jpg");
			
			byte[] arr = new byte[1024];
			
			int length = -1;
			
			while((length = in.read(arr)) != -1) {
				
				out.write(arr, 0, length);
			}
			
			System.out.println("end");
			
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
	
	public void me5() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("."+File.separator+"src"
			+File.separator+"Upload"+File.separator+"test_copy6.jpg");
			// 절대경로 : 드라이브까지 적어주는 것 "C:"+File.separator+"test.jpg"
			// 모든 컴퓨터의 드라이브 구성이 같은 것은 아니기 때문에 상대경로를 사용한다.
			// 상대경로 : .(현재경로) / ..(한단계 상위경로)
			
			// 상대경로 결정하는 법 : .(현재경로에서)/하위폴더명/하위폴더의 하위폴더명/../파일명
			// / -> 폴더구분자는 file.separator로 처리해줘야
			// 어떤 os에서 실행하든 오류가 발생하지 않음.
			byte[] arr = new byte[1024];
			
			int length = -1;
			
			while((length = in.read(arr)) == -1) {
				
				out.write(arr, 0, length);
			}
			
			System.out.println("copy end");
			
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
	
	public void me777() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy5.jpg");
			
			byte[] arr = new byte[1024];
			
			while(true) {
				int length = in.read(arr);
				if(length == -1) {
					break;
				}
				
				out.write(arr, 0, length);
			}
			
			System.out.println("copy end");
			
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
	
	public void me4() {
		
		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"test_copy4.jpg");
			bos = new BufferedOutputStream(out);
			
			int what = -1;
			
			byte[] arr = new byte[1024];
			
			while(true) {
				int length = bis.read(arr);
				// 어떤 데이터를 넘겨주는지가 아닌 
				// 데이터 몇개를 넘겨주는지를 length값에 전달해준다 
				if(length == -1) {
					break;
					// length에서 더이상 넘겨줄 데이터가 없다고 하면 -1 출력
				}
				
				bos.write(arr,0,length);
				// 이제 값을 가지고 있는 것은 arr이고
				// arr의 0번째 인덱스가 가지고 있는 값부터 
				// 마지막 값을 넘겨받은 length까지의 값을 모두 출력하면
				// int으로 입력받은 데이터르 전부 넘겨주는 것이 된다.
			}
			
			System.out.println("copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(in != null) {
					in.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me13333() {
		
		InputStream in = null;
		OutputStream out = null;

		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy_copy.jpg");
			
			byte[] arr = new byte[1024];
			
			while (true) {
				int length = in.read(arr);
				if(length == -1) {
					break;
				}
				
				out.write(arr, 0, length);
			}
			
			System.out.println("copy end");
			
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
	public void me3333() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy5.jpg");
			
			byte[] arr = new byte[2048];
			
			while(true) {
				int length = in.read(arr);
				if(length == -1) {
					break;
				}
				
				out.write(arr, 0, length);
			}
			
			System.out.println("복사 끝!");
			
			
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
	
	public void me3() {
		// me1() 에 있던 코드 똑같이 넣기
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy4.jpg");
			
			byte[] arr = new byte[1024];
			// 2^n으로 해주는 것이 속도 최적화가 되어있어 가장 빠르다.
			// in으로 받는 데이터를 [n]개 만큼 채워서 out해주는 것을 반복
			// 이동시간이 빨라져 속도가 확 줄어듦
			
			while(true) {
				int length = in.read(arr);
				if(length == -1) {
					break;
				}
				
				out.write(arr, 0, length);
			}
			System.out.println("Copy Complete");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null){
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me2222() {
		
		InputStream in =null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"cat.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"cat_cat.jpg");
			bos = new BufferedOutputStream(out);
			
			int what = -1;
			
			while((what = bis.read()) != -1) {
				
				bos.write(what);
			}
			
			System.out.println("고양이 등장!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				
				if(in != null) {
					in.close();
				}
				
				if(bos != null) {
					bos.close();
				}
				
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me2() {
		
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"test_copy2.jpg");
			bos = new BufferedOutputStream(out);
			// 필터체이닝 완료
			
			int what = -1;
			
			while ((what = bis.read()) != -1) {
				bos.write(what);
			}
			
			System.out.println("copy end");
			
			// 필터체이닝 된 객체가 있으면 필터스트림을 이용해서 입출력을 하면 된다
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(bis != null) {
					bis.close();
				}
				// 메모리 해제는 필터스트림 먼저!
				// out / in은 관계없고, 필터스트림 체이닝 되는 순서가 중요
				if (in != null) {
					in.close();
				}
				
				
				if(bos != null) {
					bos.close();
				}
				
				if(out != null) {
					out.close();
				}	
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	
	public void me6666() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"cat.jpg");
			out = new FileOutputStream("C:"+File.separator+"cat4.jpg");
			// i/o 클래스는 추상클래스이기 때문에 객체를 만들 수 없음
			// i/o클래스를 상속하는 file i/o Stream 메서드를 사용해 객체를 만듦
			// in에서 받은 자료값을 임시 저장해 out에 넘겨줄 변수 what 설정
			
			int what = -1;
			
			while((what = in.read()) != -1) {
				
				out.write(what);
			}
			
			System.out.println("새로운 고양이 한마리");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void me512131() {
		
		InputStream in = null;
		OutputStream out = null;
		// 변수 선언
		try {
			
			in = new FileInputStream("C:"+File.separator+"cat.jpg");
			out = new FileOutputStream("C:"+File.separator+"cat3.jpg");
			// 변수 초기화 
			
			int what = -1;
			// in에서 읽어온 데이터를 임시 저장->out으로 써서 출력할 때
			// 데이터를 잠시 저장할 임시 변수 what 설정
			// 왜 -1인데? 더 읽어올 데이터가 없으면 -1을 출력한대서
			
			while((what=in.read()) != -1) {
				
				out.write(what);
				// in에서 데이터값을 읽어오는데, 데이터가 더이상 없어
				// -1을 출력해낼 때 까지는 out은 계속 데이터를 쓰라는 의미
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
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
	
	public void name() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"cat.jpg");
			out = new FileOutputStream("C:"+File.separator+"cat2.jpg");
			
			int what = -1;
			
			while((what = in.read()) != -1) {
				
				out.write(what);
			}
			
			System.out.println("고양이 야옹야옹");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				// null이 아니고 계속 값을 갖고있으면 
				// i/o 에서 하드디스크를 독점해서 작업을 못하니까
				// close로 한 작업이 끝나면 다른 작업으로 메모리를 할당할 수 있도록
				// if문으로 != null이라는 조건식을 넣어준 것임
				
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me333() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"cat.jpg");
			out = new FileOutputStream("C:"+File.separator+"cat_copy.jpg");
			
			int what = -1;
			
			while((what = in.read()) != -1) {
				
				out.write(what);
			}
			
			System.out.println("Copy End");
			
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
	
	public void me200() {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test_copy.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy3.jpg");
			
			int what = -1;
			
			while((what = in.read()) != -1) {
				
				out.write(what);
			}
			
			System.out.println("File Copy End");
			
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
	
	
	public void me1() {
		// byte Stream에서 입력과 관련된 최상위 부모클래스 : InputStream
		// byte Stream에서 출력과 관련된 최상위 부모클래스 : OutputStream
		// InputStream / OutputStream은 추상클래스 -> 객체를 만들지 말 것
		// 입력과 출력을 동시에!
		// i/o 객체는 반드시 개발자가 메모리를 해제시켜야 함 -> 무조건 close()가 호출되어야함
		
		
		// 1. 사용하고자 하는 stream을 선언만 하기
		// 2. try-catch~finally 구조를 만들기
		// 3. finally 안에 try-catch
		// 4. finally 안에 있는 try에 close()호출, catch에 예외처리 하기
		// 5. 원 catch문에 예외처리 해줌
		// 6. 원 try를 코딩
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			// "C:"+File.separator+"test.jpg"
			//  File.separator : 파일 구분자, 어떤 os에서도 실행가능함
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			// 읽어올 때(input)는 파일이 존재해야하지만
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			// 쓸 때(output)는 파일 없어도 됨 (새로 만들어 줌)
			
			int what = -1;
			// 읽어 온 데이터를 저장할 변수
			// 읽어올 파일이 더이상 없으면 -1을 출력하기 때문에
			// -1인 경우 값이 없으므로 출력을 끝내준다.
			
			// 파일 처음부터 끝까지 데이터를 1바이트씩 읽어옴
			// 몇 번의 반복문을 사용해야하나? 파일마다 다 달라서 모른다!
			// 그래서 for가 아닌 while을 쓴다 
			// 반복 횟수는 모르지만 반복 조건은 알고있음
			while(true){
				what = in.read();
				if(what == -1) {
					// 더이상 값이 없으면 -1을 줌
					break;
				}
				
				out.write(what);
			}
			
			System.out.println("file copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
					// null이 아니면 가져올 값이 있다는 것
					// close를 해주지 않으면 계속 i/o에서 하드디스크를 붙잡고 있기 때문에
					// 작업이 끝나면 i/o를 close해서 놓아줘야 한다.
					// 즉, 프로그램에서 자원을 사용한다고 연결(connection)을 하면 
					// 반드시 리소스 반환(close)이 되어야 합니다.

				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				
				e2.printStackTrace();
			}
		}
		
		
	
	}
	

}
