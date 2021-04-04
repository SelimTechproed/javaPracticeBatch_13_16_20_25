package day02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 *Kullanıcı tarafından girilen bir sayının 
		 *mutlak değerini yazdırmak için bir program yazın.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mutlak deger bulmak icin bir sayi giriniz");
		int i = scan.nextInt();
		
		if(i >= 0) {
			System.out.println("Girilen sayinin mutlak degeri " + i);
		}else {
			System.out.println("Girilen sayinin mutlak degeri " + (i*-1));
		}
		
		scan.close();
		
	}

}
