package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hafta kuni: ");
        int a = in.nextInt();

        switch (a){
            case 1:
                System.out.println("Dushanba!");
                break;
            case 2:
                System.out.println("Seshanba!");
                break;
            case 3:
                System.out.println("Chorshanba!");
                break;
            case 4:
                System.out.println("Chorshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanba");
                break;
            default:
                System.out.println("Hafta kuni hato kirgizildi!");
        }
    }
}
