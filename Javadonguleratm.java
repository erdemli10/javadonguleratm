import java.util.Scanner;

public class Javadonguleratm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = 0; 
        int bakiye = 10000; 
        
        do {            
            
            System.out.println("1. Bakiye goruntuleme");
            System.out.println("2. Para yatirma");
            System.out.println("3. Para cekme");
            System.out.println("4. Cikis");
            System.out.print("Seciminiz: ");
            
            sayi = sc.nextInt(); 
            
            switch (sayi) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " tldir.");     
                    break;
              
                case 2:
                    System.out.println("Kac lira yatiracaksiniz?"); 
                    int yatirilan = sc.nextInt();
                    bakiye = yatirilan + bakiye;  
                    System.out.println("Yeni bakiyeniz: " + bakiye + " tldir.");
                    break;
                    
                case 3:
                    System.out.println("Kac lira cekmek istiyorsunuz?");
                    int cekilen = sc.nextInt();
                    
                    if (cekilen > bakiye) {
                        System.out.println("bankada bu kadar paraniz yoktur.");
                    } else {
                        bakiye = bakiye - cekilen; 
                        System.out.println("Kalan bakiyeniz: " + bakiye + " tldir."); 
                    }
                    break;
            
                case 4:
                    System.out.println("Cikis yapiliyor.");      
                    break;
                    
                default:
                    System.out.println("Gecersiz secim Lutfen 1 ile 4 arasinda bir deger girin.");
            }
            
        } while (sayi != 4); 
        
 
    }
}