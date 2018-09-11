package br.cc.unipe.aula06;

import java.util.Arrays;

public class Copiao {
	
	public static void main(String[] args) {

		char[] copyFrom = {'a','b','c'};
		
		//char[] copyTo = new char[10];
		
		char[] copyTo = Arrays.copyOfRange(copyFrom, 0, 3);
		
		System.out.println(copyTo);
		
	}

}
