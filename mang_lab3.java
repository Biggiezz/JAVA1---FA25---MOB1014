package lab3;

import java.util.Scanner;

public class mang_lab3 {

    public static void main(String[] args) {
        System.out.println("Mang ");
        String[] mang = {"Honda",
            "Toyota",
            "Ford"};
        mang[0] = "BMW";
        System.out.println(mang[0]);
        System.out.println(mang.length);
        
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
            
        }
        //for each
        for(String i : mang){
            System.out.println(i);
        }

    }
}
