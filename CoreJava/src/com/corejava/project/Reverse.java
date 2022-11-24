package com.corejava.project;

public class Reverse {

	public static void main(String[] args) {
		String str = "Pavan";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse(); //used stringbuilder to reverse.
		System.out.println(str2);
	

	}

}
