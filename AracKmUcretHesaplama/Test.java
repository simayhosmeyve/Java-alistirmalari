import java.util.*;

public class Test {
	public static void main(String[] args) {
		Araba a1 = new Araba("Model1");
	    Araba a2 = new Araba("Model2");
	    Scanner input = new Scanner(System.in);
	    int km1,km2;
	    System.out.println("1. arac icin baslangic kmsi giriniz");
	    km1=input.nextInt();
	    System.out.println("1. arac icin bitis kmsi giriniz");
	    km2=input.nextInt();
	    while(km1>km2) {
	    	System.out.println("Yanlis bitis kmsi girdiniz.Tekrar giriniz");
	    	km2=input.nextInt();
	    }
	    a1.SetBasKm(km1);
		a1.SetBitisKm(km2);
	    
	    System.out.println("2. arac icin baslangic kmsi giriniz");
	    km1=input.nextInt();
	    System.out.println("2. arac icin bitis kmsi giriniz");
	    km2=input.nextInt();
	    while(km1>km2) {
	    	System.out.println("Yanlis bitis kmsi girdiniz");
	    km2=input.nextInt();
	    }
		a2.SetBasKm(km1);
		a2.SetBitisKm(km2);
	    
	    
	    System.out.println("1. aracin odemesi gereken ucret:"+
	    a1.UcretHesapla(a1));
	    System.out.println("2. aracin odemesi gereken ucret:"+
	    a2.UcretHesapla(a2));
		}

}
