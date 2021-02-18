import java.util.Random;
public class Deste{
    private static final int Kart_sayisi = 52;
    private Kart deste [] = new Kart[Kart_sayisi];
    int i;
    private int sonraki;
    private static final Random rand = new Random();
    
    public Deste(){
        String No [] = {"As","Papaz","Kiz","Vale","Iki","Uc",
        "Dort","Bes","Alti","Yedi","Sekiz","Dokuz","On"};
        String Tur [] = {
            "Kupa","Maca","Karo","Sinek"};
        
        for(i=0;i<deste.length;i++){
            deste[i] = new Kart(No[i%13],Tur[i/13]);
        }
    }
    
    public Kart Dagit(){
        if(sonraki<deste.length)
            return deste[sonraki++];
        else
            return null;
    }
    
    public void Karistir(){
        int birinci;
        int siradaki=0;
        
        for(birinci=0;birinci<deste.length;birinci++){
            int sayi = rand.nextInt(Kart_sayisi);
            Kart temp = deste[birinci];
            deste[birinci]=deste[sayi];
            deste[sayi]=temp;
        }
    }
}