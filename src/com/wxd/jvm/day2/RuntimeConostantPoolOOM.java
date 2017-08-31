package com.wxd.jvm.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致的内存溢出异常
 * @author Administrator
 *
 */
public class RuntimeConostantPoolOOM {
	
	public static void main(String[] args) {
		
		//使用List保持着常量池的引用，避免Full GC 回收常量池行为
		List<String> list = new ArrayList<String>();
		
		//10M的PermSize在integer范围内足够产生OOM了
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
		} 
	}

}
