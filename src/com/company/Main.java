package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas tiradas quieres?");
        int[] frecuencia = new int[12];
        int dado1, dado2;

        int n = scanner.nextInt();
        dado1 = (int) (Math.random()*7 + 1);
        dado2 = (int) (Math.random()*7 + 1);
    }
}