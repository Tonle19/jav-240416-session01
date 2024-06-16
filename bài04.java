package homework;

import java.util.Scanner;

public class bài04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm môn toán");
        float toan = scanner.nextFloat();
        System.out.println("nhập điểm môn văn");
        float van = scanner.nextFloat();
        System.out.println("nhập điểm môn anh");
        float anh = scanner.nextFloat();
//    xác định điểm số nhập chính xác môn nào thì làm ntn?
        float sum =toan + van + anh;
        float trungbinhcong = sum /3;
        System.out.println(trungbinhcong);
    }
}
