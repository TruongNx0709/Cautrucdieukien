import java.util.Scanner;

public class BaitapThucHanh02 {
    float nghiemx1;
    float nghiemx2;

    public static void main(String[] args) {
        System.out.println("Bài tập thực hành 02 cấu trúc điều kiện :");
        System.out.println("--------------------------------------");
        BaitapThucHanh02 baitap = new BaitapThucHanh02();
        baitap.bai1();
        baitap.bai2();
        baitap.bai3();
        baitap.bai4();
        baitap.bai5();

    }

    public void bai1() {
        System.out.println("Bài 1: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bất kỳ 1 số vào : ");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Một");
        } else if (number == 2) {
            System.out.println("Hai");
        } else if (number == 3) {
            System.out.println("Ba");
        } else if (number == 4) {
            System.out.println("Bốn");
        } else if (number == 5) {
            System.out.println("Năm");
        } else if (number == 6) {
            System.out.println("Sáu");
        } else if (number == 7) {
            System.out.println("Bảy");
        } else if (number == 8) {
            System.out.println("Tám");
        } else if (number == 9) {
            System.out.println("Chín");
        } else {
            System.out.println("Không đọc được");
        }
    }

    public void bai2() {
        System.out.println("Bài 2: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bất kỳ chữ cái vào : ");
        String chart = input.nextLine();
        if (chart.matches("[A-Z]")) {
            System.out.println("Chữ cái đang viết hoa");
            System.out.println("Chuyển thành viết thường: " + chart.toLowerCase());
        } else if (chart.matches("[a-z]")) {
            System.out.println("Chữ cái đang viết thường");
            System.out.println("Chuyển thành viết hoa: " + chart.toUpperCase());
        } else {
            System.out.println("Chỉ nên nhập 1 chữ cái");
        }
    }

    public void bai3() {
        System.out.println("Bài 3: Giải phương trình bậc nhất ax + b = 0 ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a : ");
        int numberA = input.nextInt();
        System.out.println("Nhập b : ");
        int numberB = input.nextInt();
        float x = ((float) -numberB) / numberA;
        if (numberA == 0 && numberB != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (numberA == 0 && numberB == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }

    public void bai4() {
        System.out.println("Bài 4: Giải phương trình bậc hai ax2 + bx + c = 0 ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a : ");
        int numberA = input.nextInt();
        System.out.println("Nhập b : ");
        int numberB = input.nextInt();
        System.out.println("Nhập c : ");
        int numberC = input.nextInt();
        // tính delta x
        float detaX = (numberB * numberB) - (4 * numberA * numberC);
        if (detaX < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (detaX == 0) {
            float nghiemx1x2 = ((float) -numberB) / (2 * numberA);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + nghiemx1x2);
        } else if (numberA + numberB + numberC == 0) {
            System.out.println("Nghiệm của phương trình là: ");
            nghiemx1 = 1;
            nghiemx2 = (float) numberC / numberA;
            System.out.println("x1 = " + nghiemx1);
            System.out.println("x1 = " + nghiemx2);
        } else if (numberA - numberB + numberC == 0) {
            System.out.println("Nghiệm của phương trình là: ");
            nghiemx1 = -1;
            nghiemx2 = (float) -numberC / numberA;
            System.out.println("x1 = " + nghiemx1);
            System.out.println("x1 = " + nghiemx2);
        } else {
            nghiemx1 = (((float) -numberB) - (float) Math.sqrt(detaX)) / (2 * numberA);
            nghiemx2 = (((float) -numberB) + (float) Math.sqrt(detaX)) / (2 * numberA);
            System.out.println("Nghiệm của phương trình là: ");
            System.out.println("x1 = " + nghiemx1);
            System.out.println("x1 = " + nghiemx2);
        }
    }

    public void bai5() {
        System.out.println("Bài 5: Nhập 4 số nguyên a b c d");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a : ");
        int numberA = input.nextInt();
        System.out.println("Nhập b : ");
        int numberB = input.nextInt();
        System.out.println("Nhập c : ");
        int numberC = input.nextInt();
        System.out.println("Nhập d : ");
        int numberD = input.nextInt();

        if (numberA > numberB) {
            if (numberB > numberC) {
                if (numberC > numberD) {
                    System.out.println(numberD + " Là số nhỏ nhất");
                } else {
                    System.out.println(numberC + " Là số nhỏ nhất");
                }
            } else {
                if (numberB > numberD) {
                    System.out.println(numberD + " Là số nhỏ nhất");
                } else {
                    System.out.println(numberB + " Là số nhỏ nhất");
                }
            }
        } else {
            if (numberA > numberC) {
                if (numberC > numberD) {
                    System.out.println(numberD + " Là số nhỏ nhất");
                } else {
                    System.out.println(numberC + " Là số nhỏ nhất");
                }
            } else {
                if (numberA > numberD) {
                    System.out.println(numberD + " Là số nhỏ nhất");
                } else {
                    System.out.println(numberA + " Là số nhỏ nhất");
                }
            }
        }
    }

}

