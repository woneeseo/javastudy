package kr.co.ezen;

import java.util.List;

import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		
		
		Test t = new Test();
		// me7�޼��� ����Ʈ�� �ι�° �ڷῡ ����ִ� name�� ����ϱ�
		
//		String name = t.me7().get(1).getName();
//		System.out.println(name);
	
		List<MemberDTO> list = t.me7();
		MemberDTO dto = list.get(1);
		String name2 = dto.getName();
		System.out.println(name2);
		
		List<MemberDTO> list2 = t.me7();
		System.out.println(list2.get(1).getName());
		// �����δ� �̷��� ����ϴ� ��찡 ����. 
		
		// list�� �ִ� ����� [���� : �̸�]�� ��� ����Ͻÿ�
		
		
	}

}
