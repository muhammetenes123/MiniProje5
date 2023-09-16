
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Yapacağınız işlemi seçiniz!");
        System.out.println("********************************");
      String islemler = "1- Toplama İşlemi \n"
              + "2- Çıkarma İşlemi \n"
              + "3- Çarpma İşlemi \n"
              + "4- Bölme İşlemi";
        System.out.println(islemler);
        System.out.print("********************************\n"
                + ": ");
        String islem = scanner.nextLine();
        int a,b,toplam,cikarma,carpma;
        double bolme,x,y;
        switch(islem){
            case "1":
                System.out.print("İlk Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                toplam = a + b ;
                System.out.println("Toplama İşleminin Sonucu : "+toplam);
                break;
            case "2":
                System.out.print("İlk Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                cikarma = a - b ;
                System.out.println("Çıkarma İşleminin Sonucu : "+cikarma);
                break;  
                case "3":
                System.out.print("İlk Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                carpma = a * b ;
                System.out.println("Çarpma İşleminin Sonucu : "+carpma);
                break;
                case "4":
                    System.out.println("İlk Sayı: ");
                    x = scanner.nextDouble();
                    System.out.println("İkinci Sayı: ");
                    y = scanner.nextDouble();
                    bolme = x / y;
                    System.out.println("Bölme İşleminin Sonucu : "+bolme);
                    break;
                    default:
                        System.out.println("Hatalı Tuşlama!!!");
                        break;
        }
        
    }
}
