import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        String hangTram = "";
        String hangchuc = "";
        String hangDonVi = "";
        int so = scanner.nextInt();
        while (so > 999 || so < 0) {
            System.out.println("nhap lai so");
            so = scanner.nextInt();
        }
        hangTram = kiemTra(so / 100);
        hangchuc = kiemTra(so % 100 / 10);
        hangDonVi = kiemTra(so % 100 % 10);
        if (so > 99) {
            System.out.println(hangTram + " tram " + hangchuc + " muoi " + hangDonVi);
        } else if (so > 9) {
            System.out.println(hangchuc + " muoi " + hangDonVi);
        } else {
            System.out.println(hangDonVi);
        }
    }

    public static String kiemTra(int a) {
        String doc = "";
        switch (a) {
            case 9:
                doc = "chin";
                break;
            case 8:
                doc = "tam";
                break;
            case 7:
                doc = "bay";
                break;
            case 6:
                doc = "sau";
                break;
            case 5:
                doc = "nam";
                break;
            case 4:
                doc = "bon";
                break;
            case 3:
                doc = "ba";
                break;
            case 2:
                doc = "hai";
                break;
            case 1:
                doc = "mot";
                break;
            default:
                doc = "khong";

        }
        return doc;
    }
}


