package com.wxd.jvm.day2;


/**
 * �����̵߳����ڴ�����쳣
 * @author Administrator
 *
 */
public class JavaVMStackOOM {
	
	private void donotStop(){
		while(true){
			
		}
	}

	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					donotStop();
				}
			});
			thread.start();
		}
	}
	
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}

}
