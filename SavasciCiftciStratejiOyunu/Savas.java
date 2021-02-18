import java.util.*;
public class Savas {

	public static void main(String[] args) {
	    Avatar Oyuncu1[] = new Avatar[5];
	    Avatar Oyuncu2[] = new Avatar[5];
	    Random rand = new Random();
	    int guc,tur;
	    int puan1=0,puan2=0;
	    
	    for (int i=0;i<Oyuncu1.length;i++ ){
	        int tipSec = rand.nextInt(2);
            int gucSec = rand.nextInt(10);
            Oyuncu1[i] = new Avatar();
            Oyuncu1[i].SetTur(tipSec);
            Oyuncu1[i].SetGuc(gucSec);
            } 
	    
	    for (int i=0;i<Oyuncu2.length;i++ ){
	        int tipSec = rand.nextInt(2);
            int gucSec = rand.nextInt(10);
            Oyuncu2[i] = new Avatar();
            Oyuncu2[i].SetTur(tipSec);
            Oyuncu2[i].SetGuc(gucSec);
            } 
	    
	    for (int i=0;i<Oyuncu1.length;i++ ){
	        System.out.println("Oyuncu1 tur:"+Oyuncu1[i].GetTur()+" ,guc:"+Oyuncu1[i].GetGuc());
	    } 
	    
	    System.out.println("");
	    for (int i=0;i<Oyuncu2.length;i++ ){
	        System.out.println("Oyuncu2 tur:"+Oyuncu2[i].GetTur()+" ,guc:"+Oyuncu2[i].GetGuc());
	    }
	    
	    for(int i=0;i<Oyuncu1.length;i++) {
	    	if(Oyuncu1[i].GetTur()==Oyuncu2[i].GetTur()){
	    		//Turleri esitse guc farki puana eklenir
	    		if(Oyuncu1[i].GetGuc()>Oyuncu2[i].GetGuc())
	    			puan1+=Oyuncu1[i].GetGuc()-Oyuncu2[i].GetGuc();
	    		else
	    			puan2+=Oyuncu2[i].GetGuc()-Oyuncu1[i].GetGuc();
	    	}
	    	else if(Oyuncu1[i].GetTur()>Oyuncu2[i].GetTur())//Turleri farkliysa savasci>ciftci
	    		puan1+=10;
	    	else
	    		puan2+=10;
	    	
	    }
	    
	    System.out.println("\nOyuncu1 puani:"+puan1+" Oyuncu2 puani:"+puan2);
	    
	    if(puan1>puan2)
	    	System.out.println("Kazanan 1. oyuncu");
	    else if(puan2>puan1)
	    	System.out.println("Kazanan 2. oyuncu");
	    else
	    	System.out.println("Berabere");
	    
	}

}
