package homework;

import java.util.Scanner;

public class bài05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập bán kính hình tròn");
        float r = scanner.nextFloat();
        float pi = 3.14;
        float chuvi = 2*pi*r;
        float dientich=pi*r*r;
        System.out.println(chuvi);
        System.out.println(dientich);
    }
}
