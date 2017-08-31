package com.wxd.jvm.day2;


/**
 * 创建线程导致内存溢出异常
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
