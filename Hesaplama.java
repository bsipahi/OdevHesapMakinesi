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
		System.out.println("Birinci Sayýyý Giriniz : ");
		num1 = scanner.nextInt();
		scanner2 = new Scanner(System.in);
		System.out.println("Ýþlem Türünü Giriniz (+ ,- ,* ,/ ) : ");
		String islem = scanner2.nextLine();
		scanner3 = new Scanner(System.in);
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		num2 = scanner3.nextInt();
		
		if(islem.equals("+") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 + num2;
			System.out.println("Ýþlem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if (islem.equals("-") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 - num2;
			System.out.println("Ýþlem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if (islem.equals("*") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 * num2;
			System.out.println("Ýþlem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if (islem.equals("/") || islem.startsWith(" ") || islem.endsWith(" ")) {
			sonuc = num1 / num2;
			System.out.println("Ýþlem Sonucu : "+num1+ islem +num2+": " +sonuc);
		} else if(islem.equals("")) {
			System.out.println("Deðer Döndüremedi Ýþlem Türünü Girmedin");
			System.out.println("Deðerler : num1 = "+num1+" num2 = "+num2+" islem = "+islem);
		} else {
			System.out.println("Verdiðin deðerleri veya iþlem türünü gözden geçir :) ");
		}
	}
}
