package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prev = sc.nextInt();//80;
		int score = sc.nextInt();//90;
		double percent =(score- prev) * 100.0 / prev ;
		System.out.printf("成绩提高了%.1f%%",percent);
	}

}
