package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 计算BMI
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Height (m): ");
		double height = scanner.nextDouble();
		System.out.print("Weight (kg): ");
		double weight = scanner.nextDouble();
		// FIXME:
		double bmi = 0;
		bmi = weight / (height * height);
		// TODO: 打印BMI值及结果
		if(bmi < 18.5) {
			System.out.println(bmi+" 过轻");
		}else if(bmi >= 18.5 && bmi <= 25) {
			System.out.println(bmi+ "正常");
		}else if(bmi > 25 && bmi <=28) {
			System.out.println(bmi+ "过重");
		}else if(bmi > 28 && bmi <= 32) {
			System.out.println(bmi+ "肥胖");
		}else {
			System.out.println(bmi+ "非常肥胖");
		}
	}

}
