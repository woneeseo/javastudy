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
				// wait() -> try-catch �� �ڿ� �ݵ��
				// synchronized ó������ ����� ��
			}
		}
		
		
		return todayPost;
	}


	public void setTodayPost(String todayPost) {
		
		this.todayPost = todayPost;
		isOk = true;
		synchronized (this) {
			notify();
			// wait()�� �������� �˷��ָ鼭 isOk=true�� �ٲ��ش�.
			// ���� ������ �Ͼ �� �ֵ��� ����.
			// notify() �� synchronized ó���� �ݵ�� ����� �Ѵ�
			// ���ϸ� runtime exception�߻�
		}
	}
	
	

}
