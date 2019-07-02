import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: " );
        s = scanner.nextLine();
        System.out.println("Nhap vao ky tu: ");

        char c;
        c = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0;i< s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua " + c +" la: "+ count);
    }
}
