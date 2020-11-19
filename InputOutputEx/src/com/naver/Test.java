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
			// ����ü�̴� ��
			
			oos.writeObject(dto);
			// writeObject�� ��� ��� �ڷ����� ���� �� �ֱ� ������
			// �����ڷ����� dto�� ����ϱ� ���ؼ��� writeObject�� ����
			
			in = new FileInputStream("aaa.txt");
			ois = new ObjectInputStream(in);
			// ����ü�̴� ��!
			
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
		
		// object i/o �� ���� �б� 
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
		// ����� In/Out ��ü�� ���� => null������ �ʱ�ȭ
		
		try {
			// try~ catch~ finally�� ����
			
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
				// .close()�� try~catch���� �ʿ�� �ϱ� ������
				// finally ���п��� try~catch�� ����
				// .close()�� �ϴ� ����?
				// .close()���� ������ �޸� ����� �ֱ� ������
				// �ٸ������� �����ϰų� �۾��� �� ���� (�ݵ�� �ݾ���� ��)
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
					// ���ͽ�Ʈ�� ���� ������/ 
					// ��ġ�ϰ� ���ͽ�Ʈ���� ����Ǹ� �ȵǴϱ�
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
			// �� byte�� �迭? => ~Stream �� ����Ʈ ��Ʈ��, 
			// �ѹ��� ������ �� �ִ� ���� 1����Ʈ�� �����Ǿ��ֱ� ������ byte�� �迭�� ��
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
			// ������ : ����̺���� �����ִ� �� "C:"+File.separator+"test.jpg"
			// ��� ��ǻ���� ����̺� ������ ���� ���� �ƴϱ� ������ ����θ� ����Ѵ�.
			// ����� : .(������) / ..(�Ѵܰ� �������)
			
			// ����� �����ϴ� �� : .(�����ο���)/����������/���������� ����������/../���ϸ�
			// / -> ���������ڴ� file.separator�� ó�������
			// � os���� �����ϵ� ������ �߻����� ����.
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
				// � �����͸� �Ѱ��ִ����� �ƴ� 
				// ������ ��� �Ѱ��ִ����� length���� �������ش� 
				if(length == -1) {
					break;
					// length���� ���̻� �Ѱ��� �����Ͱ� ���ٰ� �ϸ� -1 ���
				}
				
				bos.write(arr,0,length);
				// ���� ���� ������ �ִ� ���� arr�̰�
				// arr�� 0��° �ε����� ������ �ִ� ������ 
				// ������ ���� �Ѱܹ��� length������ ���� ��� ����ϸ�
				// int���� �Է¹��� �����͸� ���� �Ѱ��ִ� ���� �ȴ�.
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
			
			System.out.println("���� ��!");
			
			
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
		// me1() �� �ִ� �ڵ� �Ȱ��� �ֱ�
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy4.jpg");
			
			byte[] arr = new byte[1024];
			// 2^n���� ���ִ� ���� �ӵ� ����ȭ�� �Ǿ��־� ���� ������.
			// in���� �޴� �����͸� [n]�� ��ŭ ä���� out���ִ� ���� �ݺ�
			// �̵��ð��� ������ �ӵ��� Ȯ �پ��
			
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
			
			System.out.println("����� ����!");
			
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
			// ����ü�̴� �Ϸ�
			
			int what = -1;
			
			while ((what = bis.read()) != -1) {
				bos.write(what);
			}
			
			System.out.println("copy end");
			
			// ����ü�̴� �� ��ü�� ������ ���ͽ�Ʈ���� �̿��ؼ� ������� �ϸ� �ȴ�
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(bis != null) {
					bis.close();
				}
				// �޸� ������ ���ͽ�Ʈ�� ����!
				// out / in�� �������, ���ͽ�Ʈ�� ü�̴� �Ǵ� ������ �߿�
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
			// i/o Ŭ������ �߻�Ŭ�����̱� ������ ��ü�� ���� �� ����
			// i/oŬ������ ����ϴ� file i/o Stream �޼��带 ����� ��ü�� ����
			// in���� ���� �ڷᰪ�� �ӽ� ������ out�� �Ѱ��� ���� what ����
			
			int what = -1;
			
			while((what = in.read()) != -1) {
				
				out.write(what);
			}
			
			System.out.println("���ο� ����� �Ѹ���");
			
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
		// ���� ����
		try {
			
			in = new FileInputStream("C:"+File.separator+"cat.jpg");
			out = new FileOutputStream("C:"+File.separator+"cat3.jpg");
			// ���� �ʱ�ȭ 
			
			int what = -1;
			// in���� �о�� �����͸� �ӽ� ����->out���� �Ἥ ����� ��
			// �����͸� ��� ������ �ӽ� ���� what ����
			// �� -1�ε�? �� �о�� �����Ͱ� ������ -1�� ����Ѵ뼭
			
			while((what=in.read()) != -1) {
				
				out.write(what);
				// in���� �����Ͱ��� �о���µ�, �����Ͱ� ���̻� ����
				// -1�� ����س� �� ������ out�� ��� �����͸� ����� �ǹ�
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
			
			System.out.println("����� �߿˾߿�");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				// null�� �ƴϰ� ��� ���� ���������� 
				// i/o ���� �ϵ��ũ�� �����ؼ� �۾��� ���ϴϱ�
				// close�� �� �۾��� ������ �ٸ� �۾����� �޸𸮸� �Ҵ��� �� �ֵ���
				// if������ != null�̶�� ���ǽ��� �־��� ����
				
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
		// byte Stream���� �Է°� ���õ� �ֻ��� �θ�Ŭ���� : InputStream
		// byte Stream���� ��°� ���õ� �ֻ��� �θ�Ŭ���� : OutputStream
		// InputStream / OutputStream�� �߻�Ŭ���� -> ��ü�� ������ �� ��
		// �Է°� ����� ���ÿ�!
		// i/o ��ü�� �ݵ�� �����ڰ� �޸𸮸� �������Ѿ� �� -> ������ close()�� ȣ��Ǿ����
		
		
		// 1. ����ϰ��� �ϴ� stream�� ���� �ϱ�
		// 2. try-catch~finally ������ �����
		// 3. finally �ȿ� try-catch
		// 4. finally �ȿ� �ִ� try�� close()ȣ��, catch�� ����ó�� �ϱ�
		// 5. �� catch���� ����ó�� ����
		// 6. �� try�� �ڵ�
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			// "C:"+File.separator+"test.jpg"
			//  File.separator : ���� ������, � os������ ���డ����
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			// �о�� ��(input)�� ������ �����ؾ�������
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			// �� ��(output)�� ���� ��� �� (���� ����� ��)
			
			int what = -1;
			// �о� �� �����͸� ������ ����
			// �о�� ������ ���̻� ������ -1�� ����ϱ� ������
			// -1�� ��� ���� �����Ƿ� ����� �����ش�.
			
			// ���� ó������ ������ �����͸� 1����Ʈ�� �о��
			// �� ���� �ݺ����� ����ؾ��ϳ�? ���ϸ��� �� �޶� �𸥴�!
			// �׷��� for�� �ƴ� while�� ���� 
			// �ݺ� Ƚ���� ������ �ݺ� ������ �˰�����
			while(true){
				what = in.read();
				if(what == -1) {
					// ���̻� ���� ������ -1�� ��
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
					// null�� �ƴϸ� ������ ���� �ִٴ� ��
					// close�� ������ ������ ��� i/o���� �ϵ��ũ�� ����� �ֱ� ������
					// �۾��� ������ i/o�� close�ؼ� ������� �Ѵ�.
					// ��, ���α׷����� �ڿ��� ����Ѵٰ� ����(connection)�� �ϸ� 
					// �ݵ�� ���ҽ� ��ȯ(close)�� �Ǿ�� �մϴ�.

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
