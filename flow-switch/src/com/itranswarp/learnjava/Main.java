package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		int choice = sc.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		switch (choice - random) {
		// TODO:
			case 0: System.out.println("平局");break;
			case -1:
			case 2:
					System.out.println("Win");break;
			case 1:
			case -2:
					System.out.println("lose");break;
			default:
					System.out.println("无效输出");
		}
	}

}
