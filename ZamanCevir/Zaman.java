import java.util.*;
public class Zaman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sure;
		int zaman [] = new int [3];
		
		System.out.println("Saniye cinsinden süre giriniz:");
		sure=input.nextInt();
		zaman = ZamanCevir(zaman,sure);
		
		System.out.println(zaman[0]+" Saat");
		System.out.println(zaman[1]+" Dakika");
		System.out.println(zaman[2]+" Saniye");
	}
	
	public static int [] ZamanCevir(int zaman[],int sure) {
		for(int i=0;i<zaman.length;i++) {
			switch(i) {
			case 0: zaman[i] = sure/3600;
					break;
			case 1: zaman[i] = (sure-(zaman[0]*3600))/60;
					break;
			case 2: zaman[i] = sure-((zaman[0]*3600)+zaman[1]*60);
					break;
			}
		}
		return zaman;
	}
}
