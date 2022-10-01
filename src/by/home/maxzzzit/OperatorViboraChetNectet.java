package by.home.maxzzzit;

import java.util.Scanner;

public class OperatorViboraChetNectet {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите любое целочисленное число = ");
		int chislo=scn.nextInt();
		String rezultat=chislo%2==0?"четное число":"нечетное число";
		System.out.println("Вы ввели число: "+chislo+" - это "+rezultat);
	}
}
