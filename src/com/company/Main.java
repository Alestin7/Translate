package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Books books = new Books();
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Вывод сведений на экран - 1\nВыход из программы - 2");
        do {
            a = scan.nextInt();
            switch (a)
            {
                case 1:
                    books.clear();
                    books.fillRandom(n);
                    System.out.println(books);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nERROR");
            }
            if (a==2){
                break;
            }
        }while(a!=1 || a!=2);
    }
}
