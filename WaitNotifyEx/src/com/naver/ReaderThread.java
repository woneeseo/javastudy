package com.naver;

public class ReaderThread extends Thread{
	
	private Board board;
	
	public ReaderThread() {
		// TODO Auto-generated constructor stub
	}
	
	public ReaderThread(Board board) {
		super();
		this.board = board;
	}

	@Override
	public void run() {
		
		System.out.println(board.getTodayPost());
	}
}
