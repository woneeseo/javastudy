package com.naver;

public class WriterThread extends Thread{
	
	private Board board;
	
	public WriterThread() {
		// TODO Auto-generated constructor stub
	}

	
	public WriterThread(Board board) {
		super();
		this.board = board;
	}


	@Override
	public void run() {
		board.setTodayPost("���� ���� ��");
	}
}
