import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BaitapThucHanh03 {
    public static void main(String[] args) {
        System.out.println("Bài tập thực hành 03 cấu trúc điều kiện :");
        // bai1();
        System.out.println("----------------------------------------------------");
        bai2();
    }

    public static void bai1() {
        System.out.println("Bài 1: Viết chương trình xét 1 năm có phải năm nhuận hay không");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bất kỳ 1 năm vào : ");
        int year = input.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " là năm không nhuận");
        }
    }

    public static void bai2() {
        System.out.println("Bài 2a: Xét xem ngày tháng năm có hợp lệ hay không");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ngày vào : ");
        int day = input.nextInt();
        System.out.println("Nhập tháng vào : ");
        int month = input.nextInt();
        System.out.println("Nhập năm vào : ");
        int year = input.nextInt();
        // đặt biểu thức check năm nhuận
        boolean namNhuan = false;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            // System.out.println("Năm "+year+" là năm nhuận");
            namNhuan = true;
        }
        // đặt biểu thức check ngày 31 hay 30
        boolean thang31Ngay = false;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            thang31Ngay = true;
        }
        // đặt biểu thức invalid ngày và tháng
        boolean invaliddate = false;
        if (month == 0 || day == 0 || day >= 32 || month >= 13) {
            invaliddate = true;
        }

        //Nếu là năm nhuận
        if (day == 29 && month == 2 && namNhuan) {
            System.out.println("Năm nhuận: " + day + "/" + month + "/" + year);
            System.out.println("Ngày sau đó là : 01/03/" + year);
            System.out.println("Ngày trước đó là :28/02" + year);
        } else if (!namNhuan && month == 2 && day <= 28) {
            System.out.println("Năm không nhuận: " + day + "/" + month + "/" + year);
            if (day == 28) {
                System.out.println("Ngày sau đó là : 01/03/" + year);
                System.out.println("Ngày trước đó là :27/02" + year);
            } else {
                System.out.println("Ngày sau đó là : " + (day + 1) + "/" + "02/" + year);
                System.out.println("Ngày trước đó là " + (day - 1) + "/" + "02/" + year);
            }

        } else if (month == 2 && day > 29) {
            System.out.println("Ngày , tháng năm không đúng định dạng: " + day + "/" + month + "/" + year);
        } else if (day >= 31 && !thang31Ngay) {
            System.out.println("Ngày , tháng năm không đúng định dạng: " + day + "/" + month + "/" + year);
        } else if (invaliddate) {
            System.out.println("Ngày , tháng năm không đúng định dạng: " + day + "/" + month + "/" + year);
        } else {
            System.out.println("------------------------------------------------");
            System.out.println("Tổng kết: ngày, tháng, năm đúng định dạng: " + day + "/" + month + "/" + year);
            if (thang31Ngay && day == 31) {
                System.out.println("Ngày sau đó là : 01" + "/" + (month + 1) + "/" + year);
                System.out.println("Ngày trước đó là : 30" + "/" + month + "/" + year);
            } else if (!thang31Ngay && day == 30) {
                System.out.println("Ngày sau đó là : 01" + "/" + (month + 1) + "/" + year);
                System.out.println("Ngày trước đó là : 29" + "/" + month + "/" + year);
            } else if (month == 12 && day == 31){
                System.out.println("Ngày sau đó là : 01/01" + (year+1));
                System.out.println("Ngày trước đó là : 30" + "/" + month + "/" + year);
            }
            else {
                System.out.println("Ngày sau đó là : " + (day + 1) + "/" + month + "/" + year);
                System.out.println("Ngày trước đó là " + (day - 1) + "/" + month + "/" + year);
            }
        }
    }
}
