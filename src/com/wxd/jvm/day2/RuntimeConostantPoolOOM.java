package com.wxd.jvm.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ʱ�����ص��µ��ڴ�����쳣
 * @author Administrator
 *
 */
public class RuntimeConostantPoolOOM {
	
	public static void main(String[] args) {
		
		//ʹ��List�����ų����ص����ã�����Full GC ���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		
		//10M��PermSize��integer��Χ���㹻����OOM��
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
		} 
	}

}
