
public class Araba {
	private String model;
    private int bas_km,bitis_km,ucret;
    
    public Araba(String m){
        model=m;
        if(model=="Model1")
            ucret=100;
        else
            ucret=150;
    }
    
    public void SetBasKm(int km1){
        bas_km=km1;
    }
    
    public void SetBitisKm(int km2){
        bitis_km=km2;
    }
    
    public int UcretHesapla(Araba a){
        int topkm;
        topkm = a.bitis_km-a.bas_km;
        return topkm*a.ucret;
    }

}
