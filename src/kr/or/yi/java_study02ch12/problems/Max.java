package kr.or.yi.java_study02ch12.problems;

import java.util.Arrays;

public class Max {

	private static int max(int[] data) {
		return -999999;
		
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}



}