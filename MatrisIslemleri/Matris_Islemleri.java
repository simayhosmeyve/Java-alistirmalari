import java.util.*;

public class Main
{
public static int[][] randomMatris(int satir,int sutun){
    int matris[][]=new int[satir][sutun];
    int i,j;
    Random rand = new Random(); 
    for (i=0;i<satir;i++){
        for (j=0;j<sutun;j++){
            matris[i][j]=(int)(Math.random()*10);
        }
    }
    return matris;
}

public static int[][] matrisTopla(int matris1[][],int matris2[][]){
    int satir=matris1.length;
    int sutun=matris1[0].length;
    int toplamMatris[][]=new int[satir][sutun];
    int i,j;
    for (i=0;i<satir;i++){
        for (j=0;j<sutun;j++){
            toplamMatris[i][j]=matris1[i][j]+matris2[i][j];
        } 
    } 

    return toplamMatris;
}

public static int[][] matrisTranspoz(int[][] matris){
    int satir=matris.length;
    int sutun=matris[0].length;
    int transpozMatris[][]=new int[sutun][satir];
    int i,j;
    for (i=0;i<satir;i++){
        for (j=0;j<sutun;j++){
            transpozMatris[j][i]=matris[i][j];
        }
    }
    return transpozMatris;
}
public static int[][] matrisCarp(int matris1[][],int matris2[][]){
    int satir1=matris1.length;
    int sutun1satir2=matris1[0].length;
    int sutun2=matris2[0].length;
    int carpimMatris[][]=new int [satir1][sutun2];
    int toplam=0;
    for(int i=0;i<satir1;i++){
        for (int j=0;j<sutun2;j++){
            for(int k=0;k<sutun1satir2;k++){
                toplam+=matris1[i][k]*matris2[k][j];
            }
            carpimMatris[i][j]=toplam;
            toplam=0;
        } 
    }
    
    return carpimMatris;
}

public static void Yazdir(int[][] matris){
    for (int satir=0;satir<matris.length;satir++){
        int sutun=0;
        while(sutun<matris[satir].length){
            System.out.print(matris[satir][sutun]+" ");
            sutun++;
        } 
       System.out.println("\t");
    } 
   System.out.println("---------");
}

public static void main(String[] args) {
		int[][] matris1 = randomMatris(3,4);
		Yazdir(matris1);
		int[][] matris2 = randomMatris(3,4);
		Yazdir(matris2);
		int[][] matris3 = matrisTopla(matris1,matris2);
		System.out.println("Matris Topla:");
		Yazdir(matris3);
		int[][] matris4 = matrisTranspoz(matris3);
		System.out.println("Transpoz:");
		Yazdir(matris4);
		int[][] matrisc1 = randomMatris(3,4);
		Yazdir(matrisc1);
		int[][] matrisc2 = randomMatris(4,2);
		Yazdir(matrisc2);
		int[][] matris5 = matrisCarp(matrisc1,matrisc2);
		System.out.println("Matris Çarp:");
		Yazdir(matris5);
	}
}
