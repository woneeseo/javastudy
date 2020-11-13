package kr.co.ezen;

import java.util.List;

import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		
		
		Test t = new Test();
		// me7메서드 리스트의 두번째 자료에 들어있는 name을 출력하기
		
//		String name = t.me7().get(1).getName();
//		System.out.println(name);
	
		List<MemberDTO> list = t.me7();
		MemberDTO dto = list.get(1);
		String name2 = dto.getName();
		System.out.println(name2);
		
		List<MemberDTO> list2 = t.me7();
		System.out.println(list2.get(1).getName());
		// 실제로는 이렇게 사용하는 경우가 많음. 
		
		// list에 있는 사과의 [지역 : 이름]을 모두 출력하시오
		
		
	}

}
