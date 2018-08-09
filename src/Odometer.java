import java.util.HashMap;
import java.util.Map;

public class Odometer {
    Map<Integer,Integer> odometerValues=new HashMap<>();
    int digits;

    Odometer(int digits){
        this.digits=digits;
        //code for updating map
    }



    private int getKeyfromValue(int value){
        for(Map.Entry<Integer,Integer> entry : odometerValues.entrySet()){
            if(entry.getValue() == value)
                return entry.getKey();
        }
        return -1;
    }
    private int getValuefromKey(int key){
        for(Map.Entry<Integer,Integer> entry : odometerValues.entrySet()){
            if(entry.getKey() == key){
                return entry.getValue();
            }
        }
        return -1;
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
