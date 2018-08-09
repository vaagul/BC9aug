import java.util.HashMap;
import java.util.Map;

public class Odometer {
    Map<Integer,Integer> odometerValues=new HashMap<>();
    int digits;

    Odometer(int digits){
        this.digits=digits;
        //code for updating map
    }

     public int getNext(int currValue,int offset){
    	int size=odometerValues.size();
    	int value;
    	int index=getKeyfromValue(currValue);
    	value=getValuefromKey(index+offset)%size;
    	return value;
    }
	public int getPrevious(int currValue,int offset){
		int size=odometerValues.size();
    	int value;
    	int index=getKeyfromValue(currValue);
    	value=getValuefromKey(index-offset+size)%size;
    	return value;
    }

    public int getDifference(int n1,int n2){
    	
    	int diff=Math.abs(getKeyfromValue(n1)-getKeyfromValue(n2));
        return diff;
    }
}
