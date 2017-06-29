import java.awt.List;
import java.util.ArrayList;

public class almostIncreasingSequence {
	boolean almostIncreasingSequence(int[] sequence) 
	{
	    boolean increase = true;
	    List<Integer> list = new ArrayList<>();
	    for (int a :sequence ) 
	    {
	        list.add(a); 
	    }
	    if(list.size()==1)
	    {
	        return false;
	    }
	    for (int i = 0;i < list.size()-1 ;i++ ) 
	    {
	        if (list.get(1)<=list.get(0)) 
	        {
	            list.remove(0);
	            break;    
	        }
	        if(list.get(i+1)<=list.get(i)) 
	        {
	            if (list.get(i+1)>list.get(i-1)) 
	            {
	                list.remove(i); 
	            }
	            else
	            {
	                list.remove(i+1);
	            }
	            break;
	        } 
	    }

	    for (int i =0;i<list.size()-1 ;i++ ) 
	    {
	        if (list.get(i+1)<list.get(i) || list.get(i+1)==list.get(i) ) 
	        {
	            increase = false;
	        }    
	    }
	    return increase;
	}
}
