package kr.co.ezen;

import com.naver.Board;
import com.naver.ReaderThread;
import com.naver.WriterThread;

public class MainEx {
	
	public static void main(String[] args) {
		
		Board board = new Board();
		
		ReaderThread rt = new ReaderThread(board);
		WriterThread wt = new WriterThread(board);
		// ���� �ڷḦ �����ϰ� �ִ� rt / wt ������
		// ����ȭ���� �߻���
		// ó�����ֱ� ���ؼ� Board Ŭ������ 
		// ���ټ����� ���� ����ȭ ó���� ��
		rt.start();
		wt.start();
		
	}

}
