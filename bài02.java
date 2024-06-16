package homework;

import java.util.Scanner;

public class bài02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập dollar cần quy đổi");
    float USD = sc.nextFloat();
    float VND = USD * 25440;

    System.out.println(VND);
    }
}
