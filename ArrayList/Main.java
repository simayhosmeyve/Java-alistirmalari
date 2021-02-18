import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> items =new ArrayList<Integer>();
		items.add(3);
		items.add(7);
		items.add(9);
		items.add(2);
		items.add(5);
		items.add(5);
		items.add(8);
		items.add(5);
		items.add(6);
		items.add(3);
		items.add(4);
		items.add(7);
		items.add(3);
	    items.add(1);
	
	    
	    int son =items.size();
	    
	    if((son%2)!=0)
	        items.remove(son-1);
	    
	     
	    int i;
	    for (i=0;i<son;i=i+2) {
	        if(items.get(i)>items.get(i+1)){
	            items.remove(i);
	            items.add(i,-1);
	            items.remove(i+1);
	            items.add(i+1,-1);
	        }
	    }
	    
	    int j=0;
	    while(j<items.size()+1){
	            items.remove(Integer.valueOf(-1));
	       j++;
	    }
	    System.out.printf("%s",items);
	}
}
