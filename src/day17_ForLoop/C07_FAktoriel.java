package day17_ForLoop;

import java.util.Scanner;

public class C07_FAktoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Girin: ");
        int number = scan.nextInt();
        int result = 1;

        for(int i = 1; i <= number; i++){
            result = result * i;
        }
        System.out.println(number + "! = " + result);

    }
}
