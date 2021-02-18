public class Kart{
    private String KartNo;
    private String KartTur;
    
    public Kart(String No,String Tur){
        KartNo=No;
        KartTur=Tur;
    }
    
    public String toString(){
        return KartTur + " " + KartNo;
    }
}