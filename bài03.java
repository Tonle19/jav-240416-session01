package homework;

import java.util.Scanner;

public class bài03 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("nhập giá trị cạnh hình vuông");
        float canh = sn.nextFloat();
        float chuVi = canh * 4;
        float dienTich = canh * canh;
        System.out.println("chu vi hình vuông là:" +chuVi);
        System.out.println("diện tích hình vuông là:" +dienTich);

    }
}
