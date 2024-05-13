package org.example;

// Klavyeden girilen pozitif tamsayıyı, "Gray Kodu"na dönüştüren program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,i;
        String s;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n    Lütfen Sayıyı Giriniz : ");
        a = scanner.nextInt();
        s = Integer.toString(a,2);
        System.out.printf("\nGray Kodu : %c",s.charAt(0));
        for (i=1; i<s.length(); i++)
            System.out.printf("%d",((int)s.charAt(i-1)-48)^((int) s.charAt(i)-48));


    }
}