package com.wxd.jvm.day2;

public class RuntimeConstantPoolOOM1 {

	
	public static void main(String[] args) {
		
		String strdemo = "java";
		String strdemo1 = "��������";
		
		String str1 = new StringBuilder("�����").append("���").toString();
		System.out.println(strdemo1 == str1);
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("hello").append("world").toString();
		System.out.println(str2.intern() == str2);
		System.out.println(strdemo == str2);
	}
}
