package com.wxd.jvm.day2;


/**
 * java������C�ͱ��ط����C��OOM����
 * @author Administrator
 *
 */
public class JavaVMStackSOF {

	private int stackLength = 1;
	
	public static void main(String[] args) {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try{
			oom.stackLeak();
		}catch(Throwable e){
			System.out.println("stack length:"+oom.stackLength);
			throw e;
		}
	}
	
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}

}
