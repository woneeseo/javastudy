package kr.co.ezen;

import com.naver.Board;
import com.naver.ReaderThread;
import com.naver.WriterThread;

public class MainEx {
	
	public static void main(String[] args) {
		
		Board board = new Board();
		
		ReaderThread rt = new ReaderThread(board);
		WriterThread wt = new WriterThread(board);
		// 같은 자료를 공유하고 있는 rt / wt 스레드
		// 동기화문제 발생함
		// 처리해주기 위해서 Board 클래스에 
		// 접근순서에 의한 동기화 처리를 함
		rt.start();
		wt.start();
		
	}

}
