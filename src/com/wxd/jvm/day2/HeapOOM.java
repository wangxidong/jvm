package com.wxd.jvm.day2;

import java.util.ArrayList;
import java.util.List;


/**
 * java¶ÑÄÚ´æÒç³ö²âÊÔ
 * @author Administrator
 *
 */
public class HeapOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		
		while(true){
			list.add(new OOMObject());
		}
	}

}
