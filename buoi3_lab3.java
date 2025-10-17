package lab3;

import java.util.Scanner;

public class buoi3_lab3 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Buoi 3");
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;

        }
        System.out.println("Tong cac so tu 1 - 10 = " + sum);

        sum = 0;
        for (int i = 2; i <= 10; i += 2) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac so chan tu 2 - 10: " + sum);

    }
}
