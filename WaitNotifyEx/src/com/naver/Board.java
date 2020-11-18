package com.naver;

public class Board {
	
	private String todayPost;
	private boolean isOk;
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}


	public String getTodayPost() {
		
		if(!isOk) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// wait() -> try-catch 한 뒤에 반드시
				// synchronized 처리까지 해줘야 함
			}
		}
		
		
		return todayPost;
	}


	public void setTodayPost(String todayPost) {
		
		this.todayPost = todayPost;
		isOk = true;
		synchronized (this) {
			notify();
			// wait()이 끝났음을 알려주면서 isOk=true로 바꿔준다.
			// 다음 동작이 일어날 수 있도록 해줌.
			// notify() 도 synchronized 처리를 반드시 해줘야 한다
			// 안하면 runtime exception발생
		}
	}
	
	

}
