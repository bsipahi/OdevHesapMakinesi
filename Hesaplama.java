package com.bilgeadam.odev1;

import java.util.Scanner;

public class Hesaplama {

	private static Scanner scanner;
	private static Scanner scanner2;
	private static Scanner scanner3;

	public static void main(String[] args) {
		
		int sonuc = 0;
		int num1 = 0;
		int num2 = 0;
		
		scanner = new Scanner(System.in);
		System.out.println("Birinci Say�y� Giriniz : ");
		num1 = scanner.nextInt();
		scanner2 = new Scanner(System.in);
		System.out.println("��lem T�r�n� Giriniz (+ ,- ,* ,/ ) : ");
		String islem = scanner2.nextLine();
		scanner3 = new Scanner(System.in);
		System.out.println("�kinci Say�y� Giriniz : ");
		num2 = scanner3.nextInt();
		
		if(islem.equals("+") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 + num2;
			System.out.println("��lem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if (islem.equals("-") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 - num2;
			System.out.println("��lem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if (islem.equals("*") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 * num2;
			System.out.println("��lem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if (islem.equals("/") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 / num2;
			System.out.println("��lem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if(islem.equals("")) {
			System.out.println("De�er D�nd�remedi ��lem T�r�n� Girmedin");
			System.out.println("De�erler : num1 = "+num1+" num2 = "+num2+" islem = "+islem);
		} else {
			System.out.println("Verdi�in de�erleri veya i�lem t�r�n� g�zden ge�ir :) ");
		}
	}
}
